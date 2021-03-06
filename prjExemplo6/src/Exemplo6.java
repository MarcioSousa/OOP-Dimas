/**
 *
 * @author Marcio Sousa
 */
public class Exemplo6 {

    public static void main(String[] args) {
        int[] tabNum; //Ponteiro para endereçamento do tipo int
        int cont;
        
        tabNum = new int[3]; //Alocação da matriz unidimencional na mamória
        tabNum[0] = 34;
        tabNum[1] = 18;
        tabNum[2] = 27;
        
        for(cont = 0; cont < 3; cont++){
            System.out.println("TabNum[" + cont + "] = " + tabNum[cont]);
        }
    }
    
}
