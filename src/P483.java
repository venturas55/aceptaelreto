/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p483;

import java.util.Scanner;

/**
 *
 * @author VeNtU
 */
public class P483 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int casos,campanadas,averiguar,tiempototal,tiempofinal,restante,seg0,min0,segtot0,mintot0,hortot0,hor0,seg1,min1,hor1,seg,min,hor;
        String horainicio,horafin,linea,segfin,minfin,horfin;
          
        casos=entrada.nextInt();
        entrada.nextLine();
        
        for(int i=0;i<casos;i++){
            linea=entrada.nextLine();
            campanadas=entrada.nextInt();
            averiguar=entrada.nextInt();
            entrada.nextLine();
            
            String[] horas=linea.split(" ");
            horainicio=horas[0];
            horafin=horas[1];
            
            String[] iniciodesglosado=horainicio.split(":");
            String[] findesglosado=horafin.split(":");
            seg0=Integer.parseInt(iniciodesglosado[2]);
            min0=Integer.parseInt(iniciodesglosado[1]);
            hor0=Integer.parseInt(iniciodesglosado[0]);
            seg1=Integer.parseInt(findesglosado[2]);
            min1=Integer.parseInt(findesglosado[1]);
            hor1=Integer.parseInt(findesglosado[0]);
            //System.out.println("inicio: "+ hor0 + " "+ min0 + " "+ seg0);
            //System.out.println("fin: "+ hor1 + " "+ min1 + " "+ seg1);
            
              
            //se calculan los segundos totales
            segtot0=seg0;
            mintot0=min0;
            hortot0=hor0;
            
                if(seg1>=segtot0)
                    tiempototal=seg1-segtot0;
                else{
                    tiempototal=(60-segtot0)+seg1;
                    mintot0++;}
                if(min1>=mintot0)
                    tiempototal+=(min1-mintot0)*60;
                else{
                    tiempototal+=((60-mintot0)+min1)*60;
                    hortot0++;}
                if(hor1>=hortot0)
                    tiempototal+=(hor1-hortot0)*3600;
                else
                    tiempototal+=((24-hortot0)+hor1)*3600;
      
                
                tiempofinal=tiempototal/(campanadas-1)*(averiguar-1);
                restante=tiempofinal;
                hor=tiempofinal/3600;
                restante-=hor*3600;
                min=restante/60;
                restante-=min*60;
                seg=restante;
                
                
                //System.out.println("desfase: "+ hor + " "+ min + " "+ seg);
                
                seg+=seg0;
                if(seg>=60){
                    seg-=60;
                    min++;
                    }
                min+=min0;
                //System.out.println("minutillos "+min);
                if(min>=60){
                    min-=60;
                    hor++;}
                hor+=hor0;
                if(hor>=24)
                    hor-=24;
                
                //convertimos a formato reloj
                if(seg<10)
                    segfin='0'+Integer.toString(seg);
                else
                    segfin=Integer.toString(seg);
                
                if(min<10)
                    minfin='0'+Integer.toString(min);
                else
                    minfin=Integer.toString(min);
                if(hor<10)
                    horfin='0'+Integer.toString(hor);
                else
                    horfin=Integer.toString(hor);
                
                
                
                
             System.out.println(horfin + ":"+ minfin + ":"+ segfin);
  
        }

        
    }
    
}
