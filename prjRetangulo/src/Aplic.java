
import fatec.poo.model.Retangulo;
import java.util.Scanner;

/**
 *
 * @author Marcio Sousa
 */
public class Aplic {
    
    public static void main(String[] args) {
        //Instanciação de objetos da classe Scanner 
        //e da classe Retângulo
        Scanner entrada = new Scanner(System.in);
        Retangulo objRet = new Retangulo();
        
        double medBase, medAlt;
        int opcao;
        
        System.out.println("Digite a altura: ");
        medAlt = entrada.nextDouble(); //scanf("%f", &medAlt);
        
        System.out.println("Digite a base: ");
        medBase = entrada.nextDouble(); //scanf("%f", &medBase);
        
        //passagem de mensagens
        objRet.setAltura(medAlt);
        objRet.setBase(medBase);
        
        do{
            System.out.println("\n1 - Consultar Área");
            System.out.println("2 - Consultar Perímetro");
            System.out.println("3 - Consultar Diagonal");
            System.out.println("4 - Sair");
            System.out.println("\n\t - Digite sua opção: ");
            
            opcao = entrada.nextInt(); //scanf("%d", opcao);
            
            System.out.println("\nMedida da Altura: " + objRet.getAltura());
            System.out.println("Medida da Base: " + objRet.getBase());
            
            switch(opcao){                      //Passagem de mensagens
                case 1 : System.out.println("Medida da Área: " + objRet.calcArea());
                         break;
                case 2 : System.out.println("Medida da Perímetro: " + objRet.calcPerimetro());
                         break; 
                case 3 : System.out.println("Medida da Diagonal: " + objRet.calcDiagonal());
                         break;
            }
        }while(opcao < 4);

    }
    
}
