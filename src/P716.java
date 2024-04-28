/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package p716;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author VeNtU
 */
public class P716 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        do {
            int nPruebas = in.nextInt();
            ArrayList<Integer> enchufes = new ArrayList<Integer>();

            if (nPruebas == 0) {
                break;
            }
            for (int i = 0; i < nPruebas; i++) {
                enchufes.add(in.nextInt());
            }
            if (nPruebas == 1) {
                System.out.println(enchufes.get(0));
            } else {
                int suma=0;
                for (int i = 0; i < nPruebas; i++) {
                    suma+=enchufes.get(i);
                    //System.out.println(i);
                }
                System.out.println(suma-(nPruebas-1));
            }
        } while (true);
    }
}
