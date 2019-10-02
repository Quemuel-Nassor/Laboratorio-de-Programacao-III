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
public class FuncionarioTest {
    
    public static void main(String[] args) {
        
        //Instanciando o objeto e chamando o construtor padrão
        Funcionario joao = new Funcionario();
        System.out.println(joao);
        joao.setNome("João da Silva");
        joao.setFuncao("Estagiário");
        joao.setSalario(1250);
        System.out.println(joao);
        
        Funcionario jose = new Funcionario("Jose Antonio");
        jose.setFuncao("Programador");
        jose.setSalario(2000.00);
        System.out.println(jose);
        
        Funcionario maria = new Funcionario("Maria Antonieta","Costureira");
        maria.setSalario(2000.00);
        System.out.println(maria);
        
        Funcionario wesley = new Funcionario("Wesley Mendes","Torneiro",2500);
        System.out.println(wesley);
        
    }
}
