/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 Regra do banco - a conta somente
pode ser criada mediante um deposito mínimo de R$ 1.000,00.
 * @author Usuario
 */
public class TestaContaPoupanca {
    
    //atributos
    private String nomeDoCliente = "";
    private int numeroDaConta = 0;
    private int agenciaBanco = 0;
    private float saldoConta = 0;
    
    public TestaContaPoupanca(String nomeDoCliente, 
            int numeroDaConta, int agenciaBanco, 
            float saldoConta) throws Exception{
       
        this.nomeDoCliente = nomeDoCliente;
        
        if(numeroDaConta <= 0)throw new Exception("número da conta não pode ser <=0");
        this.numeroDaConta = numeroDaConta;
        
        if(agenciaBanco <= 0)throw new Exception("número da agência não pode ser <=0");
        this.agenciaBanco = agenciaBanco;
       
        this.saldoConta = saldoConta;
    
    }

    public String getNomeDoCliente() {
        return nomeDoCliente;
    }

    public void setNomeDoCliente(String nomeDoCliente) {
        this.nomeDoCliente = nomeDoCliente;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) throws Exception {
        if(numeroDaConta <= 0)throw new Exception("número da conta não pode ser <=0");
        this.numeroDaConta = numeroDaConta;
    }

    public int getAgenciaBanco() {
        return agenciaBanco;
    }

    public void setAgenciaBanco(int agenciaBanco) throws Exception {
        if(agenciaBanco <= 0)throw new Exception("número da agência não pode ser <=0");
        this.agenciaBanco = agenciaBanco;
    }

    public float getSaldoConta() {
        return saldoConta;
    }

    public void setSaldoConta(float saldoConta) {
        this.saldoConta = saldoConta;
    }
     public float depositarDinheiro() throws Exception{
        
         if(saldoConta < 1000.0)throw new Exception("A conta não pode ser criada com depósito inferior a 1000");  
           return saldoConta++;
    }
     
    public float sacarDinheiro( float saldoConta){
        return saldoConta--;
    }
     public String emitirSaldoDaConta(float saldoConta) {
            return "Conta criada com sucesso!";
    }
}
