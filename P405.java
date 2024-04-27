package p405;

import java.util.*;


public class P405 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int aux, ant, act, sig;
        boolean seguidas;
        ArrayList<Integer> listado = new ArrayList<Integer>();
        aux = entrada.nextInt();
        while (aux != 0) {
            listado.clear();
            do {
                listado.add(aux);
                aux = entrada.nextInt();
            } while (aux != 0);
            //Introduzco el cero final tamben
            listado.add(aux);
            
            
            //EMPIEZO EL TRATAMIENTO DE DATOS
            if (listado.size() == 1) {
                System.out.print(listado.get(0));
            } else {
                System.out.print(listado.get(0));
                seguidas = false;
                for (int i = 1; i < listado.size(); i++) {

                    if (listado.get(i) == (listado.get(i - 1) + 1) && !seguidas) {
                        System.out.print("-");
                        seguidas = true;
                    } else if (listado.get(i) == (listado.get(i - 1) + 1) && seguidas) {

                    } else if (listado.get(i) > (listado.get(i - 1) + 1) && seguidas) {
                        System.out.print(listado.get(i - 1)+","+listado.get(i));
                        seguidas = false;
                    }else if(listado.get(i) > (listado.get(i - 1) + 1) && !seguidas){
                        System.out.print(","+listado.get(i));
                    }else if(listado.get(i)==0 && seguidas)
                        System.out.println(listado.get(i-1));
                        
                }
            }
            
            //ACABO EL TRATAMIENTO DE DATOS

            aux = entrada.nextInt();
        }
    }
}
