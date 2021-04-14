
import fatec.poo.model.Comodo;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Marcio Sousa
 */
public class Aplic {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.0");
        Scanner entrada = new Scanner(System.in);
        
        Comodo[] objComodo = new Comodo[5];
        
        int escolha;
        int potencia;
        
        for(int t = 0; t < objComodo.length; t++){
            System.out.println("\nREGISTRE 5 CÔMODOS\nEscolha o Comodo:");
            System.out.println("1 - SALA");
            System.out.println("2 - QUARTO");
            System.out.println("3 - COZINHA");
            System.out.println("4 - BANHEIRO");

            escolha = entrada.nextInt();
            
            System.out.println("Informa a potência da Lâmpada: ");
            potencia = entrada.nextInt();
            objComodo[t] = new Comodo(escolha, potencia);
            
            System.out.println("Largura do Cômodo: ");
            objComodo[t].setMedLarg(entrada.nextDouble());
            
            System.out.println("Altura do Cômodo: ");
            objComodo[t].setMedAlt(entrada.nextDouble());
            
            System.out.println("Comprimento do Cômodo: ");
            objComodo[t].setMedComp(entrada.nextDouble());

        }
        
        System.out.printf("\n%-15s %-15s %-15s\n", "Tipo Cômodo","Potência Lâmpada","Nº Aprox. de Lâmpadas");
        
        for(int t = 0; t < objComodo.length; t++){
            System.out.printf("\n%-25s %-25s %-10s\n",objComodo[t].getTipo(),objComodo[t].getPotLampada(),df.format(objComodo[t].calcQtdeLampada()));
        }
        
    }
    
}
