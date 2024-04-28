/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programamed;

import java.util.Scanner;

/**
 *
 * @author ventu
 */
public class ProgramameD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner en = new Scanner (System.in);
        int N,H,C,origen=1,destino,k;
        boolean flag,muerto=false;
        
        N=en.nextInt();
        
        for (int i=0;i<N;i++){
            muerto=false;
            H=en.nextInt();
            C=en.nextInt();
            conexiones=new int[C][2];
                for(int j=0;j<C;j++){
                   conexiones[j][0]=en.nextInt();
                   conexiones[j][1]=en.nextInt();
                }

            
            String linea = en.next();
            String[] pasitos = linea.split(",");
           
            
            flag=false;
            k=0;
            do{
                System.out.println("k "+k);
                destino=Integer.parseInt(pasitos[k]);
                if (k==0){
                    flag=comprobar(origen,destino,conexiones);
                        if(!flag){
                            muerto=true;
                            break;
                        }
                }
                else{
                    System.out.println("estoy en el pasito numero "+k);
                    origen=Integer.parseInt(pasitos[k-1]);
                    flag=comprobar(origen,destino,conexiones); 
                                if(!flag){
                                    muerto=true;
                                    break;
                                }
                     }
                System.out.println("sumo 1 a k");
                k++;
            }while(!flag && k<pasitos.length)  ;
            System.out.println("numero habitaciones: "+H);
            System.out.println("destino: "+destino);
            
            if(muerto==true)
                    System.out.println("GAMEOVER");
            else    if(destino==H)
                            System.out.println("VICTORIA");
                    else
                            System.out.println("PERDIDO");

        }
   }
    
    public static boolean comprobar(int origen,int destino,int conexiones[][]){
        for(int i=0;i<conexiones.length;i++){
            if((conexiones[i][0]==origen && conexiones[i][1]==destino) || (conexiones[i][0]==destino && conexiones[i][1]==origen))
                return true;
             }
        return false;
    }
    
    
    
}