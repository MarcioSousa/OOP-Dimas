package fatec.poo.model;

/**
 *
 * @author Marcio Sousa
 */
public class GameShop {
    int codigo;
    int idade;
    double qtdehoras;
    
   public int getCodigo() {
        return codigo;
    }

    public int getIdade() {
        return idade;
    }

    public double getQtdehoras() {
        return qtdehoras;
    }

    public GameShop(int codigo, int idade) {
        this.codigo = codigo;
        this.idade = idade;
    }

    public void comprar(double qtdeHoras){
        qtdehoras = this.qtdehoras + qtdeHoras;
    }
    
    public void jogar(double qtdeHoras){
    
    }
    
    public void brinde(){
        
    }
    
    
    
}
