/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package p715;

import java.util.Scanner;


public class P715 {
        public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numCasos,uvas,personas;

        numCasos = in.nextInt();
        for (int i = 0; i < numCasos; i++) {
            uvas = in.nextInt();
            personas = in.nextInt();
            if(uvas<personas*12)
                System.out.println("NO");
            else
                System.out.println("SI");
        }
    }

}

