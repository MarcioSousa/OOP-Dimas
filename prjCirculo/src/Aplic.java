
import fatec.poo.model.Circulo;
import java.util.Scanner;

/**
 *
 * @author Marcio Sousa
 */
public class Aplic {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Circulo objCirc = new Circulo();
        
        int opcao;
        
        System.out.println("Digite a raio: ");
        objCirc.setRaio(entrada.nextDouble());
        
        do{
            System.out.println("\n1 - Exibir área círculo");
            System.out.println("2 - Exibir perímetro círculo");
            System.out.println("3 - Exibir diâmetro círculo");
            System.out.println("4 - Sair");
            System.out.println("\n\t - Digite sua opção: ");
            
            opcao = entrada.nextInt(); //scanf("%d", opcao);
            
            System.out.println("\nMedida da Altura: " + objCirc.getRaio());
            
            switch(opcao){                      //Passagem de mensagens
                case 1 : System.out.println("Medida da Área: " + objCirc.calcArea());
                         break;
                case 2 : System.out.println("Medida da Perímetro: " + objCirc.calcPerimetro()); 
                         break; 
                case 3 : System.out.println("Medida da Diâmetro: " + objCirc.calcDiametro());
                         break;
            }
        }while(opcao < 4);
        
    }
    
}
