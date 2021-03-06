/**
 *
 * @author Marcio Sousa
 */
public class Exemplo3 {
    
    public static void main(String[] args) {
        int x;
        
        x = (int)(Math.random() * 100);
        
        if(x < 50){
            System.out.println("O valor " + x + " é menor que 50.");
        }
        else{
            System.out.println("O valor " + x + " é maior ou igual a 50.");
        }
    }
    
}
