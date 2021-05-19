package fatec.poo.model;

/**
 *
 * @author Marcio Sousa
 */
public class ItemPedido {
    private int sequencia;
    private double qtdeVendida;
    private Produto produto;
    private Pedido pedido;
    
    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public ItemPedido(int numeroItem, double qtdeVendida, Produto produto) {
        this.sequencia = numeroItem;
        this.qtdeVendida = qtdeVendida;
        this.produto = produto;
    }

    public double getQtdeVendida() {
        return qtdeVendida;
    }

    public int getSequencia() {
        return sequencia;
    }
    
    public void setQtdeVendida(double qtdeVendida) {
        this.qtdeVendida = qtdeVendida;
        produto.setQtdeEstoque(produto.getQtdeEstoque() - qtdeVendida);
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Pedido getPedido() {
        return pedido;
    }
    
    
    
}
