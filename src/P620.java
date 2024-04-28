package p620;

import java.util.Arrays;
import java.util.Scanner;

public class P620 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {

            //INICIO DE TU CODIGO
            int caraA, caraB;
            int numjuegos;
            int[] juegos = new int[8];

            caraA = in.nextInt();
            caraB = caraA;
            numjuegos = in.nextInt();

            //Leo todos los juegos y los ordeno de mayor a menor
            for (int i = 0; i < numjuegos; i++) {
                juegos[i] = in.nextInt() * (-1);
            }
            Arrays.sort(juegos);
            for (int i = 0; i < numjuegos; i++) {
                juegos[i] *= (-1);
            }

            /*for (int i = 0; i < numjuegos; i++) {
                System.out.println(juegos[i]);
            }*/

            //Trato los datos
             for (int i = 0; i < numjuegos; i++) {
                if (caraA >= juegos[i]) {
                    caraA -= juegos[i];
                } else if (caraB >= juegos[i]) {
                    caraB -= juegos[i];
                } else {
                    System.out.println("NO");
                    break;
                }
                if (i+1 == numjuegos) {
                    System.out.println("SI");
                }
            }
            //FIN DE TU CODIGO AQUI
        }
    }
}
