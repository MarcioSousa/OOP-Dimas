package fatec.poo.model;

/**
 *
 * @author Marcio Sousa
 */
public class QuartoHotel {
    private int numQuarto;
    private double valorDiaria;
    private int numRg;
    private boolean situacao;
    private double totalFaturado;
    
    public void setSituacao(boolean situacao) {
        this.situacao = situacao;
    }
    
    public QuartoHotel(int numeroQuarto, double valorDiaria){
        this.numQuarto = numeroQuarto;
        this.valorDiaria = valorDiaria;
        situacao = false; //livre
        totalFaturado = 0;
    }
    
    public void reservar(int numeroRg){
        this.numRg = numeroRg;
        situacao = true;
    }
    
    public double liberar(int numeroDias){
        double valor;
        valor = this.valorDiaria * numeroDias;
        totalFaturado += valor;
        numRg = 0;
        situacao = false;
        return valor;
    }
    
    public boolean getSituacao() {
        return situacao;
    }

    public double getTotalFaturado() {
        return totalFaturado;
    }
    
}
