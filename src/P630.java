/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p630;

import java.util.Scanner;

/**
 *
 * @author VeNtU
 */
public class P630 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        do {
            int nPlayer = in.nextInt();
            int nRondas = in.nextInt();
            int nPartidas = 0;

            if (nPlayer == 0 && nRondas == 0) {
                break;
            }

            //CODIGO
            in.nextLine();
            String torneo = in.nextLine();
            for (int i = 0; i < nRondas; i++) {
                nPartidas += partidasRonda(torneo);
                torneo = siguienteRonda(torneo);

            }

            System.out.println(nPartidas);

        } while (true);
    }

    public static int partidasRonda(String ronda) {
        int partidas = 0;
        for (int i = 0; i < ronda.length(); i = i + 2) {
            if (ronda.charAt(i) == '1' && ronda.charAt(i + 1) == '1') {
                partidas++;
            }
        }
        return partidas;
    }

    public static String siguienteRonda(String ronda) {
        String nextRonda = "";
        for (int i = 0; i < ronda.length(); i = i + 2) {
            if (ronda.charAt(i) == '1') {
                nextRonda += "1";
            } else if (ronda.charAt(i + 1) == '1') {
                nextRonda += "1";
            } else {
                nextRonda += "0";
            }
        }
        return nextRonda;
    }
}
