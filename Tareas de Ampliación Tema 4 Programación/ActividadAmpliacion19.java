/** @author Lucía González Rosas */

/* En este programa se mostrará un ranking de puntuaciones de un torneo de ajedrez
 * de hasta 8 jugadores, donde se le pedirá al usuario que introduzca las puntuaciones
 * de cada jugador (siendo estas números enteros entre 1000 y 2800) para, posteriormente,
 * mostrarlas de manera descendente por pantalla.
 */

import java.util.Arrays;
import java.util.Scanner;

public class ActividadAmpliacion19 {
    public static void main(String[] args) {
        
        int puntuaciones[] = new int[8];
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduzca las puntuaciones de cada jugador: ");

        for(int i = 0; i < puntuaciones.length; i++) {
            puntuaciones[i] = scanner.nextInt();

        }
        
        Arrays.sort(puntuaciones);
        
        System.out.print("Las puntuaciones de cada jugador, ordenadas de forma descendente, son ");

        for(int i = puntuaciones.length - 1; i >= 0; i--) {
            System.out.print(puntuaciones[i] + " ");

        }
    }
}
