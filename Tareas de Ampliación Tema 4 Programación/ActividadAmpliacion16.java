import java.util.Arrays;

/** @author Lucía González Rosas */

/* En este programa se creará un array de números enteros donde se formará, a
 * partir de estos, una secuencia incrementada mostrada por pantalla (Ejemplo de
 * secuencia aritmética: 1 2 2 3 3 3 4 4 4 4 5 5 5 5 5...). Se introducirá
 * dicha secuencia hasta 10 veces como máximo, usando el método "Arrays.fill()".
 */

public class ActividadAmpliacion16 {
    public static void main(String[] args) {
        
        int incremento = 0;

        for(int i = 1; i <= 10; i++) {
            incremento += i;

        }
        
        int valoresArray[] = new int[incremento];
        
        int posicionArray = 0;
        
        for(int numero = 1; numero <= 10; numero++)  {
            Arrays.fill(valoresArray, posicionArray, posicionArray + numero, numero);
            
            posicionArray += numero;

        }

        String secuenciaAritmetica = Arrays.toString(valoresArray);

        System.out.println("La secuencia incrementada es " + secuenciaAritmetica);

    }
}
