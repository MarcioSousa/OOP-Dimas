package fatec.poo.model;

/**
 *
 * @author Marcio Sousa
 */
public class FuncionarioHorista extends Funcionario {
    private double valHorTrab;
    private int qtdeHorTrab;
    
    public FuncionarioHorista(int registro, String nome, String dtAdmissao, double valHorTrab) {
        super(registro, nome, dtAdmissao); //CHAMADA AO MÉTODO CONTRUTOR DA SUPERCLASSE FUNCIONÁRIO
        this.valHorTrab = valHorTrab;
    }

    public void setQtdeHorTrab(int qtdeHorTrab) {
        this.qtdeHorTrab = qtdeHorTrab;
    }
    
    //AQUI FOI APLICADO O POLIMORFISMO
    @Override
    public double calcSalBruto() {
        return (valHorTrab * qtdeHorTrab);
    }
    
    public double calcSalLiquido(){
        return (super.calcSalLiquido() + calcGratificacao());
    }
    
    public double calcGratificacao(){
        return (0.075 * calcSalBruto());
    }
    
}
