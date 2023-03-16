/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Usuario
 */
public class TesteFuncionario {
    
	//ATB
	private int matriculaDoFuncionario = 0;
	private String nomeDoFuncionario = "";
	private int numeroDeDependentes = 0;
	private float salarioBase = 0;
	
	public TesteFuncionario(int matriculaDoFuncionario,
	String nomeDoFuncionario, int numeroDeDependentes,
	float salarioBase) throws Exception { //CONSTRUTOR
		
		this.matriculaDoFuncionario = matriculaDoFuncionario;
		this.nomeDoFuncionario = nomeDoFuncionario;
		if(numeroDeDependentes <= 0) throw new Exception("A quantidade de dependentes não pode ser < 0");
		this.numeroDeDependentes = numeroDeDependentes;
		this.salarioBase = salarioBase;
		}

	public int getMatriculaDoFuncionario() {
		return matriculaDoFuncionario;
	}

	public void setMatriculaDoFuncionario(int matriculaDoFuncionario) {
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
		if(numeroDeDependentes <= 0) throw new Exception("A quantidade de dependentes não pode ser < 0");
		this.numeroDeDependentes = numeroDeDependentes;
	}

	public float getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}
	//MÉTODOS
	public float calcularSalarioBruto(float salarioBruto, float gratificacaoPorProducao) {
		return salarioBruto = salarioBase + gratificacaoPorProducao;
	}
	public void calcularImpostoDoInss(double descontoDoInss, float salarioBruto) {
		if(salarioBruto <= 1302.00) descontoDoInss = salarioBruto * 7.5;
		if(salarioBruto >= 1302.01 && salarioBruto <= 2571.29) descontoDoInss = salarioBruto * 9.0;
		if(salarioBruto <= 2571.30 && salarioBruto <= 3856.94) descontoDoInss = salarioBruto * 12.0;
		if(salarioBruto > 3856.94) descontoDoInss = salarioBruto * 14.0;
	}
	public void calcularImpostoDoIrpf(double descontoDoIrpf, float salarioBruto) throws Exception {
		if(salarioBruto <= 1903.98 ) throw new Exception("Isento");
		if(salarioBruto >= 1903.99 && salarioBruto <= 2826.65) descontoDoIrpf = salarioBruto * 7.5;
		if(salarioBruto >= 2826.66 && salarioBruto <= 3751.05) descontoDoIrpf = salarioBruto * 15.0;
		if(salarioBruto >= 3751.06 && salarioBruto <= 4664.68) descontoDoIrpf = salarioBruto * 22.5;
		if(salarioBruto > 4664.68) descontoDoIrpf = salarioBruto * 27.5;
	}
	public void calcularDescontoDoDependente(double descontoDoIrpf, double quantidadeDeDependentes) {
		if(quantidadeDeDependentes > 0) descontoDoIrpf = quantidadeDeDependentes + 123.0;
	}
	public void calcularSalarioLiquido(float salarioBruto, double descontoDoIrpf, double descontoDoInss) {
		salarioBruto -= descontoDoInss;
		salarioBruto -= descontoDoIrpf;
	}
}

