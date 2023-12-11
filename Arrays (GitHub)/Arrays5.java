/** @author Lucía González Rosas */

/* En este programa se creará un array de 10 números enteros para, luego,
 * mostrar un menú con tres opciones ('a' si queremos ver todos los valores
 * por pantalla, 'b' para pedir un valor y pocisión de uno de los números, y
 * 'c' si queremos salir del menú).
 */

import java.util.Scanner;

public class Arrays5 {
    public static void main(String[] args) {

        Scanner array = new Scanner(System.in);

        /* Primero se crean el array de 10 números enteros, el boolean que indica si
         * queremos salir o no del programa y las opciones disponibles que haya.
         */
        int vector[] = new int[10];
        boolean continuarMenu = true;
        String opcion;

        /* En un bucle 'while' se creará, mientras sigamos en el programa, un menú con 3
         * funciones por pantalla, que nos llevará a una acción u otra.
         */
        while (continuarMenu) {

            System.out.println();
            System.out.println("MENU PRINCIPAL");
            System.out.println("a. Mostrar valores");
            System.out.println("b. Introducir valor");
            System.out.println("c. Salir");
            System.out.print("Elige una opción y presiona intro: ");

            opcion = array.nextLine();
            
            /* En un bucle 'switch' se crean 3 casos: 'a' si queremos mostrar los valores que
             * introduzcamos a través del segundo caso, 'b' si queremos introducir un nuevo valor
             * introduciendo el número y su posición y 'c' si queremos salir del programa.
             */
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
                    valorArray = Integer.parseInt(System.console().readLine());

                    System.out.println("Posición del array: ");
                    posicionArray = Integer.parseInt(System.console().readLine());

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

            /* Se finalizará el programa al elegir la tercera opcón, no mostrando más información. */
            array.nextLine();
        
        }
    }
}
