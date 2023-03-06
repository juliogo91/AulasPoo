/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Usuario
 */
public class Cilindro {
 //ATRIBUTOS 
    private float raio = 0;
    private float altura = 0;

    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) throws Exception {//ESSE É UM MÉTODO LANÇADOR DE EXCEÇÕES
       if (raio <=0)throw new Exception("Raio não pode ser <=0");//CONSERTAR VALOR NEGATIVO DO RAIO
        this.raio = raio;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) throws Exception {
       if(altura <=0)throw new Exception("Altura não pode ser <=0");
        this.altura = altura;
    }
    //MÉTODOS
    public float calcAreaLateral(){
        return(float)(2 * Math.PI * raio * altura); 
    }
    public float calcAreaTotal(){
        return(float)(2* Math.PI * raio * (altura+raio));
    }
    public float calcVolume(){
        return(float) (Math.PI * raio * raio * altura);
    }
}
