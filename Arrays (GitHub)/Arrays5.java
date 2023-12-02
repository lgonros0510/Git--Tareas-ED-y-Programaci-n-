/* @author Lucía González Rosas */

/* En este programa se creará un array de 10 números enteros para, luego,
 * mostrar un menú con tres opciones ('a' si queremos ver todos los valores
 * por pantalla, 'b' para pedir un valor y pocisión de uno de los números, y
 * 'c' si queremos salir del menú).
 */

import java.util.Scanner;

public class Arrays5 {
    public static void main(String[] args) {
        
        Scanner enteros = new Scanner(System.in);

        int vector[] = new int[10];
        boolean continuarMenu = true;
        String opcion;

        while (continuarMenu) {

            System.out.println();
            System.out.println("MENU PRINCIPAL");
            System.out.println("a. Mostrar valores");
            System.out.println("b. Introducir valor");
            System.out.println("c. Salir");
            System.out.print("Elige una opción y presiona intro: ");

            opcion = enteros.nextLine();
            
            switch(opcion) {
                case "a":
                    for (int i = 0; i < vector.length; i++) {
                        System.out.print(vector[i] + " ");

                    }

                    System.out.println();

                    break;
                
                case "b":
                    int valorArray, posicionArray;

                    System.out.print("Valor del array: ");
                    valorArray = enteros.nextInt();

                    System.out.println("Posición del array: ");
                    posicionArray = enteros.nextInt();

                    if (posicionArray < 0 || posicionArray >= vector.length) {
                        System.out.println("La posición está fuera del límite.");

                    } else {
                        vector[posicionArray] = valorArray;

                    }

                    break;
                    
                case "c":
                    System.out.println("Fin del programa.");
                    
                    continuarMenu = false;

                    break;
                    
                default:
                    System.out.println("La opción es incorrecta.");
                    
                    break;
                    
            }

            enteros.nextLine();
        
        }
    }
}
