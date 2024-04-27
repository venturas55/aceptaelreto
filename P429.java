/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p429;

import java.util.Arrays;
import java.util.Scanner;


public class P429 {

    public static void main(String[] args) {
        // TODO code application logic here
        int n,angares, naves, i=0;
        String result="";
       
        Scanner entrada = new Scanner (System.in);
        //System.out.println("Introduce el número de casos de prueba: ");
        //n=entrada.nextInt();
        while(true){
            //System.out.println("Introduce el número de angares: ");
            angares=entrada.nextInt();
           
            if(angares==0)
                break;
           
            int tamanyos[]=new int[angares];
            //System.out.println("Introduce tamaño de angares: ");      
            for(int j=0; j<angares; j++){
                tamanyos[j]=entrada.nextInt();
            }
            //System.out.println("Introduce número de naves: ");      
            naves=entrada.nextInt();
            int tamanyo_naves[]=new int[naves];
            //System.out.println("Introduce tamaño de naves: ");      
            for(int j=0; j<naves; j++){
                tamanyo_naves[j]=entrada.nextInt();
            }
           
            result=calcula_cabe(tamanyos, tamanyo_naves);
            System.out.println(result);
            i++;
        }     
    }
     public static String calcula_cabe(int angares[], int naves[]){
        String cabe="SI";
        boolean control=true;
          
        //for(int i=naves.length-1; i>=0&&control; i--){
        for(int i=0; i<naves.length &&control; i++){
            // Me devuelve la posicion del mejor hangar
          Arrays.sort(angares);  
          int mejorAngar=angares.length-1;
            int resto=angares[mejorAngar]-naves[i];
            if (resto<0){
                control=false;
            } else{
               angares[mejorAngar]=resto;     
            }
        }
       
       
         if(control){
            cabe="SI";
         } else {
             cabe="NO";

         }
         return cabe;
     }
    
    
     public static int obtenerMejorHangar(int []a){
        
         int mejor=0;
         int mejorValor=a[0];
        
         for(int i=1;i<a.length;i++)
             if(a[i]>mejorValor){
                 mejorValor=a[i];
                 mejor=i;
             }
         return mejor;
     }
    
}