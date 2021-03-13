
import fatec.poo.model.GameShop;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Marcio Sousa
 */
public class Aplic {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner entrada = new Scanner(System.in);
        int codigo;
        int idade;
        int opcao;
        
        System.out.println("Digite:\n");
        System.out.println("Código:\n");
        codigo = entrada.nextInt();
        System.out.println("Idade:\n");
        idade = entrada.nextInt();
        
        GameShop objGameShop = new GameShop(codigo, idade);
        
        do{
            System.out.println("\n\n1 - Comprar Horas");
            System.out.println("2 - Jogar");
            System.out.println("3 - Brinde");
            System.out.println("4 - Consultar Saldo de Horas");
            System.out.println("4 - Sair");
            System.out.print("\n\n\t Digite a opcao: ");
            opcao = entrada.nextInt();
            
            switch(opcao){
                case 1:
                    
            }
            
        }while(opcao < 5);
        
    }
    
}
