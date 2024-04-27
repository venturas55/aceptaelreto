/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progpuzzle;
import java.util.*;
import java.lang.Math;
/**
 *
 * @author ventu
 */
public class Progpuzzle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner en = new Scanner (System.in);
        
        int cant;
        int cent=1;
        int a;
        
        cant=en.nextInt();

        while(cant!=0){
        a=(int)java.lang.Math.sqrt(cant);
        
        for(int i=a;i<cant;i++)
            if(cant%i==0){
                System.out.println(i + " " + cant/i);
             break;   
            }
        cant=en.nextInt();
        }
    }
    
}
