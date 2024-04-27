/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package p602;

import java.util.Scanner;

/**
 *
 * @author VeNtU
 */
public class P602 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numCasos = 0,total;

        numCasos = in.nextInt();
        for (int i = 0; i < numCasos; i++) {
            int objetivo = in.nextInt();
            if (objetivo < 3) {
                System.out.println(objetivo);

            } else if (objetivo <= 5) {
                System.out.println("3");
            } else {
                int cantidad[] = {1, 1, 3};
                int dias = 3;
                total=5;
                do {
                  
                    cantidad[0] = cantidad[1];
                    cantidad[1] = cantidad[2];
                    cantidad[2] = 2 * cantidad[0] + cantidad[1]; 
                    total+=cantidad[2];
                    dias++;
                    //System.out.print(cantidad[2] + " = " +total+" en "+dias--);
                } while (total < objetivo);
                System.out.println(dias);
            }
        }
    }
}
