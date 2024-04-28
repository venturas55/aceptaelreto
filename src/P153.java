package p153;

import java.util.Scanner;

public class P153 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numCasos;
        numCasos = in.nextInt();
        in.nextLine();
        for (int i = 0; i < numCasos; i++) {
            String horaEspejo = in.nextLine();
            String[] hora = horaEspejo.split(":");
            String horS, minS;
            int horas = Integer.parseInt(hora[0]);
            int minutos = Integer.parseInt(hora[1]);

            //tratamos minutos
            if (minutos > 0 && minutos <= 60) {
                minutos = 60 - minutos;
            }

            //tratamos las horas
            if (horas < 12) {
                horas = 12 - horas;
                if (minutos != 0) {
                    horas--;
                }
            } else if (horas == 12 && minutos > 0) {
                horas = 11;
            }
             if (horas == 0) horas = 12;
            //Para completar con un 0
            if (horas < 10) {
                horS = "0" + horas;
            } else {
                horS = Integer.toString(horas);
            }

            //Para completar con un 0
            if (minutos < 10) {
                minS = "0" + minutos;
            } else {
                minS = Integer.toString(minutos);
            }
            System.out.println(horS + ":" + minS);
            //System.out.printf("%02d:%02d\n", horas, minutos);
        }
    }

}
