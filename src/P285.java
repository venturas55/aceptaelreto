/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package p285;

import java.util.ArrayList;
import java.util.Scanner;

public class P285 {

    public static ArrayList devoradora(ArrayList<Integer> cubos) {
        if (cubos.get(0) > cubos.get(cubos.size() - 1)) {
            cubos.remove(0);
        } else {
            cubos.remove(cubos.size() - 1);
        }
        return cubos;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> cubos = new ArrayList<>();
        int maximo, suma;
        do {
            int nCubos = in.nextInt();
            maximo = 0;

            if (nCubos == 0) {
                break;
            }
            cubos.clear();
            for (int i = 0; i < nCubos; i++) {
                cubos.add(in.nextInt());
            }

            String opciones = "";
            String opcionesN = "";
            for (int i = 0; i < nCubos / 2; i++) {
                opciones += "1";
                opcionesN += "0";
            }
            //System.out.println(opciones);
            //System.out.println(Integer.parseInt(opciones,2));
            //System.out.println(Integer.parseInt(opciones,10));

            // empieza
            do {
                suma = 0;
                for (int i = 0; i < opciones.length() - 1 && cubos.size() > 0; i++) {
                    if (opciones.charAt(i) == '1') {
                        //System.out.println("me quedo el primero " + cubos.get(0));
                        System.out.println(cubos.toString());
                        suma += cubos.get(0);
                        cubos.remove(0);
                    } else {
                        //System.out.println("me quedo el ultimo " + cubos.get(cubos.size() - 1));
                        suma += cubos.get(cubos.size() - 1);
                        cubos.remove(cubos.size() - 1);
                    }
                    cubos = devoradora(cubos);

                }
                if (suma > maximo) {
                    maximo = suma;
                }
                System.out.println("opciones " + opciones);

                Long num = Integer.parseInt(String.valueOf(opciones), 2);
                System.out.println("numero" + num);
                num--;
                opciones = Long.toBinaryString(num);
                System.out.println("opciones " + opciones + " numero " + num);

            } while (!opciones.equals(opcionesN));
            System.out.println(maximo);

        } while (true);
    }
}
