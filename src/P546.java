/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p546;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author VeNtU
 */
public class P546 {

    /**
     * @param args the command line arguments
     */
    static java.util.Scanner in;

    public static void main(String[] args) {
        in = new java.util.Scanner(System.in);
        int casos, n, m, temp;
        ArrayList<Integer> N = new ArrayList<Integer>();
        ArrayList<Integer> M = new ArrayList<Integer>();
        ArrayList<Integer> repesN = new ArrayList<Integer>();
        ArrayList<Integer> repesM = new ArrayList<Integer>();

        casos = in.nextInt();
        for (int i = 0; i < casos; i++) {
            repesN.clear();
            repesM.clear();
            N.clear();
            M.clear();
            n = in.nextInt();
            for (int j = 0; j < n; j++) {
                temp = in.nextInt();
                N.add(temp);

            }
            m = in.nextInt();
            for (int j = 0; j < m; j++) {
                temp = in.nextInt();
                M.add(temp);
            }

            Collections.sort(N);
            Collections.sort(M);
            System.out.println("imprime N");
            imprime(N);
            System.out.println("imprime M");
            imprime(M);

            for (int j = 1; j < n; j++) {
                 System.out.println("N cromos " + j + ": " + N.get(j) + " / " + N.get(j-1) + " " + !loTiene(N.get(j), M));
                if ((int)N.get(j) == (int) N.get(j - 1) ) {
                     System.out.println("Añado el " + N.get(j));
                    repesN.add(N.get(j));
                }
            }

            for (int j = 1; j < m; j++) {
                // System.out.println("M cromos" + j + ": " + M.get(j) + " / " + M.get(j-1)  + " " + !loTiene(M.get(j), N));
                if (M.get(j) == M.get(j - 1) ) {  //&& !loTiene(M.get(j), N)
                     System.out.println("Añado el " + M.get(j));
                    repesN.add(M.get(j));
                }
            }
            System.out.println("REPES 1");
            imprime(repesN);
            System.out.println("REPES 2");
            imprime(repesM);

        }
    }

    //funcion que dice si un cromo a está en el array array
    public static boolean loTiene(int a, ArrayList arraylist) {
        for (int i = 0; i < arraylist.size(); i++) {
            if (a == (int) arraylist.get(i)) {
                return true;
            }
        }
        return false;
    }

    public static void imprime(ArrayList X) {
        if (X.size() > 0) {
            for (int i = 0; i < X.size(); i++) {
                if (i == X.size() - 1) {  //Si es el ultimo no imprimo espacio
                    System.out.print(X.get(i));
                } else {
                    System.out.print(X.get(i) + " ");
                }
            }
        } else {
            System.out.print("Nada que intercambiar");
        }
        System.out.print("\n");
    }

}
