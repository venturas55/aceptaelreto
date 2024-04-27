package p480;

import java.util.Scanner;

public class P480 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int N, A, B, casos;
        casos = entrada.nextInt();

        for (int i = 0; i < casos; i++) {
            N = entrada.nextInt();
            A = entrada.nextInt();
            B = entrada.nextInt();
            if (N % B < A) {
                System.out.println(N / B * A + N % B);
            } else {
                System.out.println(N / B * A + A);
            }
        }

    }

}
