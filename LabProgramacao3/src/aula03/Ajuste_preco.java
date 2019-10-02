/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula03;

import javax.swing.JOptionPane;

/**
 *
 * @author Quemuel
 */
public class Ajuste_preco {
    
    public static void main(String args[]){
        
        double vlr = 1, desconto;
        
        
        while(vlr != 0){
            
            vlr = Double.parseDouble(JOptionPane.showInputDialog(null,"Informe o valor do produto: "));
            desconto = Math.round(vlr*1.12);
            
            if(vlr != 0){
                
                JOptionPane.showMessageDialog(null,"O valor do produto com desconto será de: "+ desconto);
            
            }
        }
    }
}
