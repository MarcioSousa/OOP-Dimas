import fatec.poo.model.Retangulo;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Dimas 
 */
public class Aplic {
    public static void main(String[] args) {
       DecimalFormat df = new DecimalFormat("0.00");
       Scanner entrada = new Scanner(System.in);
       String unidade;
       double medAlt, medBas;
       int opcao;
       
       System.out.println("Digite a unidade de medida: ");
       unidade = entrada.next();  //entrada de caracteres sem espaço
       
       //instanciação do objeto da classe Retangulo
       //e chamada do método construtor
       Retangulo objRet = new Retangulo(unidade);
       
       System.out.println("Digite a medida da altura: ");
       medAlt = entrada.nextDouble();       
       System.out.println("Digite a medida da base: ");
       medBas = entrada.nextDouble();       
       
       objRet.setAltura(medAlt);
       objRet.setBase(medBas);
       
       do{
           System.out.println("\n\n1 - Exibir área retangulo");
           System.out.println("2 - Exibir perímetro retangulo");
           System.out.println("3 - Exibir diagonal retangulo");
           System.out.println("4 - Sair");
           System.out.print("\n\n\t Digite a opcao: ");
           opcao = entrada.nextInt();
                                                       
           System.out.println("\nMedida da altura: " + df.format(objRet.getAltura()) + " " + objRet.getUnidadeMedida());
           System.out.println("Medida da base: " + df.format(objRet.getBase()) + " " + objRet.getUnidadeMedida());
           
           switch(opcao){                                        
                case 1: System.out.println("Área: " + df.format(objRet.calcArea()) + " " + objRet.getUnidadeMedida() + "²");
                        break;             
                case 2: System.out.println("Perímetro: " + df.format(objRet.calcPerimetro()) + " " + objRet.getUnidadeMedida());
                        break;
                case 3: System.out.println("Diagonal: " + df.format(objRet.calcDiagonal()) + " " + objRet.getUnidadeMedida());
                        break;        
           }
       }while (opcao < 4);  
    }    
}
