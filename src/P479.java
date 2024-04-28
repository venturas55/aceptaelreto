package p479;

import java.util.Scanner;
public class P479 {
    public static void masCercano(String[] caso) {
        int distancia = 102; // la minima distancia

        fila = Integer.parseInt(caso[0]) - 1;
        columna = Integer.parseInt(caso[1]) - 1;

        switch (caso[2]) {
            case "ARRIBA": {
                for (int i = fila - 1; i >= 0; i--) {
                    if (filas[i].charAt(columna) == 'X') {
                        if (Math.abs(fila - i) < distancia) {
                            distancia = Math.abs(fila - i);
                        }
                    }
                }
                if (distancia == 102) {
                    System.out.println("NINGUNO");
                } else {
                    System.out.println(distancia);
                }
                break;
            }
            case "ABAJO": {
                for (int i = fila + 1; i < F; i++) {
                    if (filas[i].charAt(columna) == 'X') {
                        if (Math.abs(i - fila) < distancia) {
                            distancia = Math.abs(i - fila);
                        }
                    }
                }
                if (distancia == 102) {
                    System.out.println("NINGUNO");
                } else {
                    System.out.println(distancia);
                }
                break;
            }
            case "DERECHA": {
                for (int j = columna + 1; j < C; j++) {
                    if (filas[fila].charAt(j) == 'X') {
                        if (Math.abs(j - columna) < distancia) {
                            distancia = Math.abs(j - columna);
                        }
                    }
                }
                if (distancia == 102) {
                    System.out.println("NINGUNO");
                } else {
                    System.out.println(distancia);
                }
                break;
            }
            case "IZQUIERDA": {
                for (int j = columna - 1; j >= 0; j--) {
                    if (filas[fila].charAt(j) == 'X') {
                        if (Math.abs(columna - j) < distancia) {
                            distancia = Math.abs(columna - j);
                        }
                    }
                }
                if (distancia == 102) {
                    System.out.println("NINGUNO");
                } else {
                    System.out.println(distancia);
                }
                break;
            }
            default:
                System.out.println("NINGUNO");
        }
    }

    public static String[] filas = new String[101];
    public static int F, C, N, fila, columna;
    public static String direccion, casoStr;
    public static String[] caso = new String[3];

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        while (true) {
            F = entrada.nextInt();
            C = entrada.nextInt();
            entrada.nextLine();
            if (F == 0 && C == 0) {
                break;
            }

            for (int i = 0; i < F; i++) {
                filas[i] = entrada.nextLine();
            }

            N = entrada.nextInt();
            entrada.nextLine();

            for (int i = 0; i < N; i++) {
                casoStr = entrada.nextLine();
                caso = casoStr.split(" ");
                masCercano(caso);
            }
            System.out.println("---");
        }
    }
}
