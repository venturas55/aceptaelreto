package p623;

import java.util.Scanner;

public class P623 {

    public static void main(String[] args) {
        boolean gana;
        Scanner in = new Scanner(System.in);
        int numCasos;
        numCasos = in.nextInt();

        for (int K = 0; K < numCasos; K++) {
            gana = true;
            String dosnumeros = in.nextLine();
            String parte[]=dosnumeros.split(" ");
            int[] numeros1 = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
            int[] numeros2 = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < parte[0].length(); j++) {
                    if (parte[0].charAt(j) == i) {
                        numeros1[i]++;
                    }
                    if (parte[1].charAt(j) == i) {
                        numeros2[i]++;
                    }
                }

            }

            for (int i = 0; i < 10; i++) {
                if (numeros1[i] != numeros2[i]) {
                    gana = false;
                }

            }

            if (gana) {
                System.out.println("GANA");
            } else {
                System.out.println("PIERDE");
            }

        }
    }
}
/*
public static String joker(String s1, String s2) {
        System.out.println(s1+ " " + s2);
        int[] num1 = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int[] num2 = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int i = 0; i < 10; i++) {
            System.out.println(s1.length());
            for (int j = 0; j < s1.length(); j++) {
                System.out.println("entro j");
                if (s1.charAt(j) == i) {
                    num1[i]++;
                }
                if (s2.charAt(j) == i) {
                    num1[i]++;
                }
            }

        }

        for (int i = 0; i < 10; i++) {
            if (num1[i] != num2[i]) {
                return "PIERDE";
            }

        }

        return "GANA";

    }

}*/
