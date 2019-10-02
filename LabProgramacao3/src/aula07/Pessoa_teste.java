package aula07;

public class Pessoa_teste {

    public static void main(String[] args) {

        Pessoa joao = new Pessoa();

        //joao.nome = "J";
        joao.setNome("J");
        
        //joao.peso = 96;
        joao.setPeso(96);
        
        //joao.altura = 1.99;
        joao.setAltura(1.99);
        
        joao.usuario = "joao";
        joao.senha = "joao123";
        
        System.out.println(joao);
    }

}
