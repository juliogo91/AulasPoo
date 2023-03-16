/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Usuario
 */
public class ContaPoupanca {
      //atributos
    private String nomeDoCliente = "";
     private int agenciaBanco = 0;
    private int numeroDaConta = 0;
    private float saldoConta = 0;
    
    public ContaPoupanca(String nomeDoCliente, 
    int agenciaBanco, int numeroDaConta,float saldoConta) throws Exception{//CONSTRUTOR
        if(agenciaBanco <= 0)throw new Exception("O número da agência não pode ser negativo");
        this.agenciaBanco = agenciaBanco;
        if(numeroDaConta <= 0)throw new Exception("O número da conta não pode ser negativo");
         this.numeroDaConta = numeroDaConta;
         if(saldoConta <=0 )throw new Exception("O valor do depósito não pode ser negativo");
         if(saldoConta < 1000)throw new Exception("A conta não pode ser criada com depósito inferior a 1000");
         this.saldoConta = saldoConta;
         this.nomeDoCliente = nomeDoCliente;
    }
      //MÉTODOS
     public void depositarDinheiro(float valorDepositado) throws Exception{
         //if(valorDepositado < 1000)throw new Exception("A conta não pode ser criada com depósito inferior a 1000");   
         if(valorDepositado <= 0) throw new Exception("O valor do depósito não pode ser negativo!");
         saldoConta += valorDepositado;//saldoConta = saldoConta + valorDepositado;
     }
    
     public void sacarDinheiro(float valorSacado) throws Exception{
        if(valorSacado > saldoConta)throw new Exception("O valor do saque não pode ser maior que o saldo!");
        if(valorSacado <= 0)throw new Exception("Verifique seu saldo e saque novamente!");
        saldoConta -= valorSacado;//saldoConta = saldoConta - valorSacado;
    }
    public float emitirSaldo(){
        return saldoConta;
    }
    
    public String getNomeDoCliente() {
        return nomeDoCliente;
    }

    public void setNomeDoCliente(String nomeDoCliente) {
        this.nomeDoCliente = nomeDoCliente;
    }

    public int getAgenciaBanco() {
        return agenciaBanco;
    }

    public void setAgenciaBanco(int agenciaBanco) throws Exception {
        if(agenciaBanco <= 0)throw new Exception("O número da agência não pode ser negativo");
        this.agenciaBanco = agenciaBanco;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) throws Exception {
        if(numeroDaConta <= 0)throw new Exception("O número da conta não pode ser negativo");
        this.numeroDaConta = numeroDaConta;
    }

    public float getSaldoConta() {
        return saldoConta;
    }

    public void setSaldoConta(float saldoConta) {
        this.saldoConta = saldoConta;
    }
      
}
   
     
         
