package fatec.poo.model;

/**
 *
 * @author Marcio Sousa
 */
public class Cliente extends Pessoa {
    private double limiteCredito;
    private double totalCompras;

    public Cliente(double limiteCredito, int codigo, String nome) {
        super(codigo, nome);
        this.limiteCredito = limiteCredito;
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public double getTotalCompras() {
        return totalCompras;
    }
    
    public void addCompra(double valorCompra){
        totalCompras += valorCompra;
    }
    
    public double calcLimiteDisponivel(){
        return limiteCredito - totalCompras;
    }
    
    
}
