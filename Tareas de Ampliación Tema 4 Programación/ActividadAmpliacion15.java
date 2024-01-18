/** @author Lucía González Rosas */

/* En este programa se le pide al usuario el tamaño "N" de un array para, posteriormente,
 * rellenarlo con "M" números en todas las posiciones que tenga. Al final, se mostrará el
 * array resultante por pantalla.
 */

import java.util.Arrays;
import java.util.Scanner;

public class ActividadAmpliacion15 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduzca el tamaño del array: ");
        int tamañoArray = scanner.nextInt();

        System.out.print("Introduzca los valores del array: ");
        int valorIntroducido = scanner.nextInt();
        
        int array[] = new int[tamañoArray];
        Arrays.fill(array, valorIntroducido);
        
        String cadena = Arrays.toString(array);

        System.out.println("El array nuevo tiene de valores " + cadena);

    }
}