/**************************************************
 *
 * @author Carlos Alberto Neto 201919070460
 * @author Denner Vidal 201919070664
 * Trabalho Prático 1
 * Professor(a): Phelipe Fabres
 *
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        int k, n = 1;
        Classificador classificador;
        String frase;

        k = tc.nextInt();
        
        while(k != 0){
        	classificador = new Classificador();
            for(int i=0; i <= k; i++){
                frase = tc.nextLine();
                if(!frase.equals(""))
                	classificador.receberDados(frase);
            }
            System.out.println("Teste " + n++);
            classificador.imprimirAutores();
            System.out.println();
            k = tc.nextInt();
        }
        tc.close();
    }
}
