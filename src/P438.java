package p438;

import java.util.*;

public class P438 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String cadena;
        int cont, conti;
        while (entrada.hasNext()) {
            cont = 0;
            conti = 0;

            cadena = entrada.nextLine();
            if (cadena.equals("")) {
                break;
            }
            cadena = cadena.toLowerCase();
            for (int i = 0; i < cadena.length(); i++) {
                if ((cadena.charAt(i) >= 'a' && cadena.charAt(i) <= 'z') || (cadena.charAt(i) >= 'A' && cadena.charAt(i) <= 'Z')) {
                    cont++;
                } else if (cadena.charAt(i) == '!') {
                    conti++;
                }
            }

            if (conti > cont) {
                System.out.println("ESGRITO");
            } else {
                System.out.println("escrito");
            }
        }
    }
}
