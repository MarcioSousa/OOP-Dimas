
import fatec.poo.model.QuartoHotel;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Marcio Sousa
 */
public class Aplic {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        Scanner entrada = new Scanner(System.in);
        int numeroQuarto, numRg, numDia;
        double valorDiaria;
        int opcao;
        
        System.out.println("Informe o Número do Quarto: ");
        numeroQuarto = entrada.nextInt();
        System.out.println("Informe o Valor da Diária: ");
        valorDiaria = entrada.nextDouble();
        
        QuartoHotel objQuartoHotel = new QuartoHotel(numeroQuarto, valorDiaria);
        
        do{
            System.out.println("\n\n1 - Consultar Quarto");
            System.out.println("2 - Reservar Quarto");
            System.out.println("3 - Liberar Quarto");
            System.out.println("4 - Consultar Faturamento Quarto");
            System.out.println("5 - Sair");
            System.out.print("\n\n\t Digite a opcao: ");
            opcao = entrada.nextInt();
            
            switch(opcao){
                case 1:
                    if(objQuartoHotel.getSituacao()){
                        System.out.println("\nQuarto Ocupado.");
                    }else{
                        System.out.println("\nQuarto Livre.");
                    }
                    break;
                case 2:
                    if(objQuartoHotel.getSituacao()){
                        System.out.println("\nO quarto está já foi reservado.");
                    }else{
                        System.out.println("\nDigite o número do RG: ");
                        numRg = entrada.nextInt();
                        
                        objQuartoHotel.reservar(numRg);
                        System.out.println("\nQuarto Reservado!");
                    }
                    break;
                case 3:
                    if(objQuartoHotel.getSituacao()){
                        System.out.println("\nDigite a quantidade de dias que ficou no quarto");
                        numDia = entrada.nextInt();
                        
                        System.out.println("\nQuarto livre! O total a ser pago pela estadia é de " + df.format(objQuartoHotel.liberar(numDia)));
                    }else{
                        System.out.println("\nO quarto já está livre");
                    }
                case 4:
                    System.out.println("\nO total faturado pelo quarto é de: R$ " + df.format(objQuartoHotel.getTotalFaturado()));
                    break;
            }
        }while(opcao < 5);
        
        
        
        
    }
    
}
