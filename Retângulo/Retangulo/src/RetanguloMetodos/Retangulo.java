/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RetanguloMetodos;

/**
 *
 * @author Usuario
 */
public class Retangulo {

    private float comprimento = 0;
    private float largura = 0;

    public float getComprimento() {
        return comprimento;
    }

    public void setComprimento(float comprimento) throws Exception {
        if (comprimento <= 0)throw new Exception("Comprimento não pode ser <= 0");
        this.comprimento = comprimento;
    }

    public float getLargura() {
        return largura;
    }

    public void setLargura(float largura) throws Exception {
        if (largura <= 0)throw new Exception("Largura não pode ser <= 0");
        this.largura = largura;
    }

    public float calcArea() {
        return (float) (largura * comprimento);
    }
    public float calcPerimetro(){
        return (float) (largura * 2) + (comprimento * 2);
    }
}
