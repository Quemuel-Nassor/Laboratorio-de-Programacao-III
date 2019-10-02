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
public class Quadrado extends Forma{
    
    //atributos de Quadrado
    private double lado;
    
    //cosntrutor padrão
    public Quadrado(){
       this.lado = 0;
    }
    
    //construtor sobrecarregado
    public Quadrado(double lado){
       this.lado = lado;
    }
    
    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public String getNome() {
        return "Quadrado";
    }

    @Override
    public double getArea() {
        return Math.pow(lado,2);
    }
    
}
