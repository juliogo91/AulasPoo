/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PiramideMetodos;

/**
 *
 * @author Usuario
 */
public class Piramide {
    //atributos
    private float base = 0;
    private float altura = 0;

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    //método
    public float calcVolume(){
        return  (float) (((1.0/3.0) * base) * altura);
    }
}
