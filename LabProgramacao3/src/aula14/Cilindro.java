/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula14;

/**
 *
 * @author Quemuel
 */
public class Cilindro extends Forma{
    
    //atributos de Cilindro
    private double altura;
    private double raio;
    
    //construtor padrão
    public Cilindro(){
        this.altura = 0;
        this.raio = 0;
    }
    
    //construtor sobrecarregado
    public Cilindro(double altura, double raio){
        this.altura = altura;
        this.raio = raio;
    }
    
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public String getNome() {
        return "Cilindro";
    }

    @Override
    public double getArea() {
        return Math.PI*Math.pow(raio,2)*altura;
    }
    
    
}
