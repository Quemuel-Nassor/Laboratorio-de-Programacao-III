/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula04;

import javax.swing.JOptionPane;

/**
 *
 * @author Quemuel
 */
public class Classificacao {
    
    public static void main(String[] args) {
        
        int idade = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe sua idade: ")),signal = -1;
        
        if((-1 < idade) && (idade < 3)){
            JOptionPane.showMessageDialog(null,"Você é um bebê!");
        } else if ((2 < idade) && (idade < 12)){
            JOptionPane.showMessageDialog(null,"Você é uma criança!");
        }else if((11 < idade) && (idade < 20)){
            JOptionPane.showMessageDialog(null,"Você é uma adolescente!");
        }else if((19 < idade) && (idade < 31)){
            JOptionPane.showMessageDialog(null,"Você é um jovem!");
        }else if((30 < idade) && (idade < 61)){
            JOptionPane.showMessageDialog(null,"Você é uma adulto!");
        }else if(60 < idade){
            JOptionPane.showMessageDialog(null,"Meu amigo você é um zumbi!!!");
        }
        
    }
}
