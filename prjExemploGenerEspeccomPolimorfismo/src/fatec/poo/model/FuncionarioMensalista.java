package fatec.poo.model;

/**
 *
 * @author Marcio Sousa
 */
public class FuncionarioMensalista extends Funcionario {
    private double valSalMin;
    private double numSalMin;

    public FuncionarioMensalista(int registro, String nome, String dtAdmissao, double valSalMin) {
        super(registro, nome, dtAdmissao);
        this.valSalMin = valSalMin;
    }

    public void setNumSalMin(double numSalMin) {
        this.numSalMin = numSalMin;
    }
    
    //AQUI FOI APLICADO O POLIMORFISMO
    @Override
    public double calcSalBruto() {
        return (valSalMin * numSalMin);
    }

    
}
