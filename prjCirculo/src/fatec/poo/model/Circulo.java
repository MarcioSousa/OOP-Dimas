package fatec.poo.model;

/**
 * @author Marcio Sousa
 */
public class Circulo {
    private double raio;
    
    public void setRaio(double a){
        raio = a;
    }
    
    public double getRaio(){
        return raio;
    }
    
    public double calcArea(){
        return (3.1415 * Math.pow(raio, 2));
    }
    
    public double calcPerimetro(){
        //C = 2 * π * r
        return (2 * 3.1415 * raio);
    }
    
    public double calcDiametro(){
        return (2 * raio);
    }
}
