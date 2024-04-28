package p619;

import java.util.Scanner;

public class P619 {

    public static boolean cuadricula0k(char[][] pantalla, int a, int b) {
        char letra1, letra2;
        boolean haydos = false;
        letra1 = pantalla[a][b];
        letra2 = pantalla[a][b];
        for (int i = a; i < a + 8; i++) {
            for (int j = b; j < b + 8; j++) {
                if (pantalla[i][j] != letra1 && !haydos) {
                    haydos = true;
                    letra2 = pantalla[i][j];
                }
                if (haydos && pantalla[i][j] != letra1 && pantalla[i][j] != letra2) {
                    return false;
                }

            }
        }
        // System.out.println(a + " " + b + " " + letra1 + " " + letra2);
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int c, f;
        boolean encaja;
        char[][] pantalla = new char[256][256];
        String palabra;

        c = in.nextInt();
        f = in.nextInt();

        while (f != 0 && c != 0) {
            encaja = false;
            in.nextLine();

            //Leo las pantallas
            for (int i = 0; i < f; i++) {
                palabra = in.nextLine();
                for (int j = 0; j < c; j++) {
                    pantalla[i][j] = palabra.charAt(j);
                }
            }

            for (int i = 0; i < f; i = i + 8) {
                for (int j = 0; j < c; j = j + 8) {
                    encaja = cuadricula0k(pantalla, i, j);
                    if (!encaja) {
                        System.out.println("NO");
                        break;
                    }
                }
                if (!encaja) {
                    break;
                }
            }
            if (encaja) {
                System.out.println("SI");
            }

            c = in.nextInt();
            f = in.nextInt();
        }
    }
}
