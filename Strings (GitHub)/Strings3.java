/* @author Lucía González Rosas */

/* En este programa que pida tres cadenas de texto (un nombre y dos apellidos) para,
 * luego, concatenar las tres primeras letras de cada cadena.
 */
import java.util.Scanner;

public class Strings3 {
    public static void main(String[] args) {
        
        Scanner texto = new Scanner(System.in);

        System.out.println("Introduzca tres cadenas de texto:");
        String nombre = texto.nextLine();
        String apellido1 = texto.nextLine();
        String apellido2 = texto.nextLine();

        String primeraCadena = nombre.substring(0, 3);
        String segundaCaneda = apellido1.substring(0, 3);
        String terceraCadena = apellido2.substring(0, 3);

        String cadenaCompleta = primeraCadena + segundaCaneda + terceraCadena;

        System.out.println("La cadena resultante sería " + cadenaCompleta);
    }
    
}
