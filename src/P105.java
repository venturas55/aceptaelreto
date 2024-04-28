package p105;

import java.util.Locale;
import java.util.Scanner;

public class P105 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in).useLocale(Locale.US);
        float venta;
        float[] semana = new float[6];
        String[] diaSemana = { "MARTES", "MIERCOLES", "JUEVES", "VIERNES", "SABADO", "DOMINGO","EMPATE" };
        String textoFinal = "";
        // diaSemana=["LUNES","MARTES","MIERCOLES","JUEVES","VIERNES","SABADO","DOMINGO"];
        int i = 0;
        do {
            venta = in.nextFloat();
            //System.out.println(">"+venta);
            if (venta == -1) {
                break;
            }

            semana[i] = venta;
            i++;
            if (i == 6) {
                if (semana[5] > media(semana))
                    textoFinal = diaSemana[maximo(semana)] + " " + diaSemana[minimo(semana)] + " SI";
                else
                    textoFinal = diaSemana[maximo(semana)] + " " + diaSemana[minimo(semana)] + " NO";
                System.out.println(textoFinal);
                i = 0;
                textoFinal = "";
            }

        } while (true);
        in.close();

    }

    public static int maximo(float[] array) {
        float maximo = array[0];
        int index=0;
        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] > maximo) {
                maximo = array[i];
                index=i;
            }else if(array[i] == maximo) {
                index=6;
            }
        }
        return index;
    }

    public static int minimo(float[] array) {
        float minimo = array[0];
        int index=0;
        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] < minimo) {
                minimo = array[i];
                index=i;
            }else if(array[i] == minimo) {
                index=6;
            }
        }
        return index;
    }

    public static float media(float[] array) {
        float suma = 0;
        for (int i = 0; i < array.length - 1; i++) {
            suma += array[i];
        }
        return (suma / array.length);
    }

}
