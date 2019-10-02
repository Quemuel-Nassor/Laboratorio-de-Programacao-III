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
public class Potencia {
    
    public static void main(String args[]){
        
      int vlu = 0;
      double resp;
      DecimalFormat rst = new DecimalFormat("###,##0.00");
      
      while(vlu != 1){
          
          resp = Math.pow((Double.parseDouble(JOptionPane.showInputDialog(null,"Informe um número :"))),(Double.parseDouble(JOptionPane.showInputDialog(null,"Informe um expoente para a potenciação :"))));
          JOptionPane.showMessageDialog(null,"O resultado da potencição é: "+rst.format(resp));
          vlu = JOptionPane.showConfirmDialog(null,"Deseja inserir novos valores?");
      }
    }
}
