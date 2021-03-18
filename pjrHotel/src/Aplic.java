
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
        boolean achou;
        int t;
        
        QuartoHotel[] objQuartoHotel = new QuartoHotel[2];
        
        for(t = 0; t < objQuartoHotel.length; t++){
            System.out.println("Informe o Número do " + (t+1) + "º Quarto: ");
            numeroQuarto = entrada.nextInt();
            System.out.println("Informe o Valor da Diária do " + (t+1) + "º Quarto: ");
            valorDiaria = entrada.nextDouble();
            objQuartoHotel[t] = new QuartoHotel(numeroQuarto, valorDiaria);
        }
        
        do{
            System.out.println("\n\n1 - Consultar Quarto");
            System.out.println("2 - Reservar Quarto");
            System.out.println("3 - Liberar Quarto");
            System.out.println("4 - Consultar Faturamento Quarto");
            System.out.println("5 - Consultar Faturamento Hotel");
            System.out.println("6 - Sair");
            System.out.print("\n\t Digite a opcao: ");
            opcao = entrada.nextInt();
            
            switch(opcao){
                case 1:
                    System.out.println("\nDigite o número do quarto que deseja consultar:");
                    numeroQuarto = entrada.nextInt();
                    achou = false;
                    
                    for(t = 0; t < objQuartoHotel.length; t++){
                        if(numeroQuarto == objQuartoHotel[t].getNumQuarto()){
                            if(objQuartoHotel[t].getSituacao()){
                                System.out.println("\nQuarto Ocupado.");
                            }else{
                                System.out.println("\nQuarto Livre.");
                            }
                            achou = true;
                            break;
                        }
                    }
                    if(achou == false){
                        System.out.println("\nQuarto não cadastrado.");
                    }
                    break;
                case 2:
                    System.out.println("\nDigite o número do quarto que deseja reservar:");
                    numeroQuarto = entrada.nextInt();
                    achou = false;
                    
                    for(t = 0; t < objQuartoHotel.length; t++){
                        if(numeroQuarto == objQuartoHotel[t].getNumQuarto()){
                            if(objQuartoHotel[t].getSituacao()){
                                System.out.println("\nQuarto Ocupado.");
                            }else{
                                System.out.println("\nDigite o Número do RG.");
                                numRg = entrada.nextInt();
                                objQuartoHotel[t].setNumRg(numRg);
                                objQuartoHotel[t].setSituacao(true);
                            }
                            achou = true;
                            break;
                        }
                    }
                    if(achou == false){
                        System.out.println("\nQuarto não cadastrado.");
                    }
                    break;
                case 3:
                    System.out.println("\nDigite o número do quarto que deseja liberar:");
                    numeroQuarto = entrada.nextInt();
                    achou = false;
                    
                    for(t = 0; t < objQuartoHotel.length; t++){
                        if(numeroQuarto == objQuartoHotel[t].getNumQuarto()){
                            if(objQuartoHotel[t].getSituacao()){
                                System.out.println("Quantidade de dias :");
                                numDia = entrada.nextInt();
                                double valorFaturamento = objQuartoHotel[t].liberar(numDia);
                                System.out.println("O valor a ser pago é de: R$ " + df.format(valorFaturamento));
                                objQuartoHotel[t].setSituacao(false);
                            }else{
                                System.out.println("O Quarto já está livre.");
                            }
                            achou = true;
                            break;
                        }
                    }
                    if(achou == false){
                        System.out.println("\nQuarto não cadastrado.");
                    }
                    break;
                case 4:
                    System.out.println("\nDigite o número do quarto que deseja consultar:");
                    numeroQuarto = entrada.nextInt();
                    achou = false;
                    
                    for(t = 0; t < objQuartoHotel.length; t++){
                        if(numeroQuarto == objQuartoHotel[t].getNumQuarto()){
                            double totalFaturado = objQuartoHotel[t].getTotalFaturado();
                            System.out.println("\nTotal faturado pelo quarto é de: R$ " + df.format(totalFaturado));
                            achou = true;
                            break;
                        }
                    }
                    if(achou == false){
                        System.out.println("\nQuarto não cadastrado.");
                    }
                    break;
                case 5:
                    double totalFaturamentoHotel = 0;
                    for(t = 0; t < objQuartoHotel.length; t++){
                        totalFaturamentoHotel += objQuartoHotel[t].getTotalFaturado();
                    }
                    System.out.println("\nTotal faturado pelo hotel é de: R$ " + df.format(totalFaturamentoHotel));
                    break;
            }
        }while(opcao < 6);
    }
    
}
