import fatec.poo.model.Cliente;
import fatec.poo.model.Instrutor;
import java.text.DecimalFormat;

/**
 *
 * @author Marcio Sousa
 */
public class Aplic {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("##0.00");
        
        Instrutor objInstrutor = new Instrutor(1010, "Marcio", "1110101010");
        Cliente objCliente = new Cliente("2020-20", "Ana", "1120202020");
        
        objInstrutor.setAreaAtuacao("Ajudante");
        System.out.println("Número de Identificação: " + objInstrutor.getIdentificacao());
        System.out.println("Nome: " + objInstrutor.getNome());
        System.out.println("Contato: " + objInstrutor.getTelefone());
        System.out.println("Área de Atuação: " + objInstrutor.getAreaAtuacao());
        
        
        objCliente.setAltura(1.9);
        objCliente.setPeso(75.6);
        System.out.println("\nCPF: " + objCliente.getCpf());
        System.out.println("Nome: " + objCliente.getNome());
        System.out.println("Contato: " + objCliente.getTelefone());
        System.out.println("Altura: " + df.format(objCliente.getAltura()) + "cm");
        System.out.println("Peso: " + df.format(objCliente.getPeso()) + " kg");
        
    }
    
}
