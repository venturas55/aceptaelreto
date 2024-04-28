
package p475;

import java.util.Scanner;

public class P475 {
    public static void main(String[] args) {
             Scanner entrada = new Scanner(System.in);
       int casos;
       String frase;
       String stanlee="stanlee";
       int cantidad,cont;
       casos=entrada.nextInt();
       entrada.nextLine();      //Despues de leer un entero hay que variar el buffer. nextInt() no lee el intro
       for(int i=0;i<casos;i++){
           cantidad=0;
           cont=0;
           frase=entrada.nextLine();
           frase=frase.toLowerCase();
           for(int j=0;j<frase.length();j++){
               if(frase.charAt(j)==stanlee.charAt(cont)){
                   cont++;
                   if(cont==7){
                       cont=0;
                       cantidad++;
                   }
               }
           }
           System.out.println(cantidad);
       }
    }
}
