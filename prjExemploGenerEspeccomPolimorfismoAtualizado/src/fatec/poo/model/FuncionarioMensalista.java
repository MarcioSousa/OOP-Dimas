package fatec.poo.model;

/**
 *
 * @author Dimas
 */
public class FuncionarioMensalista extends Funcionario{
    private double numSalMin;
    private double valSalMin;

    public FuncionarioMensalista(int registro,
                                 String nome, 
                                 String dtAdmissao, 
                                 double valSalMin) {
        super(registro, nome, dtAdmissao);//chamada ao método construtor da superclasse Funcionario
        this.valSalMin = valSalMin;
    }

    public void setNumSalMin(double numSalMin) {
        this.numSalMin = numSalMin;
    }    
    
    @Override
    public double calcSalBruto() {
        return(valSalMin * numSalMin);
    }
}
