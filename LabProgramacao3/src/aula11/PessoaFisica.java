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
//PessoaFisica herda Pessoa
public class PessoaFisica extends Pessoa{
    
    //atributos
    private String CPF;
    private String RG;
    
    
    //construtor padrão
    public PessoaFisica() {
        this("","","","");
    }
    
    //construtor sobrecarregado
    public PessoaFisica(String nome, String endereco, String CPF, String RG) {
        //chamada ao construtor da classe pai
        super(nome, endereco);
        this.CPF = CPF;
        this.RG = RG;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    @Override
    public String toString() {
        return super.toString() + "CPF: " + getCPF() + ",\nRG: " + getRG() + '\n';
    }
    
    
    
}
