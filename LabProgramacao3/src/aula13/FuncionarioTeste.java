/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula13;

/**
 *
 * @author Quemuel
 */
public class FuncionarioTeste {
    public static void main(String[] args) {
        
        Vendedor v = new Vendedor("João da Silva",1000,6500);
        System.out.println(v);
        
        Gerente g = new Gerente("Ana Maria",2850);
        System.out.println(g);
        
        
    }
}
