/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula06;

/**
 *
 * @author Quemuel
 */
public class Calc {
    
    //atributos
    public int vlr;
     
    //métodos
    public double raizQuad(){
       return Math.sqrt(vlr);
    }
    
    public double pCubo(){
       return Math.pow(vlr,3);
    }
    
    public double pQuad(){
        return Math.pow(vlr,2);
    }
    
    @Override
    public String toString(){
        return String.format("Raiz quadrada: %.1f\nQuadrado: %.1f\nCubo: %.1f\n",raizQuad(),pQuad(),pCubo());
    }
}
