package p436;

import java.util.*;

public class P436 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        while (entrada.hasNext()) {
            double papel, edificio;
            papel = entrada.nextInt();
            edificio = entrada.nextInt();
            edificio = edificio * 1000000;
            System.out.println((int) (Math.floor(Math.log(edificio / papel) / Math.log(2)) + 1));
        }
    }
}
