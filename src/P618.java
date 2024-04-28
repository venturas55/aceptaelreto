package p618;

import java.util.Scanner;

public class P618 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;

        int n = sc.nextInt();
        while (n != 0) {

            int[] arr = new int[n];
            for (i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int q = sc.nextInt();

            for (int j = 0; j <= q; j++) {
                int dist = 0;
                if (j != q) {
                    int a = sc.nextInt();
                    int b = sc.nextInt();
                    if (a < b) {
                        for (int k = a + 1; k < b; k++) {
                            dist += arr[k - 1];
                        }
                        System.out.println(dist);
                    } else {
                        for (int k = a; k >= b; k--) {
                            dist += arr[k - 1];
                        }
                        dist = dist * -1;
                        System.out.println(dist);
                    }

                } else {
                    System.out.println("---");
                }

            }
            n = sc.nextInt();
        } 

    }
}
