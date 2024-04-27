/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p482;

import java.util.Scanner;

public class P482 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int negros=0,grises=0;
        char caso=0;
        boolean ant=true;

        do{
            if(caso=='.')
                ant=true;
            caso=entrada.next().charAt(0);
            if(caso=='N'){
                negros++;
                ant=false;}
            else if (caso=='G'){
                grises++;
                ant=false;}
            else if(caso=='.' && ant==false){
                if(negros%2==0 && grises%2==0)
                    System.out.println("EMPAREJADOS");
                else if(negros%2==1 && grises%2==1)
                    System.out.println("PAREJA MIXTA");
                else if(negros%2==1)
                    System.out.println("NEGRO SOLITARIO");
                else if(grises%2==1)
                    System.out.println("GRIS SOLITARIO");
                negros=0;
                grises=0;
            }
       }while(!(ant==true && caso=='.'));
    }
}
