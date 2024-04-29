package p340;

import java.util.Scanner;

public class P340 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numCasos = 0, F, C;

        numCasos = in.nextInt();
        for (int i = 0; i < numCasos; i++) {
            F = in.nextInt();
            C = in.nextInt();
            System.out.println(((C - 1) * 3 + 4) + (F - 1) * ((C - 1) * 2 + 3));
        }
        in.close();
    }
}