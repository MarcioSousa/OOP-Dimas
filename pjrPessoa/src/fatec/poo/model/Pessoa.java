package fatec.poo.model;

/**
 *
 * @author Marcio Sousa
 */
public abstract class Pessoa {
    private String nome;
    private int anoInscricao;
    private double totalCompras;

    public Pessoa(String nome, int anoInscricao) {
        this.nome = nome;
        this.anoInscricao = anoInscricao;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoInscricao() {
        return anoInscricao;
    }

    public double getTotalCompras() {
        return totalCompras;
    }
    
    abstract public double calcBonus(int valorAno);
    
    public void addCompras(double valorCompra){
        totalCompras += valorCompra;
    }
    
}
