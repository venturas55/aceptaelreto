package p722;

import java.util.Scanner;

public class P722 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        do {
            int fila1 = in.nextInt();
            int fila2 = in.nextInt();
            int cantMayor = in.nextInt();
            int cantMenor = in.nextInt();

            if (fila1 == 0 && fila2 == 0 && cantMayor == 0 && cantMenor == 0) {
                break;
            }

            if (cantMenor > cantMayor) {
                int aux = cantMayor;
                cantMayor = cantMenor;
                cantMenor = aux;
            }

            do {
                if (fila1 > fila2) {
                    fila1 -= cantMayor;
                    fila2 -= cantMenor;
                } else {
                    fila1 -= cantMenor;
                    fila2 -= cantMayor;
                }
            } while (fila1 > 0 && fila2 > 0);
            if (fila1 == 0 && fila2 == 0) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
        } while (true);
    }
    
  
}
