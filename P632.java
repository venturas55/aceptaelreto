/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p632;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author VeNtU
 */
public class P632 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            ArrayList hilera1 = new ArrayList<>();
            ArrayList hilera2 = new ArrayList<>();
            int trozos=0;
            //your code here
            //entrada de datos
            int h1 = in.nextInt();
            int h2 = in.nextInt();
            int t = in.nextInt();
            for (int i = 0; i < h1; i++) {
                hilera1.add(in.nextInt());
            }
            for (int i = 0; i < h2; i++) {
                hilera2.add(in.nextInt());
            }

            //empiezo tratar los datos
            while (t > 0) {
                if ((int) hilera1.get(hilera1.size() - 1) > (int) hilera2.get(hilera2.size() - 1)) {
                    if ((int) hilera2.get(hilera2.size() - 1) <= t) {
                        t = t - (int) hilera2.get(hilera2.size() - 1);
                        hilera2.remove(hilera2.size() - 1);
                        trozos++;
                    } else if ((int) hilera1.get(hilera1.size() - 1) <= t) {
                        t = t - (int) hilera1.get(hilera1.size() - 1);
                        hilera1.remove(hilera1.size() - 1);
                        trozos++;
                    } else{
                        break;
                    }

                }else{
                     if ((int) hilera2.get(hilera2.size() - 1) <= t) {
                        t = t - (int) hilera2.get(hilera2.size() - 1);
                        hilera2.remove(hilera2.size() - 1);
                        trozos++;
                    } else if ((int) hilera1.get(hilera1.size() - 1) <= t) {
                        t = t - (int) hilera1.get(hilera1.size() - 1);
                        hilera1.remove(hilera1.size() - 1);
                        trozos++;
                    } else{
                        break;
                    }
                }
                    
            }
            System.out.println(trozos);

        }

    }

}
