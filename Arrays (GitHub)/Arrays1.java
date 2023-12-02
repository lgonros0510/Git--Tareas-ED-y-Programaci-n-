/* @author Lucía González Rosas */

/* En este programa vamos a crear un array con 100 números reales aletorios
 * entre el 0.0 y el 1.0, donde se pedirá un valor cualquiera 'R' y se
 * mostrará cuántos valores mayores o cercaos a 'R' hay.
 */

import java.util.Scanner;

public class Arrays1 {
    public static void main(String[] args) {
        
        Scanner real = new Scanner(System.in);

        double vector[] = new double[100];

        for (int i = 0; i < vector.length; i++) {
            vector[i] = Math.random();
        
        }

        System.out.println("Introduzca un número real del 0.0 a 1.0: ");
        double numeroReal = real.nextDouble();

        int cantidadCercanaAReal = 0;

        for (int i = 0; i < vector.length; i++) {
            
            if (vector[i] >= numeroReal) {
                cantidadCercanaAReal++;
            
            }
        }
        
        System.out.println("La cantidad de números reales que sean iguales o mayores que el introducido es de: " + cantidadCercanaAReal + " números en total");
    
    }
}