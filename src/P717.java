/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package p717;

import java.util.Scanner;

public class P717 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numCasos;
        String texto;

        numCasos = in.nextInt();
        in.nextLine();
        for (int i = 0; i < numCasos; i++) {
            texto = in.nextLine();
            texto = texto.replaceAll("\\s", "");

            for (int j = 0; j < 3; j++) {
                char caracter = texto.charAt(0);
                texto = texto.replaceFirst(caracter + "", "");
                texto = texto.replaceFirst(caracter + "", "");
                System.out.println(texto);
            }
            //System.out.println(texto.length());
            if (texto.length() == 0) {
                System.out.println("DIVERTIDOS");
            } else {
                System.out.println("INSULSOS");
            }
        }
    }

}
