/* @author Lucía González Rosas */

/* En este programa se introducirá una secuencia de valores incrementados
 * que, después de repetirse 10 veces, se muestran por pantalla.
 */

import java.util.Scanner;

public class Arrays7 {
    public static void main(String[] args) {
        
        Scanner seguir = new Scanner(System.in);

        int cantidad = 0;

        for(int i = 1; i <= 10; i++) {
            cantidad += i;

        }
        
        int valores[] = new int[cantidad];
        
        int posicion = 0;
        
        for(int i = 1; i <= 10; i++) {
            for(int j = 0; j < i; j++) {
                valores[posicion] = i;
                
                posicion++;

            }
        }

        System.out.print("El array incrementado será: ");

        for(int i = 0; i < valores.length; i++) {
            System.out.print(valores[i] + " ");

        }
    }
}
