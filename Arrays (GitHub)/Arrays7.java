/** @author Lucía González Rosas */

/* En este programa se introducirá una secuencia de valores incrementados
 * que, después de repetirse 10 veces, se muestran por pantalla.
 */

public class Arrays7 {
    public static void main(String[] args) {
        
        /* Primero se crea una variable 'int' que represente la cantidad de números que,
         * a través de una sentencia 'for', se irán incrementando hasta llegar a 10.
         */
        int cantidad = 0;

        for(int i = 1; i <= 10; i++) {
            cantidad += i;

        }
        
        /* Ahora se creará las variables 'int' de los valores enteros y la posición de dichos
         * valores, que se irán incrementando hasta llegar a 10 repeticiones.
         */
        int valores[] = new int[cantidad];
        
        int posicion = 0;
        
        for(int i = 1; i <= 10; i++) {
            for(int j = 0; j < i; j++) {
                valores[posicion] = i;
                
                posicion++;

            }
        }

        /* Finalmente se muestra el array incrementado por pantalla. */
        System.out.print("El array incrementado será: ");

        for(int i = 0; i < valores.length; i++) {
            System.out.print(valores[i] + " ");

        }
    }
}