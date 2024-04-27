/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package programame3;

import java.util.Scanner;

/**
 *
 * @author ventu
 */
public class Programame3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner en = new Scanner (System.in);
        int cant,a,S,c,sum=0;
        
        
        cant=en.nextInt();
        
        for (int i=0;i<cant;i++){
            a=en.nextInt();
            sum=0;
            for (int j=11;j<=a;j+=2){
                String cadena= Integer.toString(j);
                if(cadena.charAt(0)=='1')
                    if(esPrimo(j))
                        sum++;
            }
            System.out.println(sum);  
        }
    }
    
   public static boolean esPrimo(int a){
    int i=0,primo=1;
    if(a==2)
        return true;
    for(i=3;i<=Math.sqrt(a);i+=2)
        if(a%i==0){
            primo=0;
            return false;
        }
    if (primo==1 && a!=1)
         return true;
     else
          return false;
 
}
   
   

   
}
    
    
