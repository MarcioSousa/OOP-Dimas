
import fatec.poo.model.Cliente;
import fatec.poo.model.Vendedor;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Marcio Sousa
 */
public class Aplic {
    
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        
        Vendedor objVendedor = new Vendedor(5.0, 100, "Carlos Silva");
        objVendedor.addVenda(300);
        objVendedor.addVenda(500);
        objVendedor.addVenda(600);
        objVendedor.addVenda(700);
        
        Cliente[] objCliente = new Cliente[3];
        objCliente[0] = new Cliente(1000, 111, "Amelia Souza");
        objCliente[0].addCompra(300);
        objCliente[1] = new Cliente(2000, 222, "Antonio Vieira");
        objCliente[1].addCompra(500);
        objCliente[1].addCompra(600);
        objCliente[2] = new Cliente(3000, 333, "FabioSilva");
        objCliente[2].addCompra(700);
        
        System.out.println("DADOS DOS VENDEDORES:");
        System.out.println("CÓDIGO: " + objVendedor.getCodigo());
        System.out.println("NOME: " + objVendedor.getNome());
        System.out.println("TOTAL VENDAS: " + df.format(objVendedor.getTotalVendas()));
        System.out.println("TAXA COMISSÃO: " + df.format(objVendedor.getTaxaComissao()));
        
        
        System.out.println("\nDADOS DOS CLIENTES:");
        
        for(int t = 0; t < objCliente.length; t++){
            System.out.println("CÓDIGO: " + objCliente[t].getCodigo());
            System.out.println("NOME: " + objCliente[t].getNome());
            System.out.println("LIMITE DISPONÍVEL: " + objCliente[t].calcLimiteDisponivel());
            System.out.println("TOTAL COMPRAS: " + objCliente[t].getTotalCompras() + "\n");
        }
       
    }
    
}
