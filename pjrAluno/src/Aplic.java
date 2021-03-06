import fatec.poo.model.Aluno;
import java.util.Scanner;

/**
 *
 * @author Marcio Sousa
 */
public class Aplic {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Aluno objAlu = new Aluno();
        
        int opcao;
        
        System.out.println("Digite o RA do Aluno: ");
        objAlu.setRA(entrada.nextInt());
        
        System.out.println("Digite a Primeira Nota da Prova: ");
        objAlu.setNtPrv1(entrada.nextDouble());
        
        System.out.println("Digite a Segunda Nota da Prova: ");
        objAlu.setNtPrv2(entrada.nextDouble());
        
        System.out.println("Digite a Primeira Nota do Trabalho: ");
        objAlu.setNtTrab1(entrada.nextDouble());
        
        System.out.println("Digite a Segunda Nota do Trabalho: ");
        objAlu.setNtTrab2(entrada.nextDouble());
        
        System.out.println("Média das Provas é: " + objAlu.calcMediaProva());
        System.out.println("Média dos Trabalhos é: : " + objAlu.calcMediaTrab());
        System.out.println("Média Final: " + objAlu.calcMediaFinal());

       
    }
    
}
