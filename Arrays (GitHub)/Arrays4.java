/** @author Lucía González Rosas */

/* En este programa crearemos dos array distintos de 100 números enteros. Se introducirá en el
 * primer array todos los números del 1 al 100 para, luego, copiarlos al segundo de forma inversa,
 * mostrandos ambos resultados por pantalla.
 */

public class Arrays4 {
    public static void main(String[] args) {

        /* Primero se crea una variable int de valor '100' para, después, usarla para crear los
         * dos arrays, siendo el primero de forma normal (su valor es de 'i' más 1)y el segundo
         * de forma inversa (su valor es la longitud del array menos 'i' menos 1).
         */
        int longitudArray = 100;

        int array1[] = new int[longitudArray];
        int array2[] = new int[longitudArray];

        for(int i = 0; i < longitudArray; i++) {
            array1[i] = i + 1;

        }

        for(int i = 0; i < longitudArray; i++) {
            array2[i] = array1[longitudArray - i - 1];

        }

        /* Ahora, se van creando los arrays por pantalla usando una sentencia 'for' para irlos
         * recorriendo número por número.
         */
        System.out.println("El primer array es: ");

        for(int i = 0; i < longitudArray; i++) {
            System.out.print(array1[i] + " ");
        
        }
        
        System.out.println();

        System.out.print("El segundo array es: ");

        for(int i = 0; i < longitudArray; i++) {
            System.out.print(array2[i] + " ");

        }
    }
}