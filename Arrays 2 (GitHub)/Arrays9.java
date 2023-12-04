/* @auhtor Lucía González Rosas */

/* En este programa se almacenrá las notas de 4 alumnos sobre 5 asignaturas donde,
 * después de introducir dichas notas por teclado, se mostrará la nota máxima, mínima
 * y media de cada alumno.
 */

import java.util.Scanner;

public class Arrays9 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        float notas[][] = new float[4][5];
        float notaMinima = 0;
        float notaMaxima = 0;
        float notaMedia = 0;
        
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[0].length; j++) {
                System.out.print("Para el " + (i+1) + "º. alumno, decidme su " +(j+1)+ "º. nota: ");

                notas[i][j] = scanner.nextFloat();

                notaMedia += notas[i][j];

                if (j == 0) {
                    notaMinima = notas[i][j];
                    notaMaxima = notas[i][j];

                }

                if(notaMinima > notas[i][j]){
                    notaMinima = notas[i][j];

                }

                if(notaMaxima < notas[i][j]){
                    notaMaxima = notas[i][j];

                }
            }

            System.out.println("La nota mínima del " + (i+1) + "º. alumno es: " + notaMinima);
            System.out.println("La nota máxima del " + (i+1) + "º. alumno es: " + notaMaxima);
            System.out.println("La nota media del " + (i+1) + "º. alumno es: "+ (notaMedia/5));

            System.out.println("");

        }
    }
}
