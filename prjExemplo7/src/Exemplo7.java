/**
 *
 * @author Marcio Sousa
 */
public class Exemplo7 {
    
    public static void main(String[] args) {
        //CRIE UMA MATRIZ FORMADA POR 10 ELEMENTOS DE TIPO DOUBLE.
        double[] numero = new double[10]; //Ponteiro para endereçamento do tipo double
        double soma = 0, media;

        
        //ARMAZENAMENTO DOS NÚMEROS NA MATRIZ A PARTIR DO MÉTODO DE CLASSE RANDOM().
        for(int t = 0; t < 10; t++){
            numero[t] = Math.random() * 100;
        }
        
        //EXIBIR CADA NÚMERO ARMAZENADO NA MATRIZ.
        for(int t = 0; t < 10; t++){
            System.out.println(numero[t]);
        }
        
        //CALCULAR E EXIBIR A MÉDIA ARITMÉTICA DESTES NÚMEROS.
        for(int t = 0; t < 10; t++){
            soma = soma + numero[t];
        }
        
        media = soma / 10;
        
        System.out.println("\nA soma é: " + soma);
        System.out.println("\nA média é: " + media);
        
    }
    
}
