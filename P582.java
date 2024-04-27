package P582;

import java.util.Scanner;

public class P582 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int N, a, b;
        float resp;
        N = entrada.nextInt();
        for (int i = 0; i < N; i++) {
               a = entrada.nextInt();
               b = entrada.nextInt();
               resp = a/(a+b)*100;
               System.out.println((int)resp);
            }
        }
    }
