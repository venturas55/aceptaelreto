package p595;

import java.util.Scanner;

public class P595 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N ,numero;
        N = in.nextInt();
        for (int i = 0; i < N; i++) {
           numero=in.nextInt();
           System.out.println(numero/100);
        }

    }
}
