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
public class Desconto {

    public static void main(String args[]) {

        double vlr = 0, desconto = 0;
        String nome;

        vlr = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor do produto: "));

        nome = JOptionPane.showInputDialog(null, "Informe o nome do produto: ");

        if (vlr >= 50 && vlr < 200) {

            desconto = vlr * 0.95;

        } else if (vlr >= 200 && vlr < 500) {

            desconto = vlr * 0.96;

        } else if (vlr >= 500 && vlr < 1000) {

            desconto = vlr * 0.97;

        } else if (vlr > 1000) {

            desconto = vlr * 0.98;

        } else if (vlr <= 0) {

            JOptionPane.showMessageDialog(null, "O valor digitado não é válido", "Aviso", JOptionPane.WARNING_MESSAGE);

        } else {

            desconto = vlr;

        }

        JOptionPane.showMessageDialog(null, "O valor com desconto para o produto " + nome + " será de " + desconto);
    }

}
