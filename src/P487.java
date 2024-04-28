/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p487;

import java.util.Scanner;


public class P487 {


    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       int casos;
       long vueltas;
       casos=entrada.nextInt();
       for(int i=0;i<casos;i++){
           vueltas=entrada.nextLong();
            if(vueltas>3600){
                if(vueltas%3600==0)
                    System.out.println(vueltas+vueltas/3600);
                else
                    System.out.println(vueltas+(vueltas/3600+1));}
            else if(vueltas>0)
                System.out.println(vueltas+vueltas/3600);
            else //Si el numero es negativo no se dan vueltas
                System.out.println("0");
       }
    }
}
