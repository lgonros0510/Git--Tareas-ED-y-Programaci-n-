/** @author Lucía González Rosas */

/* En este programa que permitirá almacenar una secuencia aritmética para,
 * luego, mostrarla por pantalla.
 */

public class Arrays6 {
    public static void main(String[] args) {

        /* Primero se introducen por teclado las variables 'int' correspondientes
         * al valor inicial que se vaya a introducir, el incremento que sumará a
         * cada valor y la cantidad de números que se vayan a mostrar por pantalla.
         */
        int valorInicial, incremento, numeroValores;
        int secuencia[];

        System.out.print("El valor inicial es: ");
        valorInicial = Integer.parseInt(System.console().readLine());

        System.out.print("El incremento es: ");
        incremento = Integer.parseInt(System.console().readLine());

        System.out.print("Cuántos números: ");
        numeroValores = Integer.parseInt(System.console().readLine());
        
        /* Se crea también una variable 'int' que corresponda a la secuencia formada
         * por las variables anteriores, siendo esta formada por el valor inicial más
         * el producto de 'i' por el incremento introducido anteriormente.
         */
        secuencia = new int[numeroValores];

        for (int i = 0; i < numeroValores; i++) {
            secuencia[i] = valorInicial + (i * incremento);

        }
        
        /* Finalmente se muestra por pantalla la secuencia completada. */
        System.out.print("Secuencia: ");

        for(int i = 0; i < numeroValores; i++) {
            System.out.print(secuencia[i] + " ");

        }    
    }
}