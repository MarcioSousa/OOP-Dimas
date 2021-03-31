import fatec.poo.model.FuncionarioHorista;
import fatec.poo.model.FuncionarioMensalista;
import java.text.DecimalFormat;

/**
 *
 * @author Marcio Sousa
 */
public class Aplic {
    
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        
        FuncionarioHorista funcHor = new FuncionarioHorista(1010, "Pedro Silveira", "14/05/1978", 15.80);
        FuncionarioMensalista funcMen = new FuncionarioMensalista(2020, "Marcio Sousa", "10/10/2020", 18.60);
        
        funcHor.setCargo("Funcionário");
        funcMen.setCargo("Auxiliar Administrativo");
        
        funcHor.setQtdeHorTrab(90);
        System.out.println("Registro: " + funcHor.getRegistro());
        System.out.println("Nome: " + funcHor.getNome());
        System.out.println("Data de Admissão: " + funcHor.getDtAdmissao());
        System.out.println("Cargo: " + funcHor.getCargo());
        
        System.out.println("Salário Bruto   => " + df.format(funcHor.calcSalBruto()));
        System.out.println("Desconto        => " + df.format(funcHor.calcDesconto()));
        System.out.println("Gratificação    => " + df.format(funcHor.calcGratificacao()));
        System.out.println("Salário Líquido => " + df.format(funcHor.calcSalLiquido()));
        
        funcMen.setNumSalMin(2.5);
        System.out.println("\nRegistro: " + funcMen.getRegistro());
        System.out.println("Nome: " + funcMen.getNome());
        System.out.println("Data de Admissão: " + funcMen.getDtAdmissao());
        System.out.println("Cargo: " + funcMen.getCargo());
        
        System.out.println("Salário Bruto   => " + df.format(funcMen.calcSalBruto()));
        System.out.println("Desconto        => " + df.format(funcMen.calcDesconto()));
        System.out.println("Salário Líquido => " + df.format(funcMen.calcSalLiquido()));

    }
    
}
