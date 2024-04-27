/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p490;

import java.util.Scanner;

/**
 *
 * @author VeNtU
 */
public class P490 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int N, K, satisfacciontotal, record = 0;
        int[] calles = new int[500000];
        N = entrada.nextInt();
        K = entrada.nextInt();

        //Leemos los grados de satisfaccion de las N calles
        for (int i = 0; i < N; i++) {
            calles[i] = entrada.nextInt();
        }

        //de izquierda a derecha
        for (int i = 0; i <= N-K; i++) {
            satisfacciontotal = 0;
                  //Para no salirse outofbounds
            for (int j = i+1; j < i + K; j++) {
                
                satisfacciontotal += calles[j]-calles[j-1];
            }
            if (satisfacciontotal > record) {
                record = satisfacciontotal;
                //System.out.println("Record derechas en i="+i + " en " + record);
            }
            
        }

        //de derecha a izquierda
        for (int i = N-1; i >= K-1; i--) {
            satisfacciontotal = 0;
                for (int j = i; j > i - K+1; j--) {
                    satisfacciontotal += calles[j-1]-calles[j];
                }
                if (satisfacciontotal > record) {
                    record = satisfacciontotal;
                    //System.out.println("Record izquierda en i="+i + " en " + record);
                }
        }
        System.out.println(record);
    }
}
