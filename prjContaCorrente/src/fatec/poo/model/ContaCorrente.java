package fatec.poo.model;

/**
 *
 * @author Marcio Sousa
 */
public class ContaCorrente {
    int numero;
    double saldo;

    public ContaCorrente(int numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }
    
    public void sacar(double valor){
        saldo = saldo - valor;
    }
    
    public void depositar(double valor){
        saldo = saldo + valor;
    }
    
    public int getNumero() {
        return numero;
    }
    
    public double getSaldo() {
        return saldo;
    }
    
}
