package fatec.poo.model;

/**
 *
 * @author Marcio Sousa
 */
public class Retangulo {
    private double altura;
    private double base;
    
    public void setAltura(double a){
        altura = a;
    }
    
    public double getAltura(){
        return(altura);
    }
    
    public void setBase(double b){
        base = b;
    }
    
    public double getBase(){
        return(base);
    }
    
    public double calcArea(){
        return (base * altura);
    }
    
    public double calcPerimetro(){
        return (2 * (base + altura));
    }
    
    public double calcDiagonal(){
        return (Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2)));
    }
    
}
