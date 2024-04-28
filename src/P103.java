/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package p103;

import java.util.Scanner;

/**
 *
 * @author VeNtU
 */
public class P103 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        do {
            int[] coeficientes = new int[20];
            int n;
            double h, A = 0;
            int grado = in.nextInt();

            if (grado == 20) {
                break;
            }

            for (int i = 0; i <= grado; i++) {
                coeficientes[i] = in.nextInt();
            }

            n = in.nextInt();

            //Sumo todos los rectangulos y los voy acumulando en A
            for (int i = 1; i <= n - 1; i++) {
                h = 0;
                // COEF X  (i * 1.0 / n) ;

                //SACO LA ALTURA
                for (int j = 0; j <= grado; j++) {
                    //System.out.println( coeficientes[j]+" x " +i * 1.0 / n +" elevado a "+ j +" = " +Math.pow(i * 1.0 / n, grado-j) + " entonces h ="+h);
                    h += coeficientes[j] * Math.pow(i * 1.0 / n, grado - j);
                }
                //y la corrijo
                if (h <= 0) {
                    h = 0.0;
                } else if (h >= 1) {
                    h = 1.0;
                }

                //CALCULO BASE POR ALTURA
                A += 1.0 / n * h;
                //System.out.println(i * 1.0 / n + " x " + h + " = " + A);
            }
            if (A < 0.499) {
                System.out.println("ABEL" );
            } else if (A <= 0.501) {
                System.out.println("JUSTO" );
            } else {
                System.out.println("CAIN");
            }
        } while (true);
    }
}
