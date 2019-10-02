/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula10;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Quemuel
 */
public class RetanguloTeste {
    public static void main(String[] args) {
        
        //Lista dinâmica de Retângulos onde cada elemento é um objeto da classe Retângulo
        List<Retangulo> lista = new ArrayList<>();
        
        lista.add(new Retangulo(2,3));
        lista.add(new Retangulo(3,6));
        lista.add(new Retangulo(4,2));
        lista.add(new Retangulo(5,8));
        
        System.out.println("Total de retângulos: "+lista.size());
        lista.remove(1);//remove o objeto 1 da lista
        System.out.println("Total de retângulos: "+lista.size());
        
        for(Retangulo r: lista){
            System.out.println(r);
        }
    }
}
