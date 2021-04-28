package fatec.poo.model;

/**
 *
 * @author Marcio Sousa
 */
public class Departamento {
    private String sigla;
    private String nome;
    private Funcionario[] funcionarios; //agrupamento de ponteiros - multiplicidade 1..*
    private int numFunc; //Índice da Matriz
    
    public Departamento(String sigla, String nome) {
        this.sigla = sigla;
        this.nome = nome;
        funcionarios = new Funcionario[10];
        numFunc = 0;
    }
    
    public String getSigla() {
        return sigla;
    }
    
    public String getNome() {
        return nome;
    }
    
    //tem como parâmetro de entrada o endereço de um
    //Funcionário (Horista, Mensalista ou Comissionado)
    public void addFuncionario(Funcionario f){
        funcionarios[numFunc] = f;
        numFunc++;
    }
    
    public void listarFuncionarios(){
        System.out.println("\nSigla: " + sigla);
        System.out.println("Nome: " + nome);
        System.out.println("Nº Funcionários: " + numFunc);
        //System.out.printf("\n%-15s %-15s %-15s\n", "Registro","Nome","Cargo");
        System.out.printf("\nRegistro\tNome\t\tCargo\n");
        for(int t = 0; t < numFunc ;t++){
            //System.out.printf("%-15s %-15s %-15s\n", funcionarios[t].getRegistro(),funcionarios[t].getNome() , funcionarios[t].getCargo());
            System.out.print(funcionarios[t].getRegistro() + "\t\t");
            System.out.print(funcionarios[t].getNome() + "\t");
            System.out.println(funcionarios[t].getCargo());
        }
    }
    
}
