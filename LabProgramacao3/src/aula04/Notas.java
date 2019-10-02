/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula04;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Quemuel
 */
public class Notas {
    
    public static void main(String[] args) {
        
        
        double notas[] = new double[5], soma = 0, temp;
        String resultado = "Notas em ordem decrescente: \n";
        
        for (int i = 0; i < notas.length; i++) {
            notas[i] = Double.parseDouble(JOptionPane.showInputDialog(null,"Informe uma nota"));
            soma += notas[i];
            
        }
        
        Arrays.sort(notas);
        int i = 0;
        while(i != notas.length-i-1){
                
            temp = notas[i];
            notas[i] = notas[notas.length-i-1];
            notas[notas.length-i-1] = temp;
            i++;
        }
        
        for(double vlr: notas){
            
            resultado += vlr + ", ";
        }
        
        JOptionPane.showMessageDialog(null,resultado+"\nA média das notas foi "+(soma/notas.length));
    }
}
