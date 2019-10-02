/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula12;

/**
 *
 * @author Quemuel
 */
public class AlunoGraduacao extends Aluno{
    
     private String curso;
    
    //construtor padrão
    public AlunoGraduacao(String nome, double nota1,double nota2){
        super(nome,nota1,nota2);
    }
    
    public AlunoGraduacao(String nome, double nota1,double nota2,String curso){
        super(nome,nota1,nota2);
        this.curso = curso;
    }
    
    //polimorfismo por sobreposição
    @Override
    public double getMedia(){
        return(super.nota1*0.4+super.nota2*0.6);
    }   

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    //polimosfismo por sobreposição
    @Override
    public  String toString(){
        return "\nAluno Graduação\n".toUpperCase()+super.toString()+"Curso: " + getCurso();
    }
    
}
