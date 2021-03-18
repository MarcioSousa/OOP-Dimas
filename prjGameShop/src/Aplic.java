
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
        
        int codigo, idade, opcao;
        double qtdeHoras;
        
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
            System.out.println("5 - Sair");
            System.out.print("\n\n\t Digite a opcao: ");
            opcao = entrada.nextInt();
            
            switch(opcao){
                case 1: 
                    System.out.println("\nDigite a qtde. de horas compradas: ");
                    qtdeHoras = entrada.nextDouble();
                    objGameShop.comprar(qtdeHoras);
                    break;
                case 2: 
                    System.out.println("\nDigite a qtde. de horas que deseja jogar: ");
                    qtdeHoras = entrada.nextDouble();
                    
                    if(qtdeHoras <= objGameShop.getQtdehoras()){
                        objGameShop.jogar(qtdeHoras);
                    }else{
                        System.out.println("Quantidade insuficiente!");
                    }
                    break;
                case 3:
                    objGameShop.brinde();
                    System.out.println("Quantidade de horas dobradas!");
                    break;
                case 4: 
                    System.out.println("\nSeu saldo é: " + df.format(objGameShop.getQtdehoras()) + " h");
                    break;
            }
            
        }while(opcao < 5);
        
    }
    
}
