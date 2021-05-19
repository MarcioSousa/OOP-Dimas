package fatec.poo.model;

import java.util.ArrayList;

/**
 *
 * @author Marcio Sousa
 */
public class Cliente extends Pessoa{
    private double limiteCred;
    private double limiteDisp;
    private ArrayList<Pedido> pedidos;

    public Cliente(String cpf, String nome, double limiteCred) {
        super(cpf, nome);
        this.limiteCred = limiteCred;
        limiteDisp = limiteCred;
        pedidos = new ArrayList<Pedido>();
    }
    
    public double getLimiteDisp() {
        return limiteDisp;
    }
    
    public void setLimiteCred(double limiteCred) {
        this.limiteCred = limiteCred;
    }

    public double getLimiteCred() {
        return limiteCred;
    }
    
    public void addPedido(Pedido p){
        pedidos.add(p);
    }

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
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
        System.out.println("Limite de Crédito: " + limiteCred);
        System.out.println("Limite Disponível: " + limiteDisp);
        
        for(int x = 0; x < pedidos.size(); x++){
            System.out.println(pedidos.get(x).getNumero());
            System.out.println("\t\t" + pedidos.get(x).getDataEmissao());
            System.out.println("\t\t" + pedidos.get(x).getDataPagto());
            System.out.println("\t\t" + pedidos.get(x).getFormaPagto());
            System.out.println("\t\t" + pedidos.get(x).getSituacao());
        }
        
    }
    
}
