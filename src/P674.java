/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package p674;

import java.util.Scanner;

public class P674 {

    public static double factorial(double numero) {
        if (numero == 0) {
            return 1;
        } else {
            return numero * factorial(numero - 1);
        }
    }

    public static boolean esDivisible(int numero1, int numero2) {
        return numero1 % numero2 == 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        do {
            int d = in.nextInt();
            int n = in.nextInt();

            if (d == 0 && n == 0) {
                break;
            }
            //----------
            
            
            
            
            
            
            
           /* for (int i = 0; i <= d; i++) {
                if (!esDivisible(d, i)) {
                    System.out.println("NINGUNO");
                    break;
                }
            }
            for (int i = 0; i < d; i++) {
                
                double fact= factorial(i);
                fac
                
                
            }*/

            //-------------
        } while (true);
    }
}
