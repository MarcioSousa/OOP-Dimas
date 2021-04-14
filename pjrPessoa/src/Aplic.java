import fatec.poo.model.PessoaFisica;
import fatec.poo.model.PessoaJuridica;
import java.text.DecimalFormat;
import java.util.Calendar;

/**
 *
 * @author Marcio Sousa
 */
public class Aplic {
    
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        
        PessoaFisica pesFisica = new PessoaFisica("1234", "Marcio", 2010);
        PessoaJuridica pesJuridica = new PessoaJuridica("12400", "Roberta", 2015);
        
        pesFisica.setBase(120.00);
        pesFisica.addCompras(100.00);
        pesFisica.addCompras(1000.00);
        
        pesJuridica.setTaxaIncentivo(0.1);
        pesJuridica.addCompras(250.00);
        pesJuridica.addCompras(1200.00);
        
        System.out.println("Nome:                 " + pesFisica.getNome());
        System.out.println("CPF:                  " + pesFisica.getCpf());
        System.out.println("Ano de Inscrição:     " + pesFisica.getAnoInscricao());
        System.out.println("Salário Base:      R$ " + df.format(pesFisica.getBase()));
        System.out.println("Total de Compras:  R$ " + df.format(pesFisica.getTotalCompras()));
        //PASSANDO COMO PARÂMETRO O ANO ATUAL.
        System.out.println("Bonus:             R$ " + df.format(pesFisica.calcBonus(Integer.parseInt(String.valueOf(Calendar.getInstance().get(Calendar.YEAR))))));
        
        System.out.println("\nCGC:                  " + pesJuridica.getCgc());
        System.out.println("Nome:                 " + pesJuridica.getNome());
        System.out.println("Ano Incrição:         " + pesJuridica.getAnoInscricao());
        System.out.println("Taxa de Incentivo: R$ " + df.format(pesJuridica.getTaxaIncentivo()));
        System.out.println("Total de Compras:  R$ " + df.format(pesJuridica.getTotalCompras()));
        
        //PASSANDO COMO PARÂMETRO O ANO ATUAL.
        System.out.println("Bonus:             R$ " + df.format(pesJuridica.calcBonus(Integer.parseInt(String.valueOf(Calendar.getInstance().get(Calendar.YEAR))))));
        
    }
    
}
