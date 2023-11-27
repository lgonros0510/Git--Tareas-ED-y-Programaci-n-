/* @author Lucía González Rosas */

/* En este programa indicará si una frase que introduzcamos por teclado resulta
 * ser un palíndromo (que se lee igual por un lado que por otro) o no.
 */

import java.util.Scanner;

public class Strings5 {
    public static void main(String[] args) {
        
        Scanner texto = new Scanner(System.in);

        String frase;
        boolean palindromo = true;

        System.out.println("Introduzca una frase cualquiera:");
        frase = texto.nextLine();

        frase = frase.replace(" ", "");
        frase = frase.toUpperCase();

        int longitud = frase.length();

        for (int i = 0; i < longitud && palindromo; i++) {
            if (frase.charAt(i) != frase.charAt((longitud - 1) - i)) {
                palindromo = false;

            }
        }

        if (palindromo) {
            System.out.println("La frase introducida es un palíndromo");

        } else {
            System.out.println("La frase introducida no es un palíndromo");

        }
    }
}
