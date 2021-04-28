package fatec.poo.model;

/**
 *
 * @author Marcio Sousa
 */
public class Projeto {
    private int codigo;
    private String descricao;
    private String dtInicio;
    private String dtTermino;
    private Funcionario[] funcionarios;
    private int numFunc;

    public Projeto(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
        funcionarios = new Funcionario[10];
        numFunc = 0;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getDtInicio() {
        return dtInicio;
    }

    public String getDtTermino() {
        return dtTermino;
    }

    public void setDtInicio(String dtInicio) {
        this.dtInicio = dtInicio;
    }

    public void setDtTermino(String dtTermino) {
        this.dtTermino = dtTermino;
    }
    
    public void addFuncionario(Funcionario f){
        funcionarios[numFunc] = f;
        numFunc++;
    }
    
    public void listarFuncionarios(){
        System.out.println("\nCódigo: " + codigo);
        System.out.println("Descrição: " + descricao);
        System.out.println("Nº Funcionários: " + numFunc);
        //System.out.printf("\n%-15s %-15s %-15s\n", "Registro","Nome","Cargo");
        System.out.printf("\nRegistro\tNome\t\tCargo\t\t\tDepartamento\n");
        for(int t = 0; t < numFunc ;t++){
            //System.out.printf("%-15s %-15s %-15s\n", funcionarios[t].getRegistro(),funcionarios[t].getNome() , funcionarios[t].getCargo());
            System.out.print(funcionarios[t].getRegistro() + "\t\t");
            System.out.print(funcionarios[t].getNome() + "\t");
            System.out.print(funcionarios[t].getCargo() + "\t");
            System.out.println(funcionarios[t].getDepartamento().getNome());
        }
    }
    
    
}
