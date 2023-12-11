/** @author Lucía González Rosas */

/* En este programa se creará una matriz de '10x10' donde se almacenará los valores
 * de las tablas de multiplicar del 1 al 10 para, luego, mostrarlas por pantalla.
*/

public class Arrays7 {
    public static void main(String[] args) {
        
        /* Primero se crea el contador (de momento de valor 1) y el array bidimensional,
         * que contendrá 10 filas y 10 columnas.
         */
        int contador = 1;

        int tablas[][] = new int[10][10];

        /* Ahora se crearán las tablas de multiplicar usando sentencias 'for', donde se irá
         * formando por el producto del contador por la suma de las columnas más 1.
         */
        for (int i = 0; i < tablas.length; i++) {
            for (int j = 0; j < tablas[0].length; j++) {
                tablas[i][j] = contador * (j + 1);

                /* Se imprimen las Tablas, introduciendo '%4d' para se que impriman de forma
                 * horizontal y no vertical (me pasó al hacerlo, por lo que investigué para
                 * dar con esta solución).
                 */
                System.out.printf("%4d", tablas[i][j]);

            }

            /* para finalizar, se incrementará el contador en 1 para formas las tablas hasta la
             * del número 10.
             */
            contador++;

            System.out.println("");

        }
    }
}
