/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programame1;

import java.util.Scanner;

public class ProgramameA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int casos = 0;
        
        Scanner stdin = new Scanner(System.in);
        casos = stdin.nextInt();
        
        String[][] array=new String [casos+1][3];
        
        for(int i=0; i<array.length; i++){
            String linea = stdin.nextLine();
            
            array[i]= linea.split(" ");
        }
        
        /*for (int i=0; i <array.length;i++){
            for (int j=0 ; j<array[i].length;j++){
                System.out.println(array[i][j]+" ");
            }
        }*/
        
        for (int i=0 ;i<array.length ; i++){
            if(array[i][1].equals("+")){
                System.out.println(Integer.parseInt(array[i][0]+Integer.parseInt(array[i][2])));
            }
            if(array[i][1].equals("-")){
                System.out.println(Integer.parseInt(array[i][0])+Integer.parseInt(array[i][2]));
            }
            if(array[i][1].equals("*")){
                System.out.println(Integer.parseInt(array[i][0])*Integer.parseInt(array[i][2]));
            }
            if(array[i][1].equals("/")){
                if(array[i][2].equals("0")){
                    System.out.println("ERROR");
                }
            }else{
                System.out.println(Integer.parseInt(array[i][0])/Integer.parseInt(array[i][2]));
            }
        }
    }
    
}
