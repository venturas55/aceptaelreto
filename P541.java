package p541;

import java.util.Arrays;

public class P541 {

    static java.util.Scanner in;

    static int mcd(int[] lista) {
        int i;
        boolean no_es_mcd = false, probar_siguiente = true;

        //Ordeno el array para obtener el menor en lista[0]
        Arrays.sort(lista);
        System.out.println("Menor: " + lista[0]);

        while (probar_siguiente == true) {
            //Ahora tengo que comprobar si "menor" es divisible por todos los números del array
            for (i = 0; i < 3; i++) {
                if (lista[i] % lista[0] != 0) {
                    no_es_mcd = true;
                }
            }
            //Si no lo es, tendré que probar con el siguiente número, que será menor-1
            if (no_es_mcd) {
                lista[0]--;
                no_es_mcd = false;
            } else {
                //En caso de que todos los números sean divisible por menor, 
                //salgo del bucle principal while pq ya he encontrado el mcd
                probar_siguiente = false;
            }
        }
        return lista[0];
    }

    public static void main(String[] args) {
        in = new java.util.Scanner(System.in);
        int num[] = new int[3], aux;
        num[0] = in.nextInt();
        num[1] = in.nextInt();
        num[2] = in.nextInt();

        while (num[0] != 0 && num[1] != 0 && num[2] != 0) {
            while (mcd(num) != 1) {

                aux = mcd(num);
                num[0] = num[0] / aux;
                num[1] = num[1] / aux;
                num[2] = num[2] / aux;
                // System.out.println("mcd: " + mcd(num));

            }
            System.out.println(num[0] + num[1] + num[2]);

            num[0] = in.nextInt();
            num[1] = in.nextInt();
            num[2] = in.nextInt();
        }
    }
}
