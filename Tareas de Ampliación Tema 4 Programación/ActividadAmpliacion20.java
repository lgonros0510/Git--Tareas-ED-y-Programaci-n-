/** @author lucía González Rosas */

/* En este programa se creará un array de tamaño 1000 y se rellenará con números
 * enteros entre el 0 y el 99 (se utilizará para ello el método "Math.random())
 * para, porteriormente, pedir un número cualquiera por teclado y mostrar si existe
 * dicho número dentro del array, además del números de veces que aparece si está.
 */

import java.util.Arrays;
import java.util.Scanner;

public class ActividadAmpliacion20 {
    public static void main(String[] args) {
        
        int array[] = new int[1000];
        
        for(int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 100);

        }
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduzca un número entre el 0 y el 99 para buscarlo dentro del array: ");
        int numero = scanner.nextInt();
        
        Arrays.sort(array);

        int posicionNumero = Arrays.binarySearch(array, numero);
        
        if(posicionNumero >= 0) {
            int numeroApariciones = 0;

            for (int i = posicionNumero; i < array.length; i++) {
                if (array[i] == numero) {
                    numeroApariciones++;

                }
            }

            System.out.println("Sí existe dicho número. Aparece " + numeroApariciones  + " veces en el array.");

        } else {
            System.out.println("No existe dicho número en el array.");

        }
    }
}
