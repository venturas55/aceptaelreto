package p629;

import java.util.Arrays;
import java.util.Scanner;

public class P629 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] casas = new int[500000];
        int[] escucha = new int[500000];
        int casasSeEscucha;
        do {
            int nCasas = in.nextInt();
            Arrays.fill(escucha, 0);
            casasSeEscucha = 0;

            if (nCasas == 0) {
                break;
            }

            //CODIGO
            for (int i = 0; i < nCasas; i++) {
                casas[i] = in.nextInt();
                if (casas[i] > 0) {
                }
            }
           // imprime(escucha, nCasas);
            //Pongo unos donde se escucha;
            for (int i = 1; i < nCasas; i++) {
                escucha = seEscucha(casas, escucha, i);

            }

            //cuentos unos, donde se escucha
            for (int i = 0; i < nCasas; i++) {
                if (escucha[i] >= 1) {
                    casasSeEscucha++;
                }
            }
            
           // imprime(escucha, nCasas);
            System.out.println(casasSeEscucha);

        } while (true);
    }

    public static int[] seEscucha(int[] casas, int[] escucha, int pos) {
        //limito para no provocar out of bounds por la izquierda
        if (casas[pos] - pos > 0) {
            casas[pos] = pos;
        }
        Arrays.fill(escucha, pos - casas[pos], pos, 1);

        return escucha;
    }

    public static void imprime(int[] escucha, int tam) {
        //System.out.println("Esta asi:");
        for (int i = 0; i < tam; i++) {
            System.out.print(escucha[i] + " ");

        }
    }
}
