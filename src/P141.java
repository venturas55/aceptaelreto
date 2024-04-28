/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package p141;

import java.util.Scanner;

/**
 *
 * @author VeNtU 40 ( 41 ) 91[ 92] 123{ 125}
 *
 */
public class P141 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            Boolean isBalanced = true;
            String cadena;
            cadena = in.nextLine();

            for (int i = 0; i < cadena.length(); i++) {
                if ((cadena.charAt(i) == '(') || (cadena.charAt(i) == '[') || (cadena.charAt(i) == '{')) {
                    for (int j = cadena.length() - 1; j > 0; j--) {
                        //System.out.println("j: "+j + " when size of candena is "+cadena.length());
                        if ((cadena.charAt(j) == ')') || (cadena.charAt(j) == ']') || (cadena.charAt(j) == '}')) {
                            if ((cadena.charAt(i) == '(' && cadena.charAt(j) == ')') || (cadena.charAt(i) == '[' && cadena.charAt(j) == ']') || (cadena.charAt(i) == '{' && cadena.charAt(j) == '}')) {
                                cadena = cadena.substring(0, j) + cadena.substring(j + 1);
                                cadena = cadena.substring(0, i) + cadena.substring(i + 1);
                                
                            } else {
                                isBalanced = false;
                                break;
                            }
                        }
                    }
                }
            }
            if (isBalanced) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

    }

}
