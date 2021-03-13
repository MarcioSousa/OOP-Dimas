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
        int opcao = 0;
        
        System.out.println("Digite o RA do Aluno: ");
        objAlu.setRa(entrada.nextInt());
        
        System.out.println("Digite a Primeira Nota da Prova: ");
        objAlu.setNtPrv1(entrada.nextDouble());
        
        System.out.println("Digite a Segunda Nota da Prova: ");
        objAlu.setNtPrv2(entrada.nextDouble());
        
        System.out.println("Digite a Primeira Nota do Trabalho: ");
        objAlu.setNtTrab1(entrada.nextDouble());
        
        System.out.println("Digite a Segunda Nota do Trabalho: ");
        objAlu.setNtTrab2(entrada.nextDouble());
        
        
        
        do{
            System.out.println("\n1 - Exibir Nota das Provas/Trabalhos");
            System.out.println("2 - Exibir Média dos Trabalhos/Provas");
            System.out.println("3 - Exibir Média Final");
            System.out.println("4 - Sair");
            System.out.println("\n\t - Digite sua opção: ");
            
            System.out.println("\nRA do Aluno: " + objAlu.getRa());
            System.out.println("\n1ª Nota: " + objAlu.getNtPrv1());
            System.out.println("\n2ª Nota: " + objAlu.getNtPrv2());
            System.out.println("\n1º Trabalho: " + objAlu.getNtTrab1());
            System.out.println("\n2º Trabalho: " + objAlu.getNtTrab2());
            
            //System.out.println("Média das Provas é: " + objAlu.calcMediaProva());
            //System.out.println("Média dos Trabalhos é: : " + objAlu.calcMediaTrab());
            //System.out.println("Média Final: " + objAlu.calcMediaFinal());
            
            opcao = entrada.nextInt(); //scanf("%d", opcao);
            
            //System.out.println("\nMedida da Altura: " + objCirc.getRaio());
            
            switch(opcao){                      //Passagem de mensagens
                case 1 : System.out.println("Cálculo da Média das provas Aluno: " + objAlu.calcMediaProva());
                         break;
                case 2 : System.out.println("Cálculo da Média dos trabalhos Aluno: " + objAlu.calcMediaTrab());
                         break; 
                case 3 : System.out.println("Cálculo da Média final Aluno: " + objAlu.calcMediaFinal());
                         break;
            }
        }while(opcao < 4);

    }
    
}

//Exibir Nota das Provas/Trabalhos
//Exibir Média dos Trabalhos/Provas
//Exibir Média Final
//Sair
