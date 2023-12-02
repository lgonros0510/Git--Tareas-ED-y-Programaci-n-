/* @author Lucía González Rosas */

/* En este programa se realizará cálculos en referencia a la altura de varias personas.
 * Para ello, nos pedirá un valor 'N' cualquiera que se almacenará en un array con 'N'
 * alturas introducidas por teclado para, luego, mostrarnos la altura media, máxima y
 * mínima, así como cuántas personas miden por encima y por debajo de la media.
 */

import java.util.Scanner;

public class Arrays3 {
    public static void main(String[] args) {
        
        Scanner metros = new Scanner(System.in);

        System.out.println("Introduzca la cantidad de alturas que se quieran almacenar: ");
        int numeroAlturas = metros.nextInt();

        double alturas[] = new double[numeroAlturas];

        System.out.println("Introduzca cada altura que se quiera almacenar: ");

        for (int i = 0; i < alturas.length; i++) {
            alturas[i] = metros.nextDouble();

        }

        double suma = 0;
        double media;
        double max = alturas[0];
        double min = alturas[0];

        for (int i = 0; i < alturas.length; i++) {
            suma += alturas[i];

            if(alturas[i] > max) {
                max = alturas[i];

            }

            if(alturas[i] < min) {
                min = alturas[i];

            }

        }

        media = suma / numeroAlturas;

        int encima = 0;
        int debajo = 0;

        for (int i = 0; i < alturas.length; i++) {
            if(alturas[i] > media) {
                encima++;

            }

            if(alturas[i] < media) {
                debajo++;

            }
        }

        System.out.println("La altura media es de " + media + " metros.");
        System.out.println("La altura máxima es de " + max + " metros.");
        System.out.println("La altura mínima es de " + min + " metros.");
        System.out.println("El número de alturas por encima de la media es de " + encima + " alturas.");
        System.out.println("El número de alturas por debajo de la media es de " + debajo + " alturas.");
        
    }
}