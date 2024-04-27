/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package p718;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author VeNtU
 */
public class P718 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> pendientes = new ArrayList<Integer>();
        do {
            int nPruebas = in.nextInt();
            int numero, indice, total = 0;
            if (nPruebas == 0) {
                break;
            }
            pendientes.clear();
            
            for (int i = 0; i < nPruebas; i++) {
                numero= in.nextInt();
                indice=pendientes.indexOf(numero);
                if(indice==-1)
                    pendientes.add(numero);
                else{
                    pendientes.remove(indice);
                    total++;
                }
                //System.out.println(">"+pendientes);
            }

            System.out.println(total);

        } while (true);
    }
}
