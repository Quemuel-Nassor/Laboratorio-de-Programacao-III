/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula09;

/**
 *
 * @author 828461
 */
public class BrinquedoTest {
    
    public static void main(String[] args) {
        
        Brinquedo novo = new Brinquedo();
        novo.setFaixaEtaria("0 a 3");
        novo.setNome("teste");
        novo.setPreco(10.00);
        System.out.println(novo);
        
        Brinquedo domino = new Brinquedo("dominó");
        domino.setFaixaEtaria("acima de 10");
        domino.setPreco(40.00);
        System.out.println(domino);
    }
}
