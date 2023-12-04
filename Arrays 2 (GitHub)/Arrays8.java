/* @auhtor Lucía González Rosas */

/* En este programa se creará una matriz de tamaño 'NxM' donde se introducirá en ella
 * los valores 'MxN' para que, luego, muestre la cantidad de valores mayores que 0, 
 * menores que 0 e iguales a 0 por pantalla.
 */

import java.util.Scanner;

public class Arrays8 {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        int filas;
        int columnas; 
        int mayoresQueCero = 0;
        int menoresQueCero = 0;
        int igualesACero = 0;

        System.out.println("Introduzca un número de filas");

        filas = scanner.nextInt();

        System.out.println("Introduzca en número de columnas");

        columnas = scanner.nextInt();

        int matriz[][] = new int[filas][columnas];

        for (int i = 0; i < matriz.length; i++) {
            for (int x = 0; x < matriz[0].length; x++) {
                System.out.println("Introduzca el valor de la " + (i + 1) + "º. fila y la " + (x + 1) + "º. columna:");

                matriz[i][x] = scanner.nextInt();

                if (matriz[i][x] < 0) {
                    menoresQueCero++;

                } else if (matriz[i][x] > 0) {
                    mayoresQueCero++;

                } else {
                    igualesACero++;

                }
            }
        }

        System.out.println("Hay " + menoresQueCero + " valores menores que cero en la matriz");
        System.out.println("Hay " + mayoresQueCero + " valores mayores que cero en la matriz");
        System.out.println("Hay " + igualesACero + " valores iguales a cero en la matriz");

    }
}
