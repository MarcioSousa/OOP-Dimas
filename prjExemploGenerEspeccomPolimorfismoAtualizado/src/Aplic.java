
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
        FuncionarioHorista funcHor = new FuncionarioHorista(1010,
                                                            "Pedro Silveira",
                                                            "14/05/1978",
                                                            15.80);

        FuncionarioMensalista funcMen = new FuncionarioMensalista(2020,
                                                                  "Ana Beatriz",
                                                                  "22/10/1997",
                                                                  600.0);
        
        FuncionarioComissionado funcCom = new FuncionarioComissionado(3030, 
                                                                     "Joao Mendes",
                                                                     "10/12/2005",
                                                                     10);
        funcHor.setCargo("Programador");
        funcHor.setQtdeHorTrab(90);       

        System.out.println("Registro        => " + funcHor.getRegistro());
        System.out.println("Nome            => " + funcHor.getNome());
        System.out.println("Dt. Admissão    => " + funcHor.getDtAdmissao()); 
        System.out.println("Cargo           => " + funcHor.getCargo());
        System.out.println("Salário Bruto   => " + df.format(funcHor.calcSalBruto()));
        System.out.println("Desconto        => " + df.format(funcHor.calcDesconto()));
        System.out.println("Gratificação    => " + df.format(funcHor.calcGratificacao()));
        System.out.println("Salário Líquido => " + df.format(funcHor.calcSalLiquido()));

        funcMen.setCargo("Auxiliar Administrativo");
        funcMen.setNumSalMin(2.5);
       
        System.out.println("\n\nRegistro         => " + funcMen.getRegistro());
        System.out.println("Nome             => " + funcMen.getNome());
        System.out.println("Dt. Admissão     => " + funcMen.getDtAdmissao());
        System.out.println("Cargo            => " + funcMen.getCargo());
        System.out.println("Salario Bruto    =>  " + df.format(funcMen.calcSalBruto()));
        System.out.println("Desconto         =>  " + df.format(funcMen.calcDesconto()));
        System.out.println("Salario Liquido  =>  " + df.format(funcMen.calcSalLiquido()));
        
        funcCom.setCargo("Vendedor");
        funcCom.setSalBase(900);
        funcCom.addVendas(1000); 
        funcCom.addVendas(3000);
        funcCom.addVendas(4000);
          
        System.out.println("\n\nRegistro         => " + funcCom.getRegistro());
        System.out.println("Nome             => " + funcCom.getNome());
        System.out.println("Data admissão    => " + funcCom.getDtAdmissao());
        System.out.println("Cargo            => " + funcCom.getCargo());       
        System.out.println("Salario Base     => " + df.format(funcCom.getSalBase()));
        System.out.println("Total das Vendas => " + df.format(funcCom.getTotalVendas()));
        System.out.println("Comissao         => " + funcCom.getTaxaComissao() + "%");
        System.out.println("Salario Bruto    => " + df.format(funcCom.calcSalBruto()));
        System.out.println("Desconto         => " + df.format(funcCom.calcDesconto()));
        System.out.println("Gratificacao     => " + df.format(funcCom.calcGratificacao()));
        System.out.println("Salario Liquido  => " + df.format(funcCom.calcSalLiquido()));   
    }
}
