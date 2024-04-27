
package p625;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class P625array {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numCasos, num;

        numCasos = in.nextInt();
        for (int i = 0; i < numCasos; i++) {
            boolean sigo = true;
            //int[] listado = new int[3000];
            Integer[] listado = new Integer[3000];
            num = in.nextInt();
            if (num > 0) {
                for (int j = 0; j < num; j++) {
                    listado[j] = in.nextInt();
                }

                Arrays.sort(listado, Collections.reverseOrder());

                while (sigo) {
                    if (perimetroTriangulo(listado) > 1) {
                        System.out.println(perimetroTriangulo(listado));
                        sigo = false;

                    } else if (listado.length > 3) {
                        listado = Arrays.copyOfRange(listado, 1, listado.length);
                    } else if (listado.length == 3) {
                        System.out.println("NO HAY NINGUNO");
                        sigo = false;
                    }
                }
            }
        }

    }

    public static int perimetroTriangulo(Integer[] listado) {
        int num1 = listado[0];
        int num2 = listado[1];
        int num3 = listado[2];

        if (num1 >= num2 + num3) {
            return -1;
        } else {
            return (num1 + num2 + num3);
        }
    }
}
