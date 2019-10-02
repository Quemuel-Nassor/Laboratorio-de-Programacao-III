/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula11;

/**
 *
 * @author Quemuel
 */
public class PessoaTeste {
    
    public static void main(String[] args) {
    
        PessoaFisica pf1 = new PessoaFisica();
        pf1.setNome("João da Silva");
        pf1.setEndereco("Av. IX de Julho, 1234");
        pf1.setCPF("123.456.789-00");
        pf1.setRG("12.345.678-9");
        System.out.println(pf1);
        
        PessoaFisica pf2 = new PessoaFisica("Ana Maria","Rua 1 de abril, 321","987.654.321-00","98.765.432-1");
        System.out.println(pf2);
        
        PessoaJuridica pj3 = new PessoaJuridica("Oliveira & Silva atomações LTDA","Rua Atibaia, 145","218312312","2764872u1");
        System.out.println(pj3);
        
        Aluno al1 = new Aluno("Quemuel","Rua João Clapp, 1115","987.654.321-00","98.765.432-1",828461,"Eng. Computação");
        System.out.println(al1);
        
    }
}
