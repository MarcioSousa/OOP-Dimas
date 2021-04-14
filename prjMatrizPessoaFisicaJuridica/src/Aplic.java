
import fatec.poo.model.Pessoa;
import fatec.poo.model.PessoaFisica;
import fatec.poo.model.PessoaJuridica;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author 
 */
public class Aplic {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        Scanner entrada = new Scanner(System.in);
        
        //Definição da matriz de objetos 
        Pessoa[] cadPesFisJur = new Pessoa[3];

        int opcao, cont = 0, anoInsc, anoAtual;
        double valBase, valCompra, txIncentivo;
        String nome, cpfcgc;

        System.out.print("Digite o ano atual (aaaa) ===> ");
        anoAtual = entrada.nextInt();
        
        do {
            System.out.println("\n1 – Cadastrar Pessoa Física");
            System.out.println("2 – Cadastrar Pessoa Jurídica");
            System.out.println("3 – Listar Bonus");
            System.out.println("4 – Sair");
            System.out.print("\n\tDigite a opcao: ");
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    //Verificação do limite da matriz de objetos
                    if (cont <  cadPesFisJur.length) {
                        System.out.print("\nDigite o CPF: ");
                        cpfcgc = entrada.next();
                        System.out.print("Digite o nome: ");
                        nome = entrada.next();
                        System.out.print("Digite o ano de inscrição (aaaa): ");
                        anoInsc = entrada.nextInt();

                        //Instanciação de objetos da classe PessoaFisica
                        cadPesFisJur[cont] = new PessoaFisica(cpfcgc, nome, anoInsc);
                        
                        System.out.print("Digite o valor base: ");
                        valBase = entrada.nextDouble();

                        //chamada do método setBase com downcasting
                        ((PessoaFisica)cadPesFisJur[cont]).setBase(valBase);

                        System.out.print("Digite valor da compra (zero para finalizar): ");
                        valCompra = entrada.nextDouble();
                        while (valCompra > 0) {
                            //chamada do método addCompras
                            cadPesFisJur[cont].addCompras(valCompra);
                            
                            System.out.print("Digite valor da compra (zero para finalizar): ");
                            valCompra = entrada.nextDouble();
                        }
                        cont++;
                    } else {
                        System.out.println("\n\t\t-----------------------------------------");
                        System.out.println("\t\tQuantidade Maxima de Usuarios Cadastrados");
                        System.out.println("\t\t-----------------------------------------");
                    }
                    break;

                case 2:
                    //Verificação do limite da matriz de objetos
                    if (cont <  cadPesFisJur.length) {
                        System.out.print("\nDigite o CGC: ");
                        cpfcgc = entrada.next();
                        System.out.print("Digite o nome: ");
                        nome = entrada.next();
                        System.out.print("Digite o ano de inscrição (aaaa): ");
                        anoInsc = entrada.nextInt();

                        //Instanciação de objetos da classe PessoaJuridica
                        cadPesFisJur[cont] = new PessoaJuridica(cpfcgc, nome, anoInsc);

                        System.out.print("Digite a Taxa de Incentivo(%): ");
                        txIncentivo = entrada.nextDouble();

                        //chamada do método setTaxaIncentivo com downcasting
                        ((PessoaJuridica)cadPesFisJur[cont]).setTaxaIncentivo(txIncentivo);
                        
                        System.out.print("Digite o Valor da Compra: ");
                        valCompra = entrada.nextDouble();
                        
                        while (valCompra > 0) {
                            //chamada do método addCompras
                            cadPesFisJur[cont].addCompras(valCompra);
                            
                            System.out.print("Digite valor da compra (zero para finalizar): ");
                            valCompra = entrada.nextDouble();
                        }
                        cont++;
                    } else {
                        System.out.println("\n\t\t-----------------------------------------");
                        System.out.println("\t\tQuantidade Maxima de Usuarios Cadastrados");
                        System.out.println("\t\t-----------------------------------------");
                    }
                    
                    break;

                case 3:
                    if(cont > 0){
                        System.out.printf("\n%-15s %-15s %-15s %-15s %-10s\n", "Tipo", "CPF/CGC", "Nome", "Ano Inscrição", "Bonus");
                        for(int i = 0; i < cont; i++){
                            //SE A PESSOA FOR UMA PESSOA FÍSICA
                            if(cadPesFisJur[i] instanceof PessoaFisica){
                                System.out.printf("\n%-15s %-15s %-15s %-15d %-10s\n", "Pessoa Física",
                                        ((PessoaFisica) cadPesFisJur[i]).getCPF(), 
                                        cadPesFisJur[i].getNome(), 
                                        cadPesFisJur[i].getAnoInscricao(), 
                                        df.format(cadPesFisJur[i].calcBonus(anoAtual)));
                            }else{
                                //PESSOA JURÍDICA
                                System.out.printf("\n%-15s %-15s %-15s %-15d %-10s\n", "Pessoa Jurídica",
                                        ((PessoaJuridica) cadPesFisJur[i]).getCGC(), 
                                        cadPesFisJur[i].getNome(), 
                                        cadPesFisJur[i].getAnoInscricao(), 
                                        df.format(cadPesFisJur[i].calcBonus(anoAtual)));
                            }
                        }
                    } else {
                        System.out.println("\n\t\t---------------------------------------");
                        System.out.println("\t\t----- Não há cadastros pra listar -------");
                        System.out.println("\t\t-----------------------------------------");
                    }
                    
                    /*
                    if (cont <  cadPesFisJur.length) {
                        if(((PessoaFisica)cadPesFisJur[cont]).getCPF() != null){
                            System.out.print("Tipo de Pessoa: Pessoa Física");
                            System.out.print("CPF/CGC: " + ((PessoaFisica)cadPesFisJur[cont]).getCPF());
                            System.out.print("Nome: " + cadPesFisJur[cont].getNome());
                            System.out.print("Valor do Bônus: " + df.format(((PessoaFisica)cadPesFisJur[cont]).calcBonus(2021)));
                        }else if(((PessoaJuridica)cadPesFisJur[cont]).getCGC() != null){
                            System.out.print("Tipo de Pessoa: Pessoa Jurídica");
                            System.out.print("CPF/CGC: " + ((PessoaJuridica)cadPesFisJur[cont]).getCGC());
                            System.out.print("Nome: " + cadPesFisJur[cont].getNome());
                            System.out.print("Valor do Bônus: " + df.format(((PessoaJuridica)cadPesFisJur[cont]).calcBonus(2021)));
                        }
                        cont++;

                    } else {
                        System.out.println("\n\t\t-----------------------------------------");
                        System.out.println("\t\tQuantidade Maxima de Usuarios Cadastrados");
                        System.out.println("\t\t-----------------------------------------");
                    }
                    */
                    break;
            }
        } while (opcao < 4);
    }
}
