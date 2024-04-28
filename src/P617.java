/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p617;

    import java.util.Scanner;

    /**
     *
     * @author VeNtU
     */
    public class P617 {

        /**
         * @param args the command line arguments
         */
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int casos, records;
            String texto;
            String[] nombre = new String[20];

            casos = in.nextInt();
            for (int i = 0; i < casos; i++) {
                texto = "";
                records = in.nextInt();
                in.nextLine(); //leer el final de carro del int anterior
                for (int j = 0; j < records; j++) {
                    nombre[j] = in.nextLine();
                }



                for (int k = 0; k < 3; k++) {

                    for (int j = 0; j < records; j++) {

                        texto += nombre[j].charAt(k);

                    }
                }
                System.out.println(texto);
            }

        }

    }
