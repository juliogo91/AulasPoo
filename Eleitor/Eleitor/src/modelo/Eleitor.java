/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.time.LocalDate;

/**
 *
 * @author Usuario
 */
public class Eleitor {
    
    //atributos
    private String nomeDoEleitor = "";
    private int anoDeNascimento = 0;
   
        //tratamento de exceção
    public Eleitor(String nomeDoEleitor, int anoDeNascimento) throws Exception{//public Eleitor()= construtor c/ parametros
        this.nomeDoEleitor = nomeDoEleitor;
        if(anoDeNascimento <= 0)throw new Exception("ano de nascimento não pode ser <= 0");
        this.anoDeNascimento = anoDeNascimento;
    }

    public String getNomeDoEleitor() {
        return nomeDoEleitor;
    }

    public void setNome(String nomeDoEleitor) {
        this.nomeDoEleitor = nomeDoEleitor;
    }

    public int getAnoDeNascimento() {
        return anoDeNascimento;
    }

    public void setAnoDeNascimento(int anoDeNascimento) throws Exception {
        if (anoDeNascimento <= 0) throw new Exception("ano de nascimento não pode ser <= 0");
       this.anoDeNascimento = anoDeNascimento;
    }
    //método
    public String calcularTipoDeEleitor(){
        LocalDate anoExato = LocalDate.now();
        int idade = (anoExato.getYear() - anoDeNascimento);
        if(idade < 16) return "Não eleitor";
        if(idade >= 16 && idade < 18) return "Eleitor facultativo";
        if(idade >= 18 && idade <= 65) return "Eleitor obrigatório";
        return "Eleitor facultativo";
    }
}
     
      
    

