//classe Triangulo
package aula14;

/**
 *
 * @author Quemuel
 */
public class Triangulo extends Forma{
    
    //atributos de Triangulo
    private double base;
    private double altura;
    
    //construtor padrão
    public Triangulo(){
        this.altura = 0;
        this.base = 0;
    }
    
    //construtor sobrecarregado
    public Triangulo(double altura, double base){
        this.altura = altura;
        this.base = base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String getNome() {
        return "Triangulo";
    }

    @Override
    public double getArea() {
        return (base * altura);
    }
    
    
}
