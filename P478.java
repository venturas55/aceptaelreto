package p478;

import java.util.Scanner;

public class P478 {

    public static int[] danos = new int[200002];

    public static void main(String[] args) {
        int N;
        long total, acum;
        Scanner entrada = new Scanner(System.in);
        while (true) {
            acum = 0;
            N = entrada.nextInt();
            if (N == 0) {
                break;
            }

            for (int i = 0; i < N; i++) {
                danos[i] = entrada.nextInt();
                acum += danos[i];
            }
            total = entrada.nextLong();

            dos(N, acum - total);
        }
    }

    public static void dos(int maximo, long resta) {
        int i = 0;
        int j = maximo-1;
        while (true) {
            if (resta == danos[i] + danos[j]) {
                System.out.println(danos[i] + " " + danos[j]);
                break;
            } else if (resta < danos[i] + danos[j]) {
                j--;
            } else {
                i++;
            }

        }
    }

}
