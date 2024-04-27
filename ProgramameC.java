/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programamec;

import java.util.Scanner;

/**
 *
 * @author VeNtU
 */
public class ProgramameC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
        int casos;
        int numhero;
        int destreza[]=new int[100];
        String preferencia[]=new String[100];
        int mierda[]=new int[100];
                casos=entrada.nextInt();
        
        for(int i=0;i<casos;i++){
            numhero=entrada.nextInt();
            
            for(int j=0;j<numhero;j++){
                destreza[j]=entrada.nextInt();
            }
            entrada.nextLine();
            
            for(int j=0;j<numhero;j++){
                preferencia[j]=entrada.nextLine();
            }
            
            for(int j=0;j<numhero;j++){
                if(preferencia[j].charAt(0)=='<')
                    mierda[j]=-1;
                else if ((preferencia[j].charAt(0)=='>'))
                       mierda[j]=1;
                else if((preferencia[j].charAt(0)=='='))
                       mierda[j]=0;
                
                
            }
            
            
            
            for(int j=0;j<numhero;j++){
                                          
                for(int k=0;k<numhero-j;k++){
                    if(destreza[k]+""+preferencia[j] )
                        switch (preferencia[j].charAt(0)){
                            case '<':
                                if(destreza[k] < preferencia[j].charAt(1) && pref   )
                                    0k
                                    
                        }
                
                        
                        }
                
                
                
            }
            
            
            
                
                
                
   
            

            
        }
    }
}
