package fatec.poo.model;

/**
 *
 * @author Marcio Sousa
 */
public abstract class Funcionario {
    private int registro ;
    private String nome;
    private String dtAdmissao;
    private String cargo;
    private Departamento departamento; //ponteiro - multiplicidade 1
    private Projeto projeto;
      
    public Funcionario(int registro, String nome, String dtAdmissao) {
        this.registro = registro;
        this.nome = nome;
        this.dtAdmissao = dtAdmissao;       
    }

    public int getRegistro() {
        return registro;
    }

    public String getNome() {
        return nome;
    }

    public String getDtAdmissao() {
        return dtAdmissao;
    }

    public String getCargo() {
        return cargo;
    }
    
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    abstract public double calcSalBruto();
   
    public double calcDesconto(){
        return(0.10 * calcSalBruto());
    }
    
    public double calcSalLiquido(){
        return(calcSalBruto() - calcDesconto());
    }
    
    //retorna o endereço de um objeto
    //da classe Departamento
    public Departamento getDepartamento() {
        return departamento;
    }
    
    //recebe como parâmetro de entrada o endereço 
    //de um objeto da classe Departamento
    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
    
    public Projeto getProjeto(){
        return projeto;
    }
    
    public void setProjeto(Projeto projeto){
        this.projeto = projeto;
    }
    
}
