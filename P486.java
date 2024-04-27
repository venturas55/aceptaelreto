/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p486;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author VeNtU
 */
public class P486 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       String linea;
       int comensales,denominadorcomun,numeradorcomun;
       String[] arraycomen=new String [10000];
       int[] arraynum= new int[10000];
       int[] arrayden= new int[10000];
       int[] denominadores= new int[10000];
       String[] comensaltemporal = new String[2];
       do{
           //Arrays.fill(arraycomen,"0");
           comensales=entrada.nextInt();
           entrada.nextLine();
           denominadorcomun=1;
           numeradorcomun=0;
           if(comensales>0){ 
                linea=entrada.nextLine();
                arraycomen=linea.split(" ");
                    for(int i=0;i<comensales;i++){
                        comensaltemporal=arraycomen[i].split("/");
                        arraynum[i]=Integer.parseInt(comensaltemporal[0]);
                        arrayden[i]=Integer.parseInt(comensaltemporal[1]);
                        //System.out.println(arraynum[i]);
                        //System.out.println(arrayden[i]);
                    }
                    
                    //Me creo un array con los denominadores que no se repiten (1 si se repite)
                Arrays.fill(denominadores,1);
                for(int j=0;j<comensales;j++){
                    denominadores[j]=arrayden[j];
                    for(int k=0;k<j;k++){
                        if(arrayden[k]==arrayden[j])
                        denominadores[j]=1;
                        }
                }
                        
                //Multiplico todos los denominadores diferentes (mcm)
                for(int j=0;j<comensales;j++){
                    //System.out.println("denominadores "+denominadores[j]);
                    denominadorcomun*=denominadores[j];
                }
                //System.out.println("denominador comun "+denominadorcomun);
                 
                //Saco el numerador "comun"
                for(int j=0;j<comensales;j++){
                    numeradorcomun+=arraynum[j]*denominadorcomun/arrayden[j];
                }
                //System.out.println("numerador comun "+numeradorcomun);
                System.out.println(denominadorcomun-numeradorcomun);
           }
       }while(comensales!=0);
    }
}
