package fatec.poo.model;

import java.util.ArrayList;

/**
 *
 * @author Marcio Sousa
 */
public class Vendedor extends Pessoa{
    private double salarioBase;
    private double taxaComissao;
    private ArrayList<Pedido> pedidos;
    
    public Vendedor(String cpf, String nome, double salarioBase) {
        super(cpf, nome);
        this.salarioBase = salarioBase;
        pedidos = new ArrayList<Pedido>();
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public double getTaxaComissao() {
        return taxaComissao;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public void setTaxaComissao(double porcTaxaComissao) {
        this.taxaComissao = porcTaxaComissao;
    }
    
    public void addPedido(Pedido p){
        pedidos.add(p);
    }
    
    public void listarPedidos(){
        System.out.println("\n\nCpf: " + getCpf());
        System.out.println("Nome: " + getNome());
        System.out.println("Endereço: " + getEndereco());
        System.out.println("Cidade: " + getCidade());
        System.out.println("Uf: " + getUf());
        System.out.println("Cep: " + getCep());
        System.out.println("Ddd: " + getDdd());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("Salário Base: " + salarioBase);
        System.out.println("Taxa de Comissão: " + taxaComissao);
        
        for(int x = 0; x < pedidos.size(); x++){
            System.out.println(pedidos.get(x).getNumero());
            System.out.println("\t\t" + pedidos.get(x).getDataEmissao());
            System.out.println("\t\t" + pedidos.get(x).getDataPagto());
            System.out.println("\t\t" + pedidos.get(x).getFormaPagto());
            System.out.println("\t\t" + pedidos.get(x).getSituacao());
        }
        
    }
    
    
}
