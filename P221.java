package p221;

import java.util.Scanner;

public class P221 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numCasos;
        int[] asiento = new int[10000];
        boolean abrePuerta;
        numCasos = in.nextInt();
        for (int i = 0; i < numCasos; i++) {
            abrePuerta = true;
            int seQuedan = 0;
            int numVecinos = in.nextInt();
            for (int j = 0; j < numVecinos; j++) {
                asiento[j] = in.nextInt();
            }

            for (int j = 0; j < numVecinos; j++) {
                if (asiento[j] % 2 != 0) {
                    if (seQuedan == 0) {
                        seQuedan = j;
                    }
                }
                if (seQuedan > 0 && asiento[j] % 2 == 0) {
                    abrePuerta = false;
                    break;
                }

            }
            if(numVecinos>1){
                
            if (abrePuerta) {
                System.out.println("SI " + seQuedan );
            } else {
                System.out.println("NO");
            }
                        }else
                System.out.println("NO");

        }
    }
}
