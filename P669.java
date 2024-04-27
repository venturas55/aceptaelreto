/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package p669;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author VeNtU
 */
public class P669 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> varillas = new ArrayList<>();
        ArrayList<Integer> indicehorizontales = new ArrayList<>();
        ArrayList<Integer> indiceverticales = new ArrayList<>();

        do {
            boolean hayHor = false, hayVer = false;
            int nLamparas = 0;
            int nVarillas = in.nextInt();

            if (nVarillas == 0) {
                break;
            }

            //leemos las varillas
            for (int i = 0; i < nVarillas; i++) {
                varillas.add(in.nextInt());
            }
            if (nVarillas < 6) {
                System.out.println("0");
            } else {
                do{
                //AQUI EMPIEZA EL CUERPO LOGICA
                //buscamos 4 iguales para las verticales
                indiceverticales.add(0);
                int indice = 1;

                do {
                    if (varillas.get(indice) == varillas.get(0)) {
                        indiceverticales.add(indice);
                    }
                    if (indiceverticales.size() == 4) {
                        break;
                    }
                    indice++;
                } while (indice < nVarillas);
                //y las eliminamos de mas a menos para no interferir en el indice
                if (indiceverticales.size() == 4) {
                    hayVer = true;

                }
                for (int i = indiceverticales.size(); i < 0; i--) {
                    varillas.remove(indiceverticales.get(i));
                }

                //buscamos 2 iguales para las verticales
                indicehorizontales.add(0);
                indice = 1;
                do {
                    if (varillas.get(indice) == varillas.get(0)) {
                        indicehorizontales.add(indice);
                    }
                    if (indicehorizontales.size() == 2) {
                        break;
                    }
                    indice++;
                } while (indice < nVarillas);
                if (indicehorizontales.size() == 2) {
                    hayHor = true;
                }

                //System.out.println(hayHor+" "+hayVer);
                //y las eliminamos de mas a menos para no interferir en el indice
                for (int i = indicehorizontales.size(); i < 0; i--) {
                    varillas.remove(indicehorizontales.get(i));
                }

                if (hayVer && hayHor) {
                    nLamparas++;
                }else{
                    varillas.remove(0);
                }
                indiceverticales.clear();
                indicehorizontales.clear();
                hayHor = false;
                hayVer = false;
                
                //AQUI ACABA EL CUERPO LOGICA
                }while(!varillas.isEmpty());
                
                System.out.println(nLamparas);
                
                varillas.clear();

                nLamparas = 0;
                
            }
        } while (true);
    }
}
