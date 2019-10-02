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
public class AlunoTeste2 {
    public static void main(String[] args) {
        
        Aluno vet[] = new Aluno[5];
        vet[0] = new Aluno("João",6.0,8.0);
        vet[1] = new AlunoGraduacao("Ana",6.0,8.0,"Engenharia da Computação");
        vet[2] = new AlunoGraduacao("José",7.5,9.0);
        vet[3] = new Aluno("Maria",6.8,7.0);
        vet[4] = new AlunoGraduacao("Antônio",7.0,4.0);
        
        //definir o curso do AlunoGraduação
       ((AlunoGraduacao)vet[2]).setCurso("Nutrição");
       for(Aluno a : vet){
           System.out.println(a);
       }
       
       //definir todos os AlunosGraduação como Eng. Computação
       for(Aluno a : vet){
           if(a instanceof AlunoGraduacao){
               ((AlunoGraduacao)a).setCurso("Engenharia da Computação");
           }
           System.out.println(a);
       }
    }   
}
