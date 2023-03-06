/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

/**
 *
 * @author Usuario
 */
public class Paciente { //a classe só armazena os atributos quem irá fazer o cáculo é o seu objeto

    //Atributos
    private String nomeCompleto = " ";
    private int peso = 0;
    private float altura = 0;
    private String sexo = " ";
   
    public String getNomeCompleto() {
       return nomeCompleto;

    }

    public void setNomeCompleto(String nomeCompleto) { //parâmetro
        this.nomeCompleto = nomeCompleto; //atributo
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

    //Métodos
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public float calcularIMC() {
        return (peso / (altura * altura));
    }

}
