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
public class Gerente extends Funcionario{
    
    //defifindo a contante GRATIFICACAO
    private final double GRATIFICACAO;
  
    public Gerente(){
        this("",0);
    }
    
    public Gerente(String nome, double salario){
        super(nome,salario);
        this.GRATIFICACAO = 500.00;
    }
    
    @Override
    public String getNome() {
        return super.nome+ " (GERENTE)";
    }

    @Override
    public double getSalario() {
        return super.salario + this.GRATIFICACAO;
    }
}
