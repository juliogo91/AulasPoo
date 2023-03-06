/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Usuario
 */
public class Cone {

    //ATRIBUTOS
    private float raio = 0;
    private float altura = 0;

    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) throws Exception {
        if (raio <= 0) {
            throw new Exception("RAIO NÃO PODE SER <= 0");
        }
        this.raio = raio;
    }

    public float getAltura() {
        return altura;
    }
    //ALT + SHIFT + F IDENTAÇÃO

    public void setAltura(float altura) throws Exception { //MÉTODO LANÇADOR DE EXCEÇÕES
        if (altura <= 0) {
            throw new Exception("ALTURA NÃO PODE SER <= 0");
        }
        this.altura = altura;
    }

    //MÉTODOS CTRL + I ATALHO PARA INSERIR O GET AND SET
    public float calcGeratriz() {
        //return(float) (Math.sqrt((altura * altura + raio * raio)));
        return (float) Math.sqrt(altura * altura) + (raio * raio);
    }
        //return (float)Math.PI * raio * calcGeratriz());
    public float calcAreaLateral() {
        return (float) (Math.PI * raio * calcGeratriz());
    }

    public float calcAreaTotal() {
        return (float) (Math.PI * raio * (calcGeratriz() + raio));//() chamando o parâmetro criado anteriormente, no caso o calcGeratriz
    }

    public float calcVolume() {
        return (float) (1.0 / 3.0 * Math.PI * raio * raio * altura);
    }
}
