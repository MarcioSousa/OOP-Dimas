package fatec.poo.model;

/**
 *
 * @author Dimas
 */
public class PessoaJuridica extends Pessoa{
    private String cgc;
    private double taxaIncentivo;

    public PessoaJuridica(String cgc, String nome,int anoIscricao){
        super(nome,anoIscricao);
        setCGC(cgc);
    }
    public double calcBonus(int anoAtual){        
       return (taxaIncentivo/100 * getTotalCompras()) * (anoAtual - getAnoInscricao()) ;   
    }
    public String getCGC() {
        return cgc;
    }

    public void setCGC(String cgc) {
        this.cgc = cgc;
    }

    public double getTaxaIncentivo() {
        return taxaIncentivo;
    }

    public void setTaxaIncentivo(double taxaIncentivo) {
        this.taxaIncentivo = taxaIncentivo;
    }    
}
