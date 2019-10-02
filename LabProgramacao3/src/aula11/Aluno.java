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
public class Aluno extends PessoaFisica {
    
    //atributos
    private int codigo;
    private String curso;
    
    //métodos
    
    //construtor padrão
    public Aluno(){
        this("","","","",0,"");
    }
    
    //construtor sobrecarregado
    public Aluno(String nome, String endereco, String CPF, String RG, int codigo, String curso) {
        super(nome, endereco, CPF, RG);
        this.codigo = codigo;
        this.curso = curso;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return super.toString() + "Codigo: " + getCodigo() + "\nCurso: " + getCurso();
    }
    
    
}
