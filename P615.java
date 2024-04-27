package p615;

import java.util.Scanner;

public class P615 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        int N = sc.nextInt();

        for (i = 0; i < N; i++) {
            int n = sc.nextInt();
            int f = sc.nextInt();
            int t = sc.nextInt();

            while (t > n) {

                t = t-(n+1);

            }
            System.out.println(t * f);
        }
    }
}
