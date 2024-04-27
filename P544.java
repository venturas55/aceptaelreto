package p544;

import java.util.Arrays;
import java.util.Scanner;

public class P544 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {

            int N, P, count;
            count = 1;

            N = in.nextInt();
            P = in.nextInt();
            int[] pesos = new int[N];

            for (int i = 0; i < N; i++) {
                pesos[i] = in.nextInt();
            }
            Arrays.sort(pesos);

            if (N > 1) {
                for (int i = 0; i < N - 2; i++) {
                    if (pesos[i] > P) {
                        break;
                    } else if (pesos[i] + pesos[i + 1] <= P) {
                        count++;
                    }
                }
            } else {
                // System.out.println("uno o menos");
                if (pesos[0] <= P) {
                    count = 1;
                } else {
                    count = 0;
                }

            }
            System.out.println(count);
        }
    }

}
