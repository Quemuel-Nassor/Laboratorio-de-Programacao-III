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
public class Circulo extends Forma{
    
    //atributos de Circulo
    private double raio;
    
    //construtor padrão
    public Circulo(){
       this.raio = 0;
    }
    
    //construtor sobrecarregado
    public Circulo(double raio){
       this.raio = raio;
    }
    
    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public String getNome() {
        return "Circulo";
    }

    @Override
    public double getArea() {
        return Math.PI*(Math.pow(raio,2));
    }
    
    
    
}
