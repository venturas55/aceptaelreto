package p484;

import java.util.Scanner;

public class P484 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        while (entrada.hasNext()) {

            int pointIndex = 0;
            String numeroS;
            numeroS = entrada.nextLine();
            double numD = Double.parseDouble(numeroS);
            if (numD > 0) {

                //quitamos los ceros por delante
                if (numeroS.charAt(0) == '0' && numeroS.charAt(1) != '.') {
                    do {
                        numeroS = numeroS.substring(1);
                    } while (numeroS.charAt(0) == '0' && numeroS.charAt(1) != '.');
                }

                //averiguamos la ubicacion del punto
                for (int i = 0; i < numeroS.length(); i++) {
                    if (numeroS.charAt(i) == '.') {
                        pointIndex = i;
                    }
                }

                if (pointIndex > 0) {
                    //quitamos ceros por detras
                    for (int i = numeroS.length() - 1; i >= pointIndex; i--) {
                        if (numeroS.charAt(i) != '0') {
                            if (numeroS.charAt(i) == '.') {
                                numeroS = numeroS.substring(0, i);
                                break;
                            } else {
                                numeroS = numeroS.substring(0, i + 1);
                                break;
                            }
                        }
                    }
                }
                System.out.println(numeroS);
            } else {
                System.out.println(0);

            }
        }
    }
}
