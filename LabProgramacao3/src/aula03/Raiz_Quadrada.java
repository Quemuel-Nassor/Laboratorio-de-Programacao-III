/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula03;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Quemuel
 */
public class Raiz_Quadrada {
    
    public static void main(String args[]){
     
       int resp = 0;
       double vlr;
       DecimalFormat round = new DecimalFormat("###,##0.00");
       
       while(resp != 1){
       
           vlr = Math.sqrt(Double.parseDouble(JOptionPane.showInputDialog(null,"Informe o número que deseja calcular a raiz quadrada: ")));
           JOptionPane.showMessageDialog(null,"O valor da raiz quadrada do valor digitado é: "+round.format(vlr));
           resp = JOptionPane.showConfirmDialog(null,"Deseja calcular a raiz de outro número? ");

       }
    }
}
