/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package p600;

import java.util.Scanner;

/**
 *
 * @author VeNtU
 */
public class P600 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
      

        do {
              boolean esSilla = false;
            int F = in.nextInt();
            int C = in.nextInt();

            if (F == 0 && C == 0) {
                break;
            }
            int[][] matriz = new int[300][300];
            for (int i = 0; i < F; i++) {
                for (int j = 0; j < C; j++) {
                    matriz[i][j] = in.nextInt();
                }
            }

            for (int i = 0; i < F; i++) {
                for (int j = 0; j < C; j++) {
                    if (esSilla(matriz, F, C, i, j)) {
                        esSilla = true;
                        break;
                    }
                }
            }

            if (esSilla) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }

        } while (true);
    }

    public static boolean esSilla(int matriz[][], int F, int C, int Ai, int Aj) {
        boolean esSilla1 = true;
        boolean esSilla2 = true;
        //compruebo su FILA sean todos menores o iguales
        //System.out.println(Ai +" "+Aj);
        for (int i = 0; i < C; i++) {
            //compruebo que todos sean menores o iguales y si no es asi rompo
            if (matriz[Ai][i] > matriz[Ai][Aj]) {
                esSilla1 = false;
                //System.out.println("1: " + Ai + " " + i);
                break;
            }
        }
        //compruebo su COLUMNA sean todos mayores o iguales
        for (int i = 0; i < F; i++) {
            //compruebo que todos sean mayores o iguales y si no es asi rompo
            if (matriz[i][Aj] < matriz[Ai][Aj]) {
                esSilla1 = false;
                //System.out.println("2: " + i + " " + Aj);
                break;
            }
        }
        //Mismo pero alreves
        //compruebo su FILA sean todos mayores o iguales
        for (int i = 0; i < C; i++) {
            //compruebo que todos sean mayores o iguales y si no es asi rompo
            if (matriz[Ai][i] < matriz[Ai][Aj]) {
                esSilla2 = false;
                //System.out.println("3: " + Ai + " " + i);
                break;
            }
        }
        //compruebo su COLUMNA sean todos menores o iguales
        for (int i = 0; i < F; i++) {
            //compruebo que todos sean menores o iguales y si no es asi rompo
            if (matriz[i][Aj] > matriz[Ai][Aj]) {
                esSilla2 = false;
                //System.out.println("4: " + i + " " + Aj);
                break;
            }
        }
        //System.out.println(Ai + "/" + Aj + ": " + esSilla1 + " " + esSilla2 + "=> " + (esSilla1 || esSilla2));
        return esSilla1 || esSilla2;
    }
}
