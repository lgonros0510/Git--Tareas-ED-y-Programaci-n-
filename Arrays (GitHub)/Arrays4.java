/* @author Lucía González Rosas */

/* En este programa crearemos dos array distintos de 100 números enteros. Se introducirá en el
 * primer array todos los números del 1 al 100 para, luego, copiarlos al segundo de forma inversa,
 * mostrandos ambos resultados por pantalla.
 */
import java.util.Scanner;

public class Arrays4 {
    public static void main(String[] args) {

        Scanner enteros = new Scanner(System.in);

        int longitudArray = 100;

        int array1[] = new int[longitudArray];
        int array2[] = new int[longitudArray];

        for(int i = 0; i < longitudArray; i++) {
            array1[i] = i + 1;

        }

        for(int i = 0; i < longitudArray; i++) {
            array2[i] = array1[longitudArray - i - 1];

        }

        System.out.println("El primer array es: ");

        for(int i = 0; i < longitudArray; i++) {
            System.out.print(array1[i] + " ");
        
        }
        
        System.out.println();

        System.out.print("El segundo array es: ");

        for(int i = 0; i < longitudArray; i++) {
            System.out.print(array2[i] + " ");

        }
    }
}
