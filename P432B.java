/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p432b;

/**
 *
 * @author VeNtU
 */
public class P432B {

   
    static java.util.Scanner in;

    public static boolean casoDePrueba() {
        int F;
        String mapa[] = new String[20];
        F = in.nextInt();
        for (int i = 0; i < F; i++) {
                mapa[i] = in.nextLine();
        }
        imprime(mapa);
        return true;
    }

    public static void main(String[] args) {
        while (casoDePrueba());
    }

    public static void imprime(String a[]) {
        for (int i = 0; i < a.length; i++) {
                System.out.println(a[i]);
        }
    }
    
}
