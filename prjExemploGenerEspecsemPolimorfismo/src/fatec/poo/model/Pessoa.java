package fatec.poo.model;

/**
 *
 * @author Marcio Sousa
 * GENERALIZAÇÃO / ESPECIALIZAÇÃO / HERANÇA
 * GENERALIZAÇÃO - SUPERCLASSE
 * VÍNCULO DE HERANÇA
 * 
 */
public class Pessoa {
    private String nome;
    private String dataNascimento;

    public Pessoa(String nome, String dataNascimento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }
    
}
