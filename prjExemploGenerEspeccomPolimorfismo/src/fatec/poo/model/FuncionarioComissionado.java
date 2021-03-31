package fatec.poo.model;

/**
 *
 * @author Marcio Sousa
 */
public class FuncionarioComissionado extends Funcionario {
    private double salBase;
    private double taxaComissao;
    private double totalVendas;

    public FuncionarioComissionado( int registro, String nome, String dtAdmissao, double taxaComissao) {
        super(registro, nome, dtAdmissao);
        this.taxaComissao = taxaComissao;
    }

    public double getSalBase() {
        return salBase;
    }

    public double getTaxaComissao() {
        return taxaComissao;
    }

    public double getTotalVendas() {
        return totalVendas;
    }

    public void setSalBase(double salBase) {
        this.salBase = salBase;
    }
    
    public void addVendas(double valor){
        totalVendas += valor;
    }
    
    @Override
    public double calcSalBruto() {
        return (salBase + (taxaComissao * totalVendas));
    }

    public double calcGratificacao() {
        double gratificacao;
        if(totalVendas <= 5000){
            gratificacao = 0;
        }else if(totalVendas <= 10000){
            gratificacao = calcSalBruto()*0.03;
        }else{
            gratificacao = calcSalBruto()*0.05;
        }
        return gratificacao;
    }
    
    public double calcSalLiquido(){
        return calcSalBruto() - calcDesconto() + calcGratificacao();
    }
    
}
