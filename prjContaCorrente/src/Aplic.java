
import fatec.poo.model.ContaCorrente;
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
        int numero, opcao;
        double saldo, depsac;

        System.out.println("Digite:\n");
        System.out.println("Número da Conta Corrente:\n");
        numero = entrada.nextInt();
        System.out.println("Saldo da Conta Corente:\n");
        saldo = entrada.nextDouble();
        
        ContaCorrente objContaCorrente = new ContaCorrente(numero, saldo);
        
        do{
            System.out.println("\n\n1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Consultar Saldo");
            System.out.println("4 - Sair");
            System.out.print("\n\n\t Digite a opcao: ");
            opcao = entrada.nextInt();
            
            switch(opcao){
                case 1:
                    System.out.println("\n\nDigite o Valor a ser Depositado:");
                    depsac = entrada.nextDouble();
                    objContaCorrente.depositar(depsac);
                    depsac = 0;
                    break;
                case 2: 
                    System.out.println("\n\nDigite o Valor a ser Sacado:");
                    depsac = entrada.nextDouble();
                    if(depsac <= objContaCorrente.getSaldo()){
                        objContaCorrente.sacar(depsac);
                    }else{
                        System.out.println("Saldo Insuficiente");
                    }
                    break;
                case 3: 
                    
                    System.out.println(df.format(objContaCorrente.getSaldo()));
                    break;
            }
                   
        }while(opcao < 4);
        
             
        
        
        
    }
    
}
