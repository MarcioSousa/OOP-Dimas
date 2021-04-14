
import fatec.poo.model.Funcionario;
import fatec.poo.model.FuncionarioComissionado;
import fatec.poo.model.FuncionarioHorista;
import fatec.poo.model.FuncionarioMensalista;
import java.text.DecimalFormat;

/**
 *
 * @author Dimas
 */
public class Aplic {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        
        //Definição de matriz de objetos a partir
        //da superclasse Funcionario
        Funcionario[ ]  cadFun  =  new Funcionario[3];

        cadFun[0] = new FuncionarioHorista(1010,
                                           "Pedro Silveira",
                                           "14/05/1978",
                                           15.80);

        cadFun[1] = new FuncionarioMensalista(2020,
                                              "Ana Beatriz",
                                              "22/10/1997",
                                              600.0);
        
        cadFun[2] = new FuncionarioComissionado(3030, 
                                                "Joao Mendes",
                                                "10/12/1975",
                                                10);
        
        //Acesso direto ao métododo herdado
        //a partir da superclasse Funcionario
        cadFun[0].setCargo("Programador");
        cadFun[1].setCargo("Auxiliar Administrativo");
        cadFun[2].setCargo("Vendedor");
        
        //Uso do downcasting para o acesso dos métodos definidos 
        //nas respectivas subclasses FuncionarioHorista, FuncionarioMensalista
        //e FuncionarioComissionado
        ((FuncionarioHorista)cadFun[0]).setQtdeHorTrab(90); 
        ((FuncionarioMensalista)cadFun[1]).setNumSalMin(2.5);
        ((FuncionarioComissionado)cadFun[2]).setSalBase(900);
        ((FuncionarioComissionado)cadFun[2]).addVendas(1000); 
        ((FuncionarioComissionado)cadFun[2]).addVendas(3000);
        ((FuncionarioComissionado)cadFun[2]).addVendas(4000);
        
        for (int i = 0; i < cadFun.length; i++){
            if (cadFun[i] instanceof FuncionarioHorista){
                System.out.println("\n\nFuncionario Horista");
            }else
               if (cadFun[i] instanceof FuncionarioMensalista){
                  System.out.println("\n\nFuncionario Mensalista");
               }else{
                  System.out.println("\n\nFuncionario Comissionado"); 
               } 
            
            System.out.println("Registro         => " + cadFun[i].getRegistro());
            System.out.println("Nome             => " + cadFun[i].getNome());
            System.out.println("Dt. Admissão     => " + cadFun[i].getDtAdmissao()); 
            System.out.println("Cargo            => " + cadFun[i].getCargo());
             
            if (cadFun[i] instanceof FuncionarioComissionado){ 
                System.out.println("Comissao         => " + ((FuncionarioComissionado)cadFun[i]).getTaxaComissao() + "%");
                System.out.println("Salario Base     => " + df.format(((FuncionarioComissionado)cadFun[i]).getSalBase()));
                System.out.println("Total das Vendas => " + df.format(((FuncionarioComissionado)cadFun[i]).getTotalVendas()));
            }
            
            System.out.println("Salário Bruto    => " + df.format(cadFun[i].calcSalBruto()));
            System.out.println("Desconto         => " + df.format(cadFun[i].calcDesconto()));
            
            if (cadFun[i] instanceof FuncionarioHorista){
               System.out.println("Gratificação     => " + df.format(((FuncionarioHorista)cadFun[i]).calcGratificacao()));
            }else 
               if (cadFun[i] instanceof FuncionarioComissionado){
                   System.out.println("Gratificação     => " + df.format(((FuncionarioComissionado)cadFun[i]).calcGratificacao()));          
               }
            System.out.println("Salário Líquido  => " + df.format(cadFun[i].calcSalLiquido()));
        }       
    }
}
