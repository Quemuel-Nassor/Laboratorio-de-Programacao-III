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
public class PessoaJuridica extends Pessoa{
    
    //atributos
    private String CNPJ;
    private String incricao;
    
    //construtor padrão
    public PessoaJuridica(){
        this("","","","");
    }
    
    //construtor sobrecarregado
    public PessoaJuridica(String nome, String endereco, String CNPJ, String incricao) {
        super(nome, endereco);
        this.CNPJ = CNPJ;
        this.incricao = incricao;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getIncricao() {
        return incricao;
    }

    public void setIncricao(String incricao) {
        this.incricao = incricao;
    }

    @Override
    public String toString() {
        return super.toString() + "CNPJ: " + getCNPJ() + ",\nIncricao: " + getIncricao();
    }
    
    
    
    
}
