/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo05;

/**
 *
 * @author 828461
 */
public class Aluno {
    private String codigo;
    private String nome;
    private String curso;

    public Aluno() {
    }

    public Aluno(String codigo, String nome, String curso) {
        this.codigo = codigo;
        this.nome = nome;
        this.curso = curso;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    
}
