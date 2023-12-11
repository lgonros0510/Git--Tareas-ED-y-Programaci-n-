/** @author Lucía González Rosas */

/* En este programa se creará una matriz de tamaño 'NxM' donde se introducirá en ella
 * los valores 'MxN' para que, luego, muestre la cantidad de valores mayores que 0, 
 * menores que 0 e iguales a 0 por pantalla.
 */

public class Arrays8 {
    public static void main(String[] args) {

        /* Primero se crearán las variables 'int' de las filas y las columnas de la matriz, los
         * números mayores que cero, los números menores que cero y los números iguales a creo.
         */
        int filas;
        int columnas; 
        int mayoresQueCero = 0;
        int menoresQueCero = 0;
        int igualesACero = 0;

        /*Ahora se introducen el número de filas y de columnas que tendrá la matriz resultante. */
        System.out.println("Introduzca un número de filas");

        filas = Integer.parseInt(System.console().readLine());

        System.out.println("Introduzca en número de columnas");

        columnas = Integer.parseInt(System.console().readLine());

        int matriz[][] = new int[filas][columnas];

        /* Usando una sentencia 'for', se pregunta por pantalla el valor de la 'x' fila y la 'x' columna
         * (se mostrarán a medida que se lee cada espacio de la matriz, como 1-1, 1-2, etc) y se incrementará
         * el número de números mayores, menores o iguales a 0 en 1 dependiendo el valor introducido (para
         * ello se usará una sentencia 'if').
         */
        for (int i = 0; i < matriz.length; i++) {
            for (int x = 0; x < matriz[0].length; x++) {
                System.out.println("Introduzca el valor de la " + (i + 1) + "º. fila y la " + (x + 1) + "º. columna:");

                matriz[i][x] = Integer.parseInt(System.console().readLine());

                if (matriz[i][x] < 0) {
                    menoresQueCero++;

                } else if (matriz[i][x] > 0) {
                    mayoresQueCero++;

                } else {
                    igualesACero++;

                }
            }
        }

        /* Finalmente se muestran las cantidades de números mayores, menores e iguales a 0 por pantalla. */
        System.out.println("Hay " + menoresQueCero + " valores menores que cero en la matriz");
        System.out.println("Hay " + mayoresQueCero + " valores mayores que cero en la matriz");
        System.out.println("Hay " + igualesACero + " valores iguales a cero en la matriz");

    }
}
