/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package p721;

import java.util.Scanner;

/**
 *
 * @author VeNtU
 */
public class P721 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numCasos, bolas, paquete,numero;

        numCasos = in.nextInt();
        for (int i = 0; i < numCasos; i++) {
            bolas = in.nextInt();
            paquete = 0;
            numero=0;

            do {
                paquete=paquete+(numero+1);
                bolas = bolas - paquete;
                
                numero++;
                //System.out.println(bolas +" / "+ paquete);
            } while (bolas >= 0);
            System.out.println(numero-1);
        }

    }
}
