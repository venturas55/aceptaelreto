/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p623;

import java.util.Scanner;

/**
 *
 * @author VeNtU
 */
public class p623bis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numCasos;
        numCasos = in.nextInt();
        in.nextLine();
        for (int K = 0; K < numCasos; K++) {
            String frase = in.nextLine();
            String parte[] = frase.split(" ");
            System.out.println( joker(parte[0],parte[1]));
           
        }
    }

    public static String joker(String s1, String s2) {
        int[] num1 = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int[] num2 = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < s1.length(); j++) {
                if (s1.charAt(j) == i+'0') {
                    num1[i]++;
                }
                if (s2.charAt(j) == i+'0') {
                    num2[i]++;
                }
            }
        }
        

        for (int k = 0; k < 10; k++) {
            if (num1[k] != num2[k]) {
                return "PIERDE";
            }
        }
        return "GANA";
    }
}
