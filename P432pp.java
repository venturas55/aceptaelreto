/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p432pp;

import java.util.Scanner;

public class P432pp {

    public static boolean casoDePrueba() {
        Scanner in = new Scanner(System.in);
        int F, C;
        String mapa[] = new String[20];
        F = in.nextInt();
        C = in.nextInt();
        in.nextLine();
        for (int i = 0; i < F; i++) {
            mapa[i] = in.nextLine();

        }
        //

        imprime(mapa);
        return true;
    }

    public static void main(String[] args) {

        System.out.println("h");
        while (casoDePrueba());
    }

    public static void imprime(String a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

}
