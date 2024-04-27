/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p545;

import java.util.Arrays;

/**
 *
 * @author VeNtU
 */
public class P545 {

    static java.util.Scanner in;

    public static boolean casoDePrueba() {
        int L, N, coches[][], minimo = 9999999, indice = 0;
        int tiempos[];
        coches = new int[2][50000];
        tiempos = new int[50000];

        if (!in.hasNext()) {
            return false;
        }

        //aqui va el programa
        L = in.nextInt();  // longitud trayecto
        N = in.nextInt();  // numero de coches a evaluar

        for (int i = 0; i < N; i++) {
            coches[0][i] = in.nextInt();  // tiempo inicial
            coches[1][i] = in.nextInt(); //velocidad
            tiempos[i] = L / coches[1][i] + coches[0][i];
        }
        
 
        for (int i = 0; i < N; i++) {
            if (coches[0][i] >= 0) {
                indice = i;
                minimo = tiempos[i];
                break;
            }

        }

        for (int i = indice; i < N; i++) {
            if (tiempos[i] < minimo && coches[1][i] > coches[1][indice]) {
                minimo = tiempos[i];
                indice = i;
            }

        }
        System.out.println(minimo);

        //fin del programa
        return true;
    }

    public static void main(String[] args) {
        in = new java.util.Scanner(System.in);
        while (casoDePrueba());
    }

}
