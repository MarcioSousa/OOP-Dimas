/**
 *
 * @author Marcio Sousa
 */
public class Exemplo5 {

    public static void main(String[] args) {
        int cont = 1, num;
        
        num = (int)(Math.random() * 100);
        System.out.println("\t\tTabuada do " + num);
        
        //for (cont = 1; cont <= 10; cont++){
        //    System.out.println(num + " x " + cont + " = " + cont * num);
        //}
        
        while(cont <= 10){
            System.out.println(num + " x " + cont + " = " + cont * num);
            cont++;
        }
        
    }
    
}
