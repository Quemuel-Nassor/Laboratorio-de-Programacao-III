package aula08;

public class Pessoa {

    private String nome;
    private double peso;
    private double altura;
    public String usuario;
    public String senha;

    //Métodos SET = Enviar dados
    public void setNome(String nome) {
        if (nome.length() > 1) {
            this.nome = nome;
        } else {
            System.out.println("O tamanho do nome deve conter no mínimo dois caracteres.");
        }
    }

    public void setPeso(double peso) {
        if (peso > 0 && peso < 500) {
            this.peso = peso;
        } else {
            System.out.println("O peso informado não é válido.");
        }
    }

    public void setAltura(double altura) {
        if (altura > 0 && altura <= 2.10) {
            this.altura = altura;
        } else {
            System.out.println("A altura informada não é válida.");
        }
    }
    
    //Método GET = Retornar dados
    public String getNome(){
        if (this.nome != null){
            return this.nome.toUpperCase();
        }else{
            return this.nome;
        }
    }
    
    @Override
    public String toString() {
        return "Nome: " + this.nome + "\n"
                + "Peso: " + this.peso + "\n"
                + "Altura: " + this.altura + "\n"
                + "Usuário: " + this.usuario + "\n"
                + "Senha: " + this.senha + "\n";
    }

}
