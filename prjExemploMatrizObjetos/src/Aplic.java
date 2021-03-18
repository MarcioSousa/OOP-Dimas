
import fatec.poo.model.Retangulo;
import java.util.Scanner;

/**
 *
 * @author Dimas 
 */
public class Aplic {
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);       
       String unidade;
              
       //definição de uma matriz de objetos 
       //para classe Retangulo
       
       Retangulo[] matRet = new Retangulo[3];
       
       double medAlt, medBas;
       int i;
       
       for (i=0; i < matRet.length; i++){
            System.out.println("\n\nDigite a unidade de medida: ");
            unidade = entrada.next();

            //instanciação do objeto da classe Retangulo
            //e chamada do método construtor
            matRet[i] = new Retangulo(unidade);
       
            System.out.println("Digite a medida da altura: ");
            medAlt = entrada.nextDouble();       
            System.out.println("Digite a medida da base: ");
            medBas = entrada.nextDouble(); 
            
            //passagem de mensagens
            matRet[i].setAltura(medAlt);
            matRet[i].setBase(medBas);
        }     
       
        //acessando matriz de objetos
        for (i=0; i < matRet.length; i++){
            System.out.println("\n\nObjeto Retangulo " + (i+1));
	    
            System.out.println("A Altura: " + matRet[i].getAltura() + " " + matRet[i].getUnidadeMedida());
            System.out.println("A Base: " + matRet[i].getBase() + " " + matRet[i].getUnidadeMedida());
            System.out.println("A área: " + matRet[i].calcArea() + " " + matRet[i].getUnidadeMedida());
            System.out.println("A diagonal: " + matRet[i].calcDiagonal() + " " + matRet[i].getUnidadeMedida());
            System.out.println("O perímetro: " + matRet[i].calcPerimetro() + " " + matRet[i].getUnidadeMedida());
            
        }   		   
    }    
}
