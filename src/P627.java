/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p627;

import java.util.Scanner;

/**
 *
 * @author VeNtU
 */
public class P627 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        int diasVividos;

        do {

            String fecha_string = in.nextLine();
            String[] parte1 = fecha_string.split(" ");
            String[] fecha = parte1[0].split("/");

            if (fecha[0].equals("00") && fecha[1].equals("00") && fecha[2].equals("0000") && parte1[1].equals("0") && parte1[2].equals("0") && parte1[3].equals("0")) {
                break;
            }

            //CODIGO
            
            diasVividos = Integer.parseInt(parte1[3])+ Integer.parseInt(parte1[2])*28+Integer.parseInt(parte1[1])*28*12;
            
            System.out.println(diasVividos);
            
            // FIN CODIGO
        } while (true);

    }

    public static boolean esBisiesto(int anyo) {
        if (anyo % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static String completar(String num) {
        while (num.length() < 4) {
            num = "0" + num;
        }
        return num;
    }
    

}
