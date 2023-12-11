/** @author Lucía González Rosas */

/* En este programa se creará una matriz de '5x5' donde almacenará los números del
 * 1 al 25 para, luego, mostrarlos por pantalla.
 */

public class Arrays6 {
    public static void main(String[] args) {

        /* Primero se crea el contador (de momento de valor 1) y el array bidimensional,
         * que contendrá 5 filas y 5 columnas.
         */
        int contador = 1;

        int numeros[][] = new int[5][5];

        /* En dicho array se irá introduciendo números del 1 al 25 a través de una sentencia
         * 'for', donde se irán incrementando a medida que se vayan introduciendo en la matriz.
         */
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[0].length; j++) {
                numeros[i][j] = contador++;

                /* Finalmente se imprime la matriz, introduciendo '%4d' para se que imprima de
                 * forma horizontal y no vertical (me pasó al hacerlo, por lo que investigué para
                 * dar con esta solución).
                 */
                System.out.printf("%4d", numeros[i][j]);

            }

            System.out.println("");

        } 
    }
}