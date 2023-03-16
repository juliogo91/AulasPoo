/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Usuario
 */
public class ContraCheque {

    //ATRIBUTOS
    private int matriculaDoFuncionario = 0;
    private String nomeDoFuncionario = "";
    private int numeroDeDependentes = 0;
    private int producao = 0;
    private float salarioBase = 0;

    //CONSTRUTOR
    public ContraCheque(int matriculaDoFuncionario,
            String nomeDoFuncionario, int numeroDeDependentes,
            int producao,
            float salarioBase) throws Exception {
        if (matriculaDoFuncionario <= 0) {
            throw new Exception("O número da matrícula não pode ser negativo");
        }
        this.matriculaDoFuncionario = matriculaDoFuncionario;
        this.nomeDoFuncionario = nomeDoFuncionario;
        if (numeroDeDependentes < 0) {
            throw new Exception("A quantidade de dependentes não pode ser negativa");
        }
        this.numeroDeDependentes = numeroDeDependentes;
        if (producao < 0) {
            throw new Exception("Verifique se o número digitado é positivo!");
        }
        this.producao = producao;
        if (salarioBase <= 0) {
            throw new Exception("O valor inserido do salário base precisa ser positivo!");
        }
        this.salarioBase = salarioBase;
    }

    //MÉTODO DE CALCULAR O SALÁRIO BRUTO
    public float calcularSalarioBruto() {
        return salarioBase + calcularGratificacaoPorProducao();
    }

    //MÉTODO DE CALCULAR A GRATIFICAÇÃO
    public float calcularGratificacaoPorProducao() {
        if (producao <= 1000) {
            return 500;
        }
        if (producao < 200) {
            return 1250;
        }
        return 2250;
    }

    //MTD CÁLCULO SALÁRIO LÍQUIDO
    public float calcularSalarioLiquido() {
        return calcularSalarioBruto() - calcularImpostoDoINSS() - calcularImpostoDoIRPF();
    }

    //MTD CÁLCULO INSS
    public float calcularImpostoDoINSS() {
        float salario = calcularSalarioBruto();
        if (salario <= 1302.00) {
            return (float) (salario * 0.075);
        }
        if (salario > 1302.00 && salario <= 2571.29) {
            return (float) (salario * 0.09);
        }
        if (salario > 2571.30 && salario < 3856.94) {
            return (float) (salario * 0.12);
        }
        return (float) (salario * 0.14);
    }

    //MTD CALCULAR DESCONTO DO DEPENDENTE
    public float calcularDescontoDoDependente() {
        return (float) (numeroDeDependentes * 123.00);
    }

    //MTD CÁLCULO IRPF
    public float calcularImpostoDoIRPF() {
        float descontoPorDependente = calcularDescontoDoDependente();
        float impostoIRPF = 0;
        float salario = calcularSalarioBruto();
        if (salario <= 1903.98) return 0;//tentar tratar a exceção depois
           
        if (salario >= 1903.99 && salario <= 2826.65) {
            impostoIRPF = (float) (salario * 0.075) - descontoPorDependente;
            if (impostoIRPF < 0) {
                return 0;
            }
        } else {
            return impostoIRPF;
        }
        if (salario >= 2826.66 && salario <= 3751.05) {
            impostoIRPF = (float) (salario * 0.15) - descontoPorDependente;
            if (impostoIRPF < 0) {
                return 0;
            } else {
                return impostoIRPF;
            }
        }
        if (salario >= 3751.06 && salario <= 4664.68) {
            impostoIRPF = (float) (salario * 0.225) - descontoPorDependente;
            if (impostoIRPF < 0) {
                return 0;
            }
        } else {
            return impostoIRPF;
        }
        impostoIRPF = (float) (salario * 0.275) - descontoPorDependente;
        if (impostoIRPF < 0) {
            return 0;
        } else {
            return impostoIRPF;
        }
        
    }

    public int getMatriculaDoFuncionario() {
        return matriculaDoFuncionario;
    }

    public void setMatriculaDoFuncionario(int matriculaDoFuncionario) throws Exception {
        if (matriculaDoFuncionario <= 0) {
            throw new Exception("O número da matrícula não pode ser negativo");
        }
        this.matriculaDoFuncionario = matriculaDoFuncionario;
    }

    public String getNomeDoFuncionario() {
        return nomeDoFuncionario;
    }

    public void setNomeDoFuncionario(String nomeDoFuncionario) {
        this.nomeDoFuncionario = nomeDoFuncionario;
    }

    public int getNumeroDeDependentes() {
        return numeroDeDependentes;
    }

    public void setNumeroDeDependentes(int numeroDeDependentes) throws Exception {
        if (numeroDeDependentes < 0) {
            throw new Exception("A quantidade de dependentes não pode ser negativa");
        }
        this.numeroDeDependentes = numeroDeDependentes;
    }

    public int getProducao() {
        return producao;
    }

    public void setProducao(int producao) throws Exception {
       if (producao < 0) {
            throw new Exception("Verifique se o número digitado é positivo!");
        }
        this.producao = producao;
    }

    public float getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(float salarioBase) throws Exception {
       if (salarioBase <= 0) {
            throw new Exception("O valor inserido do salário base precisa ser positivo!");
        }
        this.salarioBase = salarioBase;
    }
}
