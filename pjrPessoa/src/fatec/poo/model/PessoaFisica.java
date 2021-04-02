package fatec.poo.model;

import java.util.Calendar;

/**
 *
 * @author Marcio Sousa
 */
public class PessoaFisica extends Pessoa {
    private String cpf;
    private double base;

    public PessoaFisica(String cpf, String nome, int anoInscricao) {
        super(nome, anoInscricao);
        this.cpf = cpf;
    }
    
    @Override
    public double calcBonus(int valorAno){
        double diferenca;
        
        if (getTotalCompras() > 12000){
           diferenca = valorAno - getAnoInscricao();
           return (diferenca * base);
        }else{
            return  0;
        }
        
    }

    public String getCpf() {
        return cpf;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

}
