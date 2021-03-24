package fatec.poo.model;

/**
 *
 * @author Marcio Sousa
 * GENERALIZAÇÃO / ESPECIALIZAÇÃO / HERANÇA
 * ESPECIALIZAÇÃO - SUBCLASSE
 * 
 */
public class Aluno extends Pessoa{
    private int regEscolar;
    private double mensalidade;

    public Aluno(int regEscolhar, String nome, String dataNascimento) {
        super(nome, dataNascimento);    //CHAMADA AO MÉTODO CONSTRUTOR DA CLASSE PESSOA.
        this.regEscolar = regEscolhar;
    }

    public int getRegEscolar() {
        return regEscolar;
    }

    public double getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(double mensalidade) {
        this.mensalidade = mensalidade;
    }
    
}
