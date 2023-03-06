/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PacienteMetodos;

/**
 *
 * @author Usuario
 */
public class Paciente {
    //ATRIBUTOS
     private String nomeCompleto = "";
    private int peso = 0;
    private float altura = 0;
    private String sexo = "";
    public String getNomeCompleto(){    
        return nomeCompleto;
    }
    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }
    public int getPeso() {
        return peso;
    }
    public void setPeso(int peso) {
        this.peso = peso;
    }
    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
    public String getSexo() {
        return sexo;
    }
    //Metodos
    public void setSexo(String sexo) {    
        this.sexo = sexo;
    }
    //Metodos
    public float calcularIMC() {
        return (peso / (altura * altura));
    }  

    public void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
