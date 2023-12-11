/** @author Lucía González Rosas */

/* En este programa vamos a crear un array con 100 números reales aletorios
 * entre el 0.0 y el 1.0, donde se pedirá un valor cualquiera 'R' y se
 * mostrará cuántos valores mayores o cercaos a 'R' hay.
 */

public class Arrays1 {
    public static void main(String[] args) {
        
        /* Primero se crea el array con los números y se realiza un Math.random()
         * para elegir un número aleatorio del array.
         */
        double vector[] = new double[100];

        for (int i = 0; i < vector.length; i++) {
            vector[i] = Math.random();
        
        }

        /* Se pide por pantalla un número real del 0.0 al 0.1 para, luego, escribir
         * un número real usando parseDouble (así se podrá meter los puntos como
         * separadores de los decimales).
         */
        System.out.println("Introduzca un número real del 0.0 a 1.0: ");
        double numeroReal = Double.parseDouble(System.console().readLine());

        /* Solamente queda identificar los números cercanos al que escribimos y, para
         * ello, creamos una sentencia 'if' que identificará dichos números (si son
         * mayores o iguales que el número introducido) para, después, mostrarlos por
         * pantalla.
         */
        int cantidadCercanaAReal = 0;

        for (int i = 0; i < vector.length; i++) {
            
            if (vector[i] >= numeroReal) {
                cantidadCercanaAReal++;
            
            }
        }
        
        System.out.println("La cantidad de números reales que sean iguales o mayores que el introducido es de: " + cantidadCercanaAReal + " números en total");
    
    }
}