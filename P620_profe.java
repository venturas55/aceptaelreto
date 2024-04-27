package p620_profe;

import java.util.Scanner;

public class P620_profe {

    public static boolean busqueda(int eljuego, int[] juego, int numjuegos, int cinta) {

        int i = 0;
        int cara1 = 0, cara2 = 0;
        for (i = 0; i < numjuegos; i++) {

            int position = i;
            // Obtenemos para la posicion 1, el nivel del valor del bit.
            // Si es 1, hacemos primer if, si es 0 segundo if
            if (((eljuego) & (1 << (position - 1))) != 0) {
                // Metemos en cara1
                cara1 += juego[i];
                // Si no cabe, es que no cabia
                if (cara1 > cinta) {
                    return false;
                }
            } else {
                //Metemos en cara2
                cara2 += juego[i];
                //Si no cabe, es que no cabia
                if (cara2 > cinta) {
                    return false;
                }
            }
        }
        // si han cabido todas, es que en este caso se podia guardar en la cinta
        return true;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int i, j;

        int cinta;
        int numJuegos;
        int[] juegos;
        boolean cabe = false;

        while (sc.hasNext()) {

            // Leemos tamaño cinta y juegos
            cinta = sc.nextInt();
            numJuegos = sc.nextInt();

            juegos = new int[numJuegos];

            for (i = 0; i < numJuegos; i++) {
                juegos[i] = sc.nextInt();
            }

            // Suponemos no cabe
            cabe = false;

            // Para generar las combinaciones, generamos enteros hasta 2^numjuegos. 
            // Se supone si a nivel de bit son 0, van a una cara y si es 1, a otra
            for (i = 0; i < (int) Math.pow(2, numJuegos); i++) {
                // Buscamos para combinacion con mascara de bits
                if (busqueda(i, juegos, numJuegos, cinta)) {
                    cabe = true;
                    break;
                }
            }

            // Si cabe se imprime si, sino no
            if (cabe) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
        }
    }
}
