/** @author Lucía González Rosas */

/* En este programa se registrará el sueldo de un número de varones y mujeres de una
 * empresa. Para ello, se pedirá por pantalla el número de personas trabajando en la
 * empresa, su género (siendo el 0 para los varones y el 1 para las mujeres) y el
 * salario que posee cada uno para, luego, mostrar la media del salario de cada género.
 */

public class Arrays10 {
    public static void main(String[] args) {
        
        /* Primero se introduce el número de personas y se crean las variables double del
         * número de varones, del número de mujeres, de la suma del sueldo de los varones
         * y de la suma del sueldo de las mujeres.
         */
        System.out.print("Dime el número de personas actuales de la empresa:");
        int numero = Integer.parseInt(System.console().readLine());

        int numeroDeVarones = 0;
        int numeroDeMujeres = 0;
        int sumaDeLosVarones = 0;
        int sumaDeLasMujeres = 0;

        double sueldos[][] = new double[numero][2];

        /* Ahora, a través de una sentencia 'for', se pide por pantalla el género de la persona 'x'
         * (se mostrarán a medida que se lee cada espacio de la matriz, como 1-1, 1-2, etc), que se
         * verá como varón si se introduce un 0 o como mujer si se introduce un 1, para introducir
         * por consiguiente su sueldo.
         */
        for (int i = 0; i < sueldos.length; i++) {
            for (int j = 0; j < sueldos[0].length; j++) {
                if (j == 0) {
                    System.out.print("Dime el género (un 0 para el varón y un 1 para la mujer) de la " + (i + 1) + "º. persona:");

                    sueldos[i][j] = Double.parseDouble(System.console().readLine());

                }

                if (j == 1) {
                    System.out.print("Dime su sueldo: ");

                    sueldos[i][j] = Double.parseDouble(System.console().readLine());

                }
            }
        }

        /* Usando una sentencia 'for', se forman los arrays de los sueldos de cada varón y mujer para,
         * después y a través de una sentencia 'for', se incrementen el número de varones/mujeres y se
         * incrementen la suma de est@s junto con sus sueldos.
         */
        for (int i = 0; i < sueldos.length; i++) {
            for (int j = 0; j < sueldos[0].length; j++) {
                System.out.print(sueldos[i][j] + " ");

            }

            System.out.println("");

        }

        for (int i = 0; i < sueldos.length; i++) {
            if (sueldos[i][0] == 0) {
                numeroDeVarones++;

                sumaDeLosVarones += sueldos[i][1];

            }
            if (sueldos[i][0] == 1) {
                numeroDeMujeres++;
                
                sumaDeLasMujeres += sueldos[i][1];

            }
        }

        /* Finalmente se imprimen por pantalla el sueldo medio de cada género, siendo este formado por
         * la división de la suma de hombres/mujeres por el número de hombres/mujeres en la empresa.
         */
        System.out.println("El sueldo medio de los varones de la sala es: " + (sumaDeLosVarones / numeroDeVarones));
        System.out.println("El sueldo medio de las mujeres de la sala es: " + (sumaDeLasMujeres / numeroDeVarones));

    }
}
