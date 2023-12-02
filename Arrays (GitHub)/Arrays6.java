/* @author Lucía González Rosas */

/* En este programa que permitirá almacenar una secuencia aritmética para,
 * luego, mostrarla por pantalla.
 */
import java.util.Scanner;

public class Arrays6 {
    public static void main(String[] args) {
        
        Scanner seguir = new Scanner(System.in);

        int valorInicial, incremento, numeroValores;
        int secuencia[];

        System.out.print("El valor inicial es: ");
        valorInicial = seguir.nextInt();

        System.out.print("El incremento es: ");
        incremento = seguir.nextInt();

        System.out.print("Cuántos números: ");
        numeroValores = seguir.nextInt();
        
        secuencia = new int[numeroValores];

        for (int i = 0; i < numeroValores; i++) {
            secuencia[i] = valorInicial + (i * incremento);

        }
        
        System.out.print("Secuencia: ");

        for(int i = 0; i < numeroValores; i++) {
            System.out.print(secuencia[i] + " ");

        }    
    }
}
