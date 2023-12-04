/* @author Lucía González Rosas */

/* En este programa se creará una matriz de '5x5' donde almacenará los números del
 * 1 al 25 para, luego, mostrarlos por pantalla.
 */

public class Arrays6 {
    public static void main(String[] args) {

        int contador = 1;

        int numeros[][] = new int[5][5];

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[0].length; j++) {
                numeros[i][j] = contador++;

                System.out.printf("%4d", numeros[i][j]);

            }

            System.out.println("");

        } 
    }
}