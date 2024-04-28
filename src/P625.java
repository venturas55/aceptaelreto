package p625;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class P625 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numCasos, num;

        numCasos = in.nextInt();
        for (int i = 0; i < numCasos; i++) {
            boolean sigo = true;
            ArrayList listado = new ArrayList<>();
            num = in.nextInt();
            for (int j = 0; j < num; j++) {
                listado.add(in.nextInt());
            }
            if (num >= 3) {
                Collections.sort(listado, Collections.reverseOrder());

                while (sigo) {
                    if (perimetroTriangulo(listado) > 1) {
                        System.out.println(perimetroTriangulo(listado));
                        sigo = false;

                    } else if (listado.size() > 3) {
                        listado.remove(0);
                    } else if (listado.size() == 3) {
                        System.out.println("NO HAY NINGUNO");
                        sigo = false;
                    } else {
                        System.out.println("mierda");
                    }
                }
            } else {

                System.out.println("NO HAY NINGUNO");
            }
        }

    }

    public static int perimetroTriangulo(ArrayList listado) {
        int num1 = Integer.parseInt(listado.get(0).toString());
        int num2 = Integer.parseInt(listado.get(1).toString());
        int num3 = Integer.parseInt(listado.get(2).toString());

        if (num1 >= num2 + num3) {
            return -1;
        } else {
            return (num1 + num2 + num3);
        }
    }

}
