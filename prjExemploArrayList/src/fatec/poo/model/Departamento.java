package fatec.poo.model;

import java.util.ArrayList;

/**
 *
 * @author Dimas
 */
public class Departamento {
    private String sigla;
    private String nome;
    private ArrayList<Funcionario> funcionarios; //multiplicidade 1..*
    //private Funcionario[] funcionarios; //multiplicidade 1..*
    //private int numFunc;
   
    public Departamento(String sigla, String nome) {
        this.sigla = sigla;
        this.nome = nome;
        funcionarios = new ArrayList<Funcionario>();
        //funcionarios = new Funcionario[10];
        //numFunc = 0;
    }

    public String getSigla() {
        return sigla;
    }

    public String getNome() {
        return nome;
    }
                                          
    public void addFuncionario(Funcionario f){
        funcionarios.add(f);
        //funcionarios[numFunc] = f;
        //numFunc++;
    }  
    
    public void listarFuncionarios(){
        System.out.println("\n\nSigla: " + sigla);
        System.out.println("Nome: " + nome);
        //System.out.println("No. de Funcionários: " + numFunc);
        System.out.println("No. de Funcionários: " + funcionarios.size());
        System.out.println("\nRegistro\t\tNome\t\tCargo");
        
        for (int x = 0; x < funcionarios.size(); x++){
            System.out.print(funcionarios.get(x).getRegistro() + "\t\t");
            System.out.print(funcionarios.get(x).getNome() + "\t\t");
            System.out.println(funcionarios.get(x).getCargo());
        }

        //for (int x = 0; x < numFunc; x++){
        //    System.out.print(funcionarios[x].getRegistro() + "\t\t");
        //    System.out.print(funcionarios[x].getNome() + "\t\t");
        //    System.out.println(funcionarios[x].getCargo());
        //}
    }
}
