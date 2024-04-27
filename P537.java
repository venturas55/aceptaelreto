
package p537;

import java.util.Arrays;
import java.util.Scanner;

public class P537 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        while (in.hasNext()) {

            int c, p, C[][] = new int[2][100], siguiente = 1, i;
            Arrays.fill(C[0], -1);
            Arrays.fill(C[1], -1);
            //leo P
            p = in.nextInt();
            //leo C
            c = in.nextInt();
            for (int j = 0; j < c; j++) {
                C[0][j] = in.nextInt();
                C[1][j] = in.nextInt();
            }

            for (i = 0; i < p; i++) {

                if (esta(siguiente, C)) {
                    // System.out.println("meto: " + siguiente);
                    siguiente = estaYborro(siguiente, C);
                    //System.out.println("saco: " + siguiente);

                } else {
                    break;
                }

            }
            if (i == p - 1) {
                System.out.println("BICI"); // + siguiente + " / " + p + " "+ i
            } else {
                System.out.println("A PIE");
            }
        }
    }

    //
    public static int estaYborro(int a, int b[][]) {
        int valor;
        for (int i = 0; i < 100; i++) {
            if (a == b[0][i]) {
                valor = b[1][i];
                b[0][i] = -1;
                b[1][i] = -1;
                return valor;
            } else if (a == b[1][i]) {
                valor = b[0][i];
                b[0][i] = -1;
                b[1][i] = -1;
                return valor;
            }
        }
        return -1;
    }

    public static boolean esta(int a, int b[][]) {
        for (int i = 0; i < 100; i++) {
            if (a == b[0][i]) {
                return true;
            } else if (a == b[1][i]) {
                return true;
            }
        }
        return false;
    }
}
