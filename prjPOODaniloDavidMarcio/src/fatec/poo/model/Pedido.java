package fatec.poo.model;

import java.util.ArrayList;

/**
 *
 * @author Marcio Sousa
 */
public class Pedido {
    private String numero;
    private String dataEmissao;
    private String dataPagto;
    private boolean formaPagto;
    private boolean situacao;
    private ArrayList<ItemPedido> itensPedido;
    private Cliente cliente;
    private Vendedor vendedor;

    public Pedido(String numero, String dataEmissao) {
        this.numero = numero;
        this.dataEmissao = dataEmissao;
        itensPedido = new ArrayList<ItemPedido>();
    }
    
    public String getNumero() {
        return numero;
    }

    public String getDataEmissao() {
        return dataEmissao;
    }

    public String getDataPagto() {
        return dataPagto;
    }

    public boolean getFormaPagto() {
        return formaPagto;
    }
    
    public boolean getSituacao() {
        return situacao;
    }

    public void setDataPagto(String dataPagto) {
        this.dataPagto = dataPagto;
    }

    public void setFormaPagto(boolean formaPagto) {
        this.formaPagto = formaPagto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public void setSituacao(boolean situacao) {
        this.situacao = situacao;
    }
    
    public void addItemPedido(ItemPedido ip){
        itensPedido.add(ip);
        cliente.setLimiteCred(cliente.getLimiteDisp() - (ip.getQtdeVendida() * ip.getProduto().getPreco()));
    }
    
    public void listarItensPedido(){
        System.out.println("\n\nNúmero: " + numero);
        System.out.println("\n\nNúmero: " + dataEmissao);
        System.out.println("\n\nNúmero: " + dataPagto);
        System.out.println("\n\nNúmero: " + formaPagto);
        System.out.println("\n\nNúmero: " + situacao);
        
        for(int x = 0; x < itensPedido.size(); x++){
            System.out.println("\t\t" + itensPedido.get(x).getQtdeVendida());
            System.out.println("\t\t" + itensPedido.get(x).getSequencia());
        }
        
    }
    
}
