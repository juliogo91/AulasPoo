/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Metodos;

/**
 *
 * @author Usuario
 */
//atributo
public class Esfera {
    
 private float raio = 0;

    public float getRaio() {
        return raio;
    }
    public void setRaio(float raio) throws Exception{ //ESSE É UM MÉTODO LANÇADOR DE EXCEÇÕES
       if (raio <= 0)throw new Exception("Raio não pode ser <= 0"); //CONSERTAR VALOR NEGATIVO DO RAIO
        this.raio = raio;
    }
 //métodos
    public float calcAreaEsfera(){
        return (float)(4.0 * Math.PI * raio * raio);
    }
    public float calcVolumeEsfera(){
        return (float)((4.0/3.0) * Math.PI * Math.pow(raio, 3));
    }
}
