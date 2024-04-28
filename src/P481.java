package p481;

import java.util.Scanner;

public class P481 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int fila, columna, c2;
        char c1 = 0;
        String letras = new String("hgfedcba");

        do {
            fila = entrada.nextInt();
            columna = entrada.nextInt();
            if (fila != 0) {
                c1 = letras.charAt((fila - 1));
            }
            c2 = columna;
            if (fila != 0 && columna != 0) {
                System.out.print(c1);
                System.out.println(c2);
            }
        } while (fila != 0 && columna != 0);
    }
}
