/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package programame1;

import java.util.Scanner;

/**
 *
 * @author ventu
 */
public class Programame1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int casos;
        
        Scanner stdin = new Scanner(System.in);
        casos = stdin.nextInt();
        //leo basura
        String tmp = stdin.nextLine();
        //String[][] array=new String [casos+1][3];
        
        for(int i=0; i<casos; i++){
            String linea = stdin.nextLine();
            
            String[] parts= linea.split(" ");
            String part1 = parts[0]; 
            String part2 = parts[1]; 
            String part3 = parts[2]; 
            
            
            int a = Integer.parseInt(part1);
            int b =Integer.parseInt(part3);
            
            
            if(part2.equals("+"))
                System.out.println(a+b);
            
            if(part2.equals("-")){
               System.out.println(a-b);

            }
            if(part2.equals("*")){
                System.out.println(a*b);

            }
            if(part2.equals("/")){
                if(b==0)
                    System.out.println("ERROR");
                else
                    System.out.println(a/b);
                
            }
            
            
        }
        
        /*for (int i=0; i <array.length;i++){
            for (int j=0 ; j<array[i].length;j++){
                System.out.println(array[i][j]+" ");
            }
        }*/
        
        /*
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
*/
    }
    
}
