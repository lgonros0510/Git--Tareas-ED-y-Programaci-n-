/* @author Lucía González Rosas */

/* En este programa se nos mostrará cuántas vocales tiene una frase escrita por consola. */

import java.util.Scanner;

public class Strings4 {
    public static void main(String[] args) {
        
        Scanner texto = new Scanner(System.in);

        System.out.println("Introduzca una frase cualquiera:");
        String frase = texto.nextLine();

        int a = 0;
        int e = 0; 
        int i = 0; 
        int o = 0; 
        int u = 0;

        for (int x = 0; x < frase.length(); x++) {
            char actual = frase.toLowerCase().charAt(x);
        
            switch (actual) {
                case 'a':
                    a++;
                    break;
                case 'e':
                    e++;
                    break;
                case 'i':
                    i++;
                    break;
                case 'o':
                    o++;
                    break;
                case 'u':
                    u++;
                    break;
                default:
                    break;
            }
        }
        
        System.out.println("Total de vocales: " + (a + e + i + o + u));
        
        System.out.println("Cantidad de vocales 'a' en la frase: " + a);
        System.out.println("Cantidad de vocales 'e' en la frase: " + e);
        System.out.println("Cantidad de vocales 'i' en la frase: " + i);
        System.out.println("Cantidad de vocales 'o' en la frase: " + o);
        System.out.println("Cantidad de vocales 'u' en la frase: " + u);

    }
}
