/** @author Lucía González Rosas */

/* En este programa se creará un array de tamaño 30 que se rellenará de números
 * aleatorios entre el 0 y el 9 (se utilizará para ello el método "Math.random())
 * para, posteriormente, ordenar dichos números y mostrarlos por pantalla.
 */

import java.util.Arrays;

public class ActividadAmpliación18 {
    public static void main(String[] args) {
        
        int array[] = new int[30];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);

        }

        Arrays.sort(array);

        String arrayOrdenado = Arrays.toString(array);

        System.out.println("El array ordenado resultante es " + arrayOrdenado);
        
    }
}
