/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p488;

import java.util.Scanner;

/**
 *
 * @author VeNtU
 */
public class P488 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int casos,puntos,tiempodespierto,acumulado,checkspasados,sesiones;
        int[] checkpoint = new int[1000];
        casos=entrada.nextInt();
        for(int i=0;i<casos;i++){
            sesiones=0;
            puntos=entrada.nextInt();
            tiempodespierto=entrada.nextInt();
            for(int j=0;j<puntos;j++){
                 checkpoint[j]=entrada.nextInt();
            }
            
            acumulado=0;
            
            for(int j=0;j<puntos;j++){
                acumulado+=checkpoint[j];
                if(acumulado>=tiempodespierto){
                    sesiones++;
                    acumulado=0;
                    }
            }
            System.out.println(sesiones);
        }
    }
}
