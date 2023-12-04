/* @author Lucía González Rosas */

/* En este programa se registrará el sueldo de un número de varones y mujeres de una
 * empresa. Para ello, se pedirá por pantalla el número de personas trabajando en la
 * empresa, su género (siendo el 0 para los varones y el 1 para las mujeres) y el
 * salario que posee cada uno para, luego, mostrar la media del salario de cada género.
 */

import java.util.Scanner;

public class Arrays10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Dime el número de personas actuales de la empresa:");
        int numero = scanner.nextInt();

        int numeroDeVarones = 0;
        int numeroDeMujeres = 0;
        int sumaDeLosVarones = 0;
        int sumaDeLasMujeres = 0;

        float sueldos[][] = new float[numero][2];

        for (int i = 0; i < sueldos.length; i++) {
            for (int j = 0; j < sueldos[0].length; j++) {
                if (j == 0) {
                    System.out.print("Dime el género (un 0 para el varón y un 1 para la mujer) de la " + (i + 1) + "º. persona:");

                    sueldos[i][j] = scanner.nextFloat();

                }

                if (j == 1) {
                    System.out.print("Dime su sueldo: ");

                    sueldos[i][j] = scanner.nextFloat();

                }
            }
        }

        for (int i = 0; i < sueldos.length; i++) {
            for (int j = 0; j < sueldos[0].length; j++) {
                System.out.print(sueldos[i][j] + " ");

            }

            System.out.println("");

        }

        for (int i = 0; i < sueldos.length; i++) {
            if (sueldos[i][0] == 0.0) {
                numeroDeVarones++;

                sumaDeLosVarones += sueldos[i][1];

            }
            if (sueldos[i][0] == 1.0) {
                numeroDeMujeres++;
                
                sumaDeLasMujeres += sueldos[i][1];

            }
        }

        System.out.println("El sueldo medio de los varones de la sala es: " + (sumaDeLosVarones / numeroDeVarones));
        System.out.println("El sueldo medio de las mujeres de la sala es: " + (sumaDeLasMujeres / numeroDeVarones));

    }
}
