/** @auhtor Lucía González Rosas */

/* En este programa vamos a crear un array de números enteros de 100 unidades
 * aleatorias entre el 1 y el 100 para, luego, pedir un valor de 'N' cualquiera
 * y mostrarnos en qué posiciones del array se encuentra dicho número.
 */

public class Arrays2 {
    public static void main(String[] args) {

        /* Primero se crea un array donde se almacenarán 100 números para, luego,
         * a través de una sentencia 'for', elegir dichos números de forma aleatoria.
         */
        int vector[] = new int[100];

        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (1 + Math.random() * 10);

        }

        /* Ahora, se introduce un número cualquiera y su posición en el array para, a
         * través de una sentencia 'if', localizar dicho número si es igual a la posición
         * introducida.
         */
        System.out.println("Introduzca el número entero a localizar en el array: ");
        int numeroEntero = Integer.parseInt(System.console().readLine());

        System.out.println("La posición del número introducido en el array es en:");
        for (int i = 0; i < vector.length; i++) {

            if (vector[i] == numeroEntero) {
                System.out.println(" " + i);
            
            }
        }

        System.out.println();
    
    }
}

