/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p476;
import java.util.Scanner;

public class P476 {

    static int[] destreza = new int[100];
    static String[] preferencia = new String[100];

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int num;
        boolean nadie;

        while (true) {
            num = entrada.nextInt();
            if (num == 0) {
                break;
            }
            for (int i = 0; i < num; i++) {
                destreza[i] = entrada.nextInt();
            }
            entrada.nextLine();
            for (int i = 0; i < num; i++) {
                preferencia[i] = entrada.next();
            }
            nadie = true;
            for (int i = 0; i < num; i++) {

                if (destreza[i] == -1) {
                    continue;
                }
                for (int j = i + 1; j < num; j++) {
                    if (destreza[j] == -1) {
                        continue;
                    }
                    if (acepta(i, j) && acepta(j, i)) {
                        nadie = false;
                        destreza[j] = -1;
                        System.out.println((i + 1) + " " + (j + 1));
                        break;
                    }
                }

            }
            if (nadie) {
                System.out.println("NO HAY");
            }

            System.out.println("---");

        }

    }

    private static boolean acepta(int a, int b) {
        if (preferencia[a].charAt(0) == '>' && (destreza[b] > preferencia[a].charAt(1) - '0')) {
            return true;
        } else if (preferencia[a].charAt(0) == '<' && (destreza[b] < preferencia[a].charAt(1) - '0')) {
            return true;
        } else if (preferencia[a].charAt(0) == '=' && (destreza[b] == preferencia[a].charAt(1) - '0')) {
            return true;
        } else {
            //System.out.println("a=" + a + " no acepta a b=" + b + " porque destreza de b es " + destreza[b] + " y preferencia " + preferencia[a]);
            return false;
        }

    }
}
