//classe abstrata
package aula14;

/**
 *
 * @author Quemuel
 *///classe abstrata
public abstract class Forma {
   
    //métodos abstratos para posterior implementação
    public abstract String getNome();
    public abstract double getArea();
   
    //toString
    @Override
    public String toString(){
        
        return "Forma = " + getNome() + "\nArea = " + String.format("%.2f\n",getArea());
    
    }
}
