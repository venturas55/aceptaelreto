
package p435;

import java.util.Arrays;
import java.util.Scanner;

public class P435 {

 
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean subnormal;
        String cadena;
        int[] valores = new int[10];

        while (true) {
            subnormal = true;
            System.out.println("Introduzca el numero a evaluar si es subnormal");
            cadena = entrada.nextLine();
            if (cadena.equals("")) {
                break;
            }
            //  6546516843546546514656546541
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
//todo leido
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
