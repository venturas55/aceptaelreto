/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p543;

/**
 *
 * @author VeNtU
 */
public class P543 {

    static java.util.Scanner in;

    public static void main(String[] args) {
        in = new java.util.Scanner(System.in);
        int N, S, x[], y[], r[], conflictos;
        x = new int[100];
        y = new int[100];
        r = new int[100];
        N = in.nextInt();
        for (int i = 0; i < N; i++) {
            S = in.nextInt();
            conflictos = 0;
            for (int j = 0; j < S; j++) {
                x[j] = in.nextInt();
                y[j] = in.nextInt();
                r[j] = in.nextInt();
            }
            for (int k = 0; k < S; k++) {
                for (int l = k + 1; l < S; l++) {
                    if (  Math.sqrt(Math.pow((x[k] - x[l]), 2) + Math.pow((y[k] - y[l]), 2)) < (r[k] + r[l])) {
                        //System.out.println("1: "+Math.sqrt(Math.pow((x[k] - x[l]), 2) + Math.pow((y[k] - y[l]), 2))  + " 2: "+(r[k] + r[l]) );
                        conflictos++;
                    }
                }
            }
            System.out.println(conflictos);
        }
    }
}
