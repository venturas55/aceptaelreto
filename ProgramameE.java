/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programamee;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ventu
 */
public class ProgramameE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner en = new Scanner (System.in);
        int N,O,C,S,c,sum=0;
        
        
        N=en.nextInt();
        
        for (int i=0;i<N;i++){
            O=en.nextInt();
            
            C=en.nextInt();
            int [][]datos=new int[C+1][2];
            int [][]si=new int[C][2];
            int [][]no=new int[C][2];

            for(int j=0;j<C;j++){
                datos[j][0]=en.nextInt(); //oxigeno
                datos[j][1]=en.nextInt(); //peso
                
                if(datos[j][0]>=O)
                    si[j][0]=datos[j][0];
                else
                    no[j][0]=datos[j][0];
                
                
                
            }
            

            
            
            
            
        }
    
   }
}