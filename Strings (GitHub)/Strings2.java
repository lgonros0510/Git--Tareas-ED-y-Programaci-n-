/* @author Lucía González Rosas
 */

/* En este programa nos pedirán introducir dos cadenas de texto para,
 * luego, comparar si son iguales (se hace lo mismo después, pero de
 * forma que ignore las mayúsculas y minúsculas).
 */

 import java.util.Scanner;

 public class Strings2 {
     public static void main(String[] args) {
 
         Scanner texto = new Scanner(System.in);
 
         System.out.println("Introduzca dos cadenas de texto:");
         String cadena1 = texto.nextLine();
         String cadena2 = texto.nextLine();
 
         System.out.println("¿Son las dos cadenas iguales?");
         System.out.println(cadena1.equals(cadena2));
 
         System.out.println("¿Son iguales sin importar las mayúsculas y minúsculas?");
         System.out.println(cadena1.equalsIgnoreCase(cadena2));
         
     }
 }