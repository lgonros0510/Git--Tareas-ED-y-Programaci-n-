/** @author Lucía González Rosas */

/* En este programa se le pedirá al usuario 20 números enteros, donde los 10
 * primeros se introducirán en un array y los 10 últimos en otro array para,
 * luego, compararlos y decirle al usuario si son iguales o no.
 */

import java.util.Arrays;
import java.util.Scanner;

public class ActividadAmpliacion17 {
    public static void main(String[] args) {

        int array1[] = new int[10];
        int array2[] = new int[10];
        
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < array1.length; i++) {
            System.out.print("Introduzca los valores del primer array: ");

            array1[i] = scanner.nextInt();
            
        }

        for (int i = 0; i < array2.length; i++) {
            System.out.print("Introduzca los valores del segundo array: ");

            array2[i] = scanner.nextInt();

        }
        
        if (Arrays.equals(array1, array2)) {
            System.out.println("Ambos arrays son iguales.");

        } else {
            System.out.println("Los dos arrays no son iguales.");
        
        }
    }
}
