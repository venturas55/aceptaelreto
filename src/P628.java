/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p628;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class P628 {

    private static class Uva {

        private long sabor;
        private long grosor;

        public Uva(long a, long b) {
            this.sabor = a;
            this.grosor = b;
        }

        @Override
        public String toString() {
            return + this.getSabor() + " " + this.getGrosor();
        }

        public long getSabor() {
            return sabor;
        }

        public long getGrosor() {
            return grosor;
        }

        public void setSabor(long sabor) {
            this.sabor = sabor;
        }

        public void setGrosor(long grosor) {
            this.grosor = grosor;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            ArrayList uvas = new ArrayList<Uva>();
            long sabor, grosor;
            Uva mejorUva;
            boolean eslamejor = true;
            //your code here
            do {

                sabor = in.nextInt();
                grosor = in.nextInt();
                uvas.add(new Uva(sabor, grosor));

                if (sabor == 0 && grosor == 0) {
                    break;
                }

            } while (true);

            //borro el ultimo
            uvas.remove(uvas.size() - 1);

            /*  System.out.println("IMPRIMO");
            for (int i = 0; i < uvas.size(); i++) {
                System.out.println(uvas.get(i).toString());
            }
            System.out.println("ACABO");*/

 /*uvas.forEach(uva -> {

            });*/
            mejorUva = (Uva) uvas.get(0);

            Iterator<Uva> it = uvas.iterator();

            while (it.hasNext()) {
                Uva uva = it.next();
                if (uva.getSabor() > mejorUva.getSabor() && uva.getGrosor() < mejorUva.getGrosor()) {
                    mejorUva.setSabor(uva.getSabor());
                    mejorUva.setGrosor(uva.getGrosor());
                }
            }

            it = uvas.iterator();
            while (it.hasNext()) {
                Uva uva = it.next();
               // System.out.println(uva.getSabor() + " " + mejorUva.getSabor());
                if (uva.getSabor() > mejorUva.getSabor() || uva.getGrosor() < mejorUva.getGrosor()) {
                    eslamejor = false;
                }

            }
            if (eslamejor) {
                System.out.println(mejorUva.toString());
            } else {
                System.out.println("NO HAY MEJOR");
            }

        }
    }

}
