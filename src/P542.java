package p542;

import java.util.Arrays;

public class P542 {

    static java.util.Scanner in;

    public static void main(String[] args) {

        in = new java.util.Scanner(System.in);
        int N, juguete[] = new int[3], caja[] = new int[3], aux;
        boolean cabe;
        N = in.nextInt();
        for (int i = 0; i < N; i++) {
            cabe = true;
            juguete[0] = in.nextInt();
            juguete[1] = in.nextInt();
            juguete[2] = in.nextInt();
            caja[0] = in.nextInt();
            caja[1] = in.nextInt();
            caja[2] = in.nextInt();
            
            
            Arrays.sort(juguete);
            Arrays.sort(caja);
            

            for (int j = 0; j < 3; j++) {
                if (juguete[j] >= caja[j]) {
                    cabe = false;
                    break;
                }
            }
      

            if (cabe) {
                System.out.println("SIRVE");
            } else {
                System.out.println("NO SIRVE");
            }

        }

    }

}
