package p624;

import java.util.Scanner;

public class P624 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] calcetin = new int[1000];
        int dif, pos,max;
        do {
            int nPruebas = in.nextInt();

            if (nPruebas == 0) {
                break;
            }
            //CODIGO

            for (int i = 0; i < nPruebas; i++) {
                calcetin[i] = in.nextInt();
            }
            //cuento el primero y empiezo el bucle
            dif=1;
            max=1;
            for (int i = 1; i < nPruebas; i++) {
                pos = estaRepe(calcetin, calcetin[i], i );
               // System.out.println(pos);
                //Si lo encuentro
                if (calcetin[i]!=0 && pos != -1) {
                    //los emparejo
                   // System.out.println(calcetin[i] + " esta en pos: " + i);
                    calcetin[i] = 0;
                    calcetin[pos] = 0;
                    //resto un calcetin diferente
                    dif--;
                } else {
                    //si no está, añado un calcetin diferente
                   // System.out.println("sumo");
                    dif++;
                    if(dif>max)
                        max=dif;
                }

            }
            System.out.println(max);

        } while (true);
    }

    
    //devuelve en que posicion esta, o -1 si no esta
    public static int estaRepe(int[] calcetin, int tipo, int pos) {
        for (int i = 0; i < pos; i++) {
            //System.out.println("It: " + i+ " \t "+ calcetin[i] + " es "+ tipo + " ?");
            if (calcetin[i] == tipo) {
                return i;
            }
        }
        return -1;
    }
    
    
}
