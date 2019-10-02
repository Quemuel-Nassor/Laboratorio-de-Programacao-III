/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula10;

/**
 *
 * @author Quemuel
 */
public class Retangulo {
    
    //atributos
    private double comprimento;
    private double largura;
    
    //métodos
    public double getPerimetro(){
        return (getComprimento()*2+getLargura()*2);
    }
    
    public double getArea(){
        return (getComprimento()*getLargura());
    }
    
    //construtor padrão
    public Retangulo() {
        //this.comprimento = 0;
        //this.largura = 0;
        this(0,0);
    }
    
    //construtor sobrecarregado
    public Retangulo(double comprimento) {
        //this.comprimento = 0;
        //this.largura = 0;
        this(comprimento,0);
    }
    
    public Retangulo(double comprimento, double largura) {
        setComprimento(comprimento);
        setLargura(largura);
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        
        if((0.0 <= comprimento) && comprimento <= 20.0){
            this.comprimento = comprimento;
        }
        
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        if((0.0 <= largura) && largura <= 20.0){
            this.largura = largura;
        }
    }

    @Override
    public String toString() {
        return 
                String.format("Comprimento = %.2f, ", getComprimento())+
                String.format("Largura = %.2f", getLargura())+
                String.format("\nÁrea = %.2f, ", getArea())+
                String.format("Perímetro = %.2f", getPerimetro());
    }

    
    
    
}
