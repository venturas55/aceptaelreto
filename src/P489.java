/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p489;

import java.util.Arrays;
import java.util.Scanner;


public class P489 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int N,M;
        int[] grupos = new int[100000];
        int[] aulas = new int[100000];
        boolean caben;
        
        
        caben=true;
        N=entrada.nextInt();
        M=entrada.nextInt();
        
        for(int i=0;i<N;i++){
            grupos[i]=entrada.nextInt();
        }
          for(int i=0;i<M;i++){
            aulas[i]=entrada.nextInt();
        }
          
  
        if(M<N)
            System.out.println("NO");
        else{
            Arrays.sort(grupos);
            Arrays.sort(aulas);

            for(int k=100000-1;k>100000-N;k--){
                if(grupos[k]>aulas[k]){
                    caben=false;
                    break;
                }
            }
            if(caben)
                System.out.println("SI");
            else
                System.out.println("NO");
        }
    }
}
