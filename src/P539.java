/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p539;

import java.util.Scanner;

public class P539 {

    static java.util.Scanner in;

    public static boolean casoDePrueba() {
        int nuevo, anyo, dato1, dato2;
        if (!in.hasNext()) {
            return false;
        }
        nuevo = in.nextInt();
        anyo = in.nextInt();
        dato1 = (anyo % 10) + 1;
        dato2 = nuevo % 10;
      
        if ((dato1-dato2)%10==0 || dato1 - dato2==10) {
            System.out.println("FELIZ DECADA NUEVA");
        } else {
            System.out.println("TOCA ESPERAR");
        }
       // System.out.println("Nuevo: " + dato2 + " Decada: " + dato1);
        return true;
    }

    public static void main(String[] args) {
        //Scanner in = new Scanner(System.in);
        in = new java.util.Scanner(System.in);
        while (casoDePrueba());
    }
}
