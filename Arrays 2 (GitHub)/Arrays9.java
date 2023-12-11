/** @author Lucía González Rosas */

/* En este programa se almacenrá las notas de 4 alumnos sobre 5 asignaturas donde,
 * después de introducir dichas notas por teclado, se mostrará la nota máxima, mínima
 * y media de cada alumno.
 */

public class Arrays9 {
    public static void main(String[] args) {

        /* Primero se crean las variables double de la matriz de notas (4 filas para los alumnos
         * 5 columnas para los alumnos), la nota máxima, mínima y la media ponderada de cada alumno.
         */
        double notas[][] = new double[4][5];
        double notaMinima = 0;
        double notaMaxima = 0;
        double notaMedia = 0;
        
        /* Usando una sentencia 'for', se pregunta sobre la nota 'x' de 'x' alumno (se mostrarán a medida
         * que se lee cada espacio de la matriz, como 1-1, 1-2, etc) para, así, ir creando llas matrices de
         * notas de cada alumno, además de ir incrementando la nota media para dar con su valor al dividir el
         * resultado por 5.
         */
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[0].length; j++) {
                System.out.print("Para el " + (i+1) + "º. alumno, dime su " +(j+1)+ "º. nota: ");

                notas[i][j] = Double.parseDouble(System.console().readLine());

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

            /* Finalmente se muestra la nota máxima, la nota mínima y la media ponderada de cada alumno
             * por pantalla.
             */
            System.out.println("La nota mínima del " + (i+1) + "º. alumno es: " + notaMinima);
            System.out.println("La nota máxima del " + (i+1) + "º. alumno es: " + notaMaxima);
            System.out.println("La nota media del " + (i+1) + "º. alumno es: "+ (notaMedia/5));

            System.out.println("");

        }
    }
}
