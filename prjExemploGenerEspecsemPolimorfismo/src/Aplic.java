import fatec.poo.model.Aluno;
import fatec.poo.model.Professor;
import java.text.DecimalFormat;

/**
 * @author Marcio Sousa
 */
public class Aplic {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        
        //INSTANCIAÇÃO DE UM OBJETO DA CLASSE ALUNO
        Aluno objAluno = new Aluno(1010, "CarlosSilveira", "15/03/1978");
        
        //INSTANCIAÇÃO DE UM OBJETO DA CLASSE PROFESSOR
        Professor objProfessor = new Professor(1255, "Dimas", "10/10/2020");
        
        objAluno.setMensalidade(1500);
        System.out.println("Registro Escolar: " + objAluno.getRegEscolar());
        System.out.println("Nome: " + objAluno.getNome());
        System.out.println("Data de Nascimento: " + objAluno.getDataNascimento());
        System.out.println("Mensalidade: R$ " + df.format(objAluno.getMensalidade()));
       
        objProfessor.setSalario(2500);
        System.out.println("\nRegistro Funcionário: " + objProfessor.getRegFuncional());
        System.out.println("Nome: " + objProfessor.getNome());
        System.out.println("Data de Nascimento: " + objProfessor.getDataNascimento());
        System.out.println("Salário: R$ " + df.format(objProfessor.getSalario()));
        
    }
    
}
