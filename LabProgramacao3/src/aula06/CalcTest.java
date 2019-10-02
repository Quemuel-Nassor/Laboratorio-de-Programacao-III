package aula06;

import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Quemuel
 */
public class CalcTest {
    
    public static void main(String[] args) {
        
        Calc num = new Calc();
        
        num.vlr = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe um número inteiro: "));
        JOptionPane.showMessageDialog(null,num.toString());
    }
    
}
