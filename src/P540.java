/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p540;

/**
 *
 * @author VeNtU
 */
public class P540 {

    static java.util.Scanner in;

    public static void main(String[] args) {
        in = new java.util.Scanner(System.in);
        int N, p = 0, e = 0, P = 0, E = 0, bajados, subidos;
        N = in.nextInt();
        for (int i = 0; i < N; i++) {

            p = in.nextInt();
            e = in.nextInt();
            P = in.nextInt();
            E = in.nextInt();
            bajados = P * e + E;
            subidos = bajados + e * p;
            System.out.println(bajados + " " + subidos);
        }
    }
}
