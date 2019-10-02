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
public class Vendedor extends Funcionario {

    private double totalvendas;

    public Vendedor() {
        this("", 0, 0);
    }

    public Vendedor(String nome, double totalvendas, double salario) {
        super(nome, salario);
        this.totalvendas = totalvendas;
    }

    @Override
    public String getNome() {
        return super.nome+" (VENDEDOR)";
    }

    @Override
    public double getSalario() {
        return super.salario + (totalvendas*0.02);
    }

}
