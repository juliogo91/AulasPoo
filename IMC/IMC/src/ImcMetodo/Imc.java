/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ImcMetodo;

/**
 *
 * @author Usuario
 */
public class Imc {

    //ATRIBUTOS
    private int peso = 0;
     private float altura = 0;

    public int getPeso() {
        return peso;
    }
    public void setPeso(int peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;                         //FORMATAR CÓDIGO alt + shift + f
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
     //MÉTODO
    public float calcImc() {
        return peso / (altura * altura);
    }
}
