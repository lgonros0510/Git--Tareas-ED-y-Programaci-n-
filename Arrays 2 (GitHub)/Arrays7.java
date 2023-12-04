/* @author Lucía González Rosas */

/* En este programa se creará una matriz de '10x10' donde se almacenará los valores
 * de las tablas de multiplicar del 1 al 10 para, luego, mostrarlas por pantalla.
*/

public class Arrays7 {
    public static void main(String[] args) {
        
        int contador = 1;

        int tablas[][] = new int[10][10];

        for (int i = 0; i < tablas.length; i++) {
            for (int j = 0; j < tablas[0].length; j++) {
                tablas[i][j] = contador * (j + 1);

                System.out.printf("%4d", tablas[i][j]);

            }

            contador++;

            System.out.println("");

        }
    }
}
