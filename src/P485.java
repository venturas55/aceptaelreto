/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p485;

import java.util.Scanner;


public class P485 {

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       int etapas,total;
       int[] distancias=new int [100];
       int[] faltan=new int [100];
       
       do{
           total=0;
           etapas=entrada.nextInt();
           if (etapas>0){
           for(int i=0;i<etapas;i++){
               distancias[i]=entrada.nextInt();
                total+=distancias[i];
           }
           
           faltan[0]=total;
           for(int i=1;i<etapas;i++){
               total=total-distancias[i-1];
               faltan[i]=total;
           }
           
           for(int i=0;i<etapas;i++){
               if(i<etapas-1)
               System.out.print(faltan[i]+" ");
               else
                   System.out.println(faltan[i]);
           }
          
           }
       }while(etapas!=0);
    }
}
