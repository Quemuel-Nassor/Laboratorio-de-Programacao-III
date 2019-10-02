/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula02;

import javax.swing.JOptionPane;

/**
 *
 * @author Quemuel
 */
public class Tabuada {
    
    public static void main (String args[]){
        
        double num;
        String msg = "";
        
        num = Double.parseDouble(JOptionPane.showInputDialog(null,"informe um número: "));
        
        for(int i = 1; i<=10; i++){
            
            msg += num + " x "+ i +" = "+(num*i)+"\n";
           
        }
        
        JOptionPane.showMessageDialog(null, msg, "Tabuada do " + num, JOptionPane.INFORMATION_MESSAGE);
        
    }
}
