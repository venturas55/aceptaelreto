/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programameb;

import java.util.Scanner;

/**
 *
 * @author VeNtU
 */
public class ProgramameB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int casos,cont,i,j,k=0;
        String texto;
        String stanlee= new String("stanlee");
        casos=entrada.nextInt();
        
        entrada.nextLine();
        for(i=0;i<casos;i++){
            k=0;
            cont=0;
            texto=entrada.nextLine();    
            texto=texto.toLowerCase();
            
            for(j=0;j<texto.length();j++){
                if(   texto.charAt(j)==stanlee.charAt(k)  ) {
                    k++;
                }
                
                if(k==6){
                    cont++;
                    k=0;
                }
                
            }
            System.out.println(cont);
            
        }
    }
}
