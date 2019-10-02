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
public class FormaTeste {
    public static void main(String[] args) {
        
        //polimorfismo
        Forma[] poliedro = new Forma[4];
        poliedro[0] = new Quadrado(5);
        poliedro[1] = new Triangulo(4,8);
        poliedro[2] = new Circulo(2);
        poliedro[3] = new Cilindro(8,2);
        
        //for each
        for(Forma i : poliedro){
            System.out.println(i);
        }
    }
}
