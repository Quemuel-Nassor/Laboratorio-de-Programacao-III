/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula02;

import static java.lang.StrictMath.pow;
import javax.swing.JOptionPane;

/**
 *
 * @author Quemuel
 */
public class CalculadoraIMC {
    
    public static void main(String args[]){
       
        double peso = 0, altura = 0,imc = 0;
        
        String valores;

        valores = JOptionPane.showInputDialog(null,"Informe seu peso: ");
        peso = Float.parseFloat(valores);


        valores = JOptionPane.showInputDialog(null,"Informe sua altura: ");
        altura = Float.parseFloat(valores);
        
        imc = peso/(pow(altura,2));
        
       JOptionPane.showMessageDialog(null,"O seu IMC é: "+ imc);
        
    }   
}
