/* @author Lucía González Rosas
 */

/* En este programa nos pedirán una cadena de texto donde, cada vez que haya
 *  una palabra completa, habrá un salto de línea.
 */

import java.util.Scanner;

public class Strings1 {
    public static void main(String[] args) {
 
        Scanner texto = new Scanner(System.in);
 
        System.out.println("Introduzca una cadena de texto:");
        String textoOriginal = texto.nextLine();
 
        String[] separacion = textoOriginal.split(" ");
         
        for (String string : separacion) {
            System.out.println(string);

        }  
    }
}