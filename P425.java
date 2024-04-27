/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package p425;

import java.util.Scanner;

/**
 *
 * @author VeNtU
 */
public class P425 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {

            String palabra = in.nextLine();
            int numLetras = 0;
            boolean flag;
            while (palabra.length() > 0) {
                flag = false;
                for (int i = 1; i < palabra.length(); i++) {
                    if (palabra.charAt(0) == palabra.charAt(i)) {
                        //System.out.println(i + " " + palabra.substring(0, i) + " "+palabra.substring(i+1));
                        palabra = palabra.substring(0, i) + palabra.substring(i + 1);
                        //System.out.println(">"+palabra);
                        palabra = palabra.substring(1);
                        //System.out.println(">>"+palabra);
                        flag = true;
                        break;

                    }

                }
                if (!flag) {
                    palabra = palabra.substring(1);
                    numLetras++;

                }

            }
            if (numLetras <= 0) {
                System.out.println("0");
            } else {
                System.out.println(numLetras - 1);
            }

        }

    }

}
