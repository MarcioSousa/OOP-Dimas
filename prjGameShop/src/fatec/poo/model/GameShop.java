package fatec.poo.model;

/**
 *
 * @author Marcio Sousa
 */
public class GameShop {
    private int codigo;
    private int idade;
    private double qtdehoras;
    
    public GameShop(int codigo, int idade){
        this.codigo = codigo;
        this.idade = idade;
    }
    
    public int getCodigo() {
        return codigo;
    }

    public int getIdade() {
        return idade;
    }

    public double getQtdehoras(){
        return qtdehoras;
    }

    public void comprar(double qtdeHoras){
        qtdehoras += qtdeHoras;
    }
    
    public void jogar(double qtdeHoras){
        qtdehoras -= qtdeHoras;
    }
    
    public void brinde(){
        qtdehoras = qtdehoras * 2;
    }
    
    
    
}
