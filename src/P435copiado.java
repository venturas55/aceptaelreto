package p435copiado;

import java.util.Arrays;
import java.util.Scanner;

public class P435copiado {

    public static void main(String[] args) {
        boolean subnormal;
        String cadena;
        int[] valores = new int[10];
        Scanner s = new Scanner(System.in);

        while (s.hasNext()) {

            subnormal = true;
            cadena = s.nextLine();
            if (cadena.equals("")) {
                break;
            }

            Arrays.fill(valores, 0);
            for (int i = 0; i < cadena.length(); i++) {
                switch (cadena.charAt(i)) {
                    case '0':
                        valores[0]++;
                        break;
                    case '1':
                        valores[1]++;
                        break;
                    case '2':
                        valores[2]++;
                        break;
                    case '3':
                        valores[3]++;
                        break;
                    case '4':
                        valores[4]++;
                        break;
                    case '5':
                        valores[5]++;
                        break;
                    case '6':
                        valores[6]++;
                        break;
                    case '7':
                        valores[7]++;
                        break;
                    case '8':
                        valores[8]++;
                        break;
                    case '9':
                        valores[9]++;
                        break;
                }
            }

            for (int j = 1; j < 10; j++) {
                if (valores[j] != valores[j - 1]) {
                    subnormal = false;
                }
            }
            if (subnormal == false) {
                System.out.println("no subnormal");
            } else {
                System.out.println("subnormal");
            }

        }

    }

}
