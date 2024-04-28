
package p432s;

import java.util.*;

class Coordenadas {
    public int f, c;
    public Coordenadas(int a, int b) {
        f = a;
        c = b;
    }
}

public class P432s {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int i, j, k;
        int[][] mapa = new int[21][21];
        //coordenadas visitadas
        int[][] vis = new int[21][21];

        while (sc.hasNext()) {

            int F, C, SF = 0, SC = 0, DF = 0, DC = 0;
            F = sc.nextInt();
            C = sc.nextInt();

            // Temporal para comerse el salto de linea
            String tmpLinea = sc.nextLine();
            for (j = 0; j < F; j++) {
                // Leo linea entera
                String linea = sc.nextLine();
                for (k = 0; k < C; k++) {
                    if (linea.charAt(k) == '.') {
                        mapa[j][k] = 0;
                    } else if (linea.charAt(k) == '*') {
                        mapa[j][k] = 1;
                    } else if (linea.charAt(k) == 'S') {
                        mapa[j][k] = 0;
                        SF = j;
                        SC = k;
                    } else if (linea.charAt(k) == 'F') {
                        mapa[j][k] = 0;
                        DF = j;
                        DC = k;
                    }
                    //todas las coordneadas visitadas a 0
                    vis[j][k] = 0;
                }
            }
            //System.out.println("Caso "+i);
            LinkedList<Coordenadas> lista = new LinkedList<Coordenadas>();

            Coordenadas c = new Coordenadas(SF, SC);
            //añado el punto de salida a la lista
            lista.addFirst(c);
            //Inicializo el boolean de encontrado
            boolean encontrado = false;

            
            while (lista.size() != 0) {
                Coordenadas tmp = lista.removeFirst();

                if (tmp.f == DF && tmp.c == DC) {
                    encontrado = true;
                    break;
                }

                if (vis[tmp.f][tmp.c] == 0) {
                    //System.out.println("Visito "+tmp.f+" "+tmp.c);
                    vis[tmp.f][tmp.c] = 1;

                    //Si la fila es mayor que cero, en el mapa una fila arriba esta libre y no la he visitado ya
                    if (tmp.f > 0 && mapa[tmp.f - 1][tmp.c] == 0 && vis[tmp.f - 1][tmp.c] == 0) {
                        Coordenadas tmp2 = new Coordenadas(tmp.f - 1, tmp.c);
                        lista.addFirst(tmp2);
                    }
                    
                    //Si la fila es menor que el limite, una fila abajo está libre y no la he vistitado ya
                    if (tmp.f < F - 1 && mapa[tmp.f + 1][tmp.c] == 0 && vis[tmp.f + 1][tmp.c] == 0) {
                        Coordenadas tmp2 = new Coordenadas(tmp.f + 1, tmp.c);
                        lista.addFirst(tmp2);
                    }

                    //Si la columna es mayor que cero, una columna a la izquierda esta libre y no la he visitado ya
                    if (tmp.c > 0 && mapa[tmp.f][tmp.c - 1] == 0 && vis[tmp.f][tmp.c - 1] == 0) {
                        Coordenadas tmp2 = new Coordenadas(tmp.f, tmp.c - 1);
                        lista.addFirst(tmp2);
                    }
                    
                    //Si la columna es mejor que el limite, y una columna a la derecha esta libre y no la he vistiado ya
                    if (tmp.c < C - 1 && mapa[tmp.f][tmp.c + 1] == 0 && vis[tmp.f][tmp.c + 1] == 0) {
                        Coordenadas tmp2 = new Coordenadas(tmp.f, tmp.c + 1);
                        lista.addFirst(tmp2);
                    }
                }
            }

            if (encontrado) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }

        }

    }
}
