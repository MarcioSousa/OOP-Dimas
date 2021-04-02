package fatec.poo.model;

import java.util.Calendar;

/**
 *
 * @author Marcio Sousa
 */
public class PessoaJuridica extends Pessoa {
    private String cgc;
    private double taxaIncentivo;

    public PessoaJuridica(String cgc, String nome, int anoInscricao) {
        super(nome, anoInscricao);
        this.cgc = cgc;
    }
    
    @Override
    public double calcBonus(int valorAno) {
        double valorBonus;
        double diferenca;
        
        diferenca = valorAno - getAnoInscricao();
        valorBonus = taxaIncentivo * getTotalCompras();
        
        return valorBonus * diferenca;
    }
    
    public String getCgc() {
        return cgc;
    }

    public double getTaxaIncentivo() {
        return taxaIncentivo;
    }

    public void setTaxaIncentivo(double taxaIncentivo) {
        this.taxaIncentivo = taxaIncentivo;
    }


    
    
    
    
    
}
