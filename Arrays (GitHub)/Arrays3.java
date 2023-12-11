/** @author Lucía González Rosas */

/* En este programa se realizará cálculos en referencia a la altura de varias personas.
 * Para ello, nos pedirá un valor 'N' cualquiera que se almacenará en un array con 'N'
 * alturas introducidas por teclado para, luego, mostrarnos la altura media, máxima y
 * mínima, así como cuántas personas miden por encima y por debajo de la media.
 */

public class Arrays3 {
    public static void main(String[] args) {

        /* Primero se introducen la cantidad de alturas que almacenaremos más el valor de cada
         * una de ellas (esto último se hace con una sentencia 'for').
         */
        System.out.println("Introduzca la cantidad de alturas que se quieran almacenar: ");
        int numeroAlturas = Integer.parseInt(System.console().readLine());

        double alturas[] = new double[numeroAlturas];

        System.out.println("Introduzca cada altura que se quiera almacenar: ");

        for (int i = 0; i < alturas.length; i++) {
            alturas[i] = Double.parseDouble(System.console().readLine());

        }

        /* Ahora, se crean variables double para la suma de las alturas, la media, el máximo y
         * el mínimo para, después, ir incrementándolas según si dichas alturas son mayores o
         * menores que la media formada por la suma de todas las alturas entre el número de dichas
         * alturas.
         */
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

        /* Por último, se imprimen por pantalla los resultados de la media, el máximo, el mínimo
         * la cantidad de alturas que hay por encima o por debajo de la media registrada.
         */
        System.out.println("La altura media es de " + media + " metros.");
        System.out.println("La altura máxima es de " + max + " metros.");
        System.out.println("La altura mínima es de " + min + " metros.");
        System.out.println("El número de alturas por encima de la media es de " + encima + " alturas.");
        System.out.println("El número de alturas por debajo de la media es de " + debajo + " alturas.");
        
    }
}