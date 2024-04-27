package p626;

import java.text.ParseException;
import java.util.Scanner;


public class P626 {

    public static void main(String[] args) throws ParseException {
        Scanner in = new Scanner(System.in);
        int num = 0;
        num = in.nextInt();
        in.nextLine();
        for (int i = 0; i < num; i++) {
            String fecha_string = in.nextLine();
            String[] parte = fecha_string.split("/");

            if (esBisiesto(Integer.parseInt(parte[2]))) {
                if (esAnterior(fecha_string, "29/02/" + parte[2])) {
                    System.out.println("29/02/" + completar(parte[2]));
                } else {
                    System.out.println("29/02/" + completar(Integer.toString(Integer.parseInt(parte[2]) + 4)));
                }
            } else {
                do {
                    parte[2] = Integer.toString(Integer.parseInt(parte[2]) + 1);
                } while (!esBisiesto(Integer.parseInt(parte[2])));
                System.out.println("29/02/"+completar(parte[2]));
            }

        }
    }

    public static boolean esBisiesto(int anyo) {
        if (anyo % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }

    
    //fecha s1 es anterior a fecha s2?
    public static boolean esAnterior(String s1, String s2) {

        String[] partes1 = s1.split("/");
        String[] partes2 = s2.split("/");

        if (Integer.parseInt(partes1[2]) < Integer.parseInt(partes2[2])) {
            return true;
        } else if (Integer.parseInt(partes1[1]) < Integer.parseInt(partes2[1])) {
            return true;
        } else if (Integer.parseInt(partes1[0]) < Integer.parseInt(partes2[0])) {
            return true;
        } else {
            return false;
        }
    }
    public static String completar(String num){
        while(num.length()<4)
            num="0"+num;
        return num;
    }

}
