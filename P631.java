package p631;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class P631 {

    private static class Ascensor {

        private int pisoInicial;
        private int pisoFinal;
        private int nivel;

        public Ascensor(int a, int b, int c) {
            this.pisoInicial = a;
            this.pisoFinal = b;
            this.nivel = c;
        }

        @Override
        public String toString() {
            return +this.getPisoInicial() + " " + this.getPisoFinal() + " " + this.getNivel();
        }

        public int getNivel() {
            return nivel;
        }

        public void setNivel(int nivel) {
            this.nivel = nivel;
        }

        public int getPisoInicial() {
            return pisoInicial;
        }

        public int getPisoFinal() {
            return pisoFinal;
        }

        public void setPisoInicial(int pisoInicial) {
            this.pisoInicial = pisoInicial;
        }

        public void setPisoFinal(int pisoFinal) {
            this.pisoFinal = pisoFinal;
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList listado = new ArrayList<Ascensor>();
        while (in.hasNext()) {
            int ultimoPiso = 0;
            int minimoNivel = 0;
            int numAscensores = in.nextInt();

            for (int i = 0; i < numAscensores; i++) {
                int a = in.nextInt();
                int b = in.nextInt();
                int c = in.nextInt();
                listado.add(new Ascensor(a, b, c));
            }

            Iterator<Ascensor> it = listado.iterator();

            while (it.hasNext()) {
                Ascensor item = it.next();
                if (item.getPisoFinal() > ultimoPiso) {
                    ultimoPiso = item.getPisoFinal();
                }
            }

            //Empiezo, teniendo ya el ultimo piso
            //Recorro todos los pisos
            for (int i = 0; i < ultimoPiso; i++) {
                int p = nivelMinimoPasaPorPiso(listado, i);
                if (p > minimoNivel) {
                    minimoNivel = p;
                }
            }
            System.out.println(minimoNivel);

        }

    }

    public static int nivelMinimoPasaPorPiso(ArrayList listado, int piso) {
        Iterator<Ascensor> it = listado.iterator();
        int mejorNivel = 1000001;
        while (it.hasNext()) {
            Ascensor item = it.next();
            System.out.println("Piso: "+ piso+" "+ item.toString());
           
            if (item.getPisoInicial() <= piso && item.getPisoFinal() >= piso) {
                if (item.getNivel() < mejorNivel) {
                    mejorNivel = item.getNivel();
                }
            }
        }
        return mejorNivel;
    }
}
