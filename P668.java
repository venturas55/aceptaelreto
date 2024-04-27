/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package p668;

import java.util.Scanner;


public class P668 {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        do {
            int num0 = in.nextInt();
            int num1 = in.nextInt();
            int numN = in.nextInt();
            int aux;

            if (num0 == 0 && num1 == 0 && numN == 0) {
                break;
            }

            if (numN == 0) {
                System.out.println(num0);
                continue;
            } else if (numN == 1) {
                System.out.println(num1);
                continue;
            } else {
                for (int i =1; i < numN; i++) {
                    aux=num0;
                    num0=num1;
                    num1-=aux;
                }

            }
            System.out.println(num1);

        } while (true);
    }
}
