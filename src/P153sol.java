/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package p153sol;

import java.util.Scanner;

public class P153sol {

    public static void main(String[] args) {

        final Scanner s = new Scanner(System.in);

        int horas, mins, casos = s.nextInt();
        String[] fecha;
        s.nextLine();

        for (int i = casos; i > 0; i--) {

            fecha = s.nextLine().split(":");
            horas = Integer.parseInt(fecha[0]);
            mins  = Integer.parseInt(fecha[1]);

            mins = 60 - mins;
            if (mins == 60) mins = 0;
            
            horas = 12 - horas;
            if (mins != 0) horas--;
            horas = (horas + 12) % 12;
            
            if (horas == 0) horas = 12;

            System.out.printf("%02d:%02d\n", horas, mins);
        }

    }

}
