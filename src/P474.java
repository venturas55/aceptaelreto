package p474;
import java.util.Scanner;
public class P474 {
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       int casos,a,b,c;
       casos=entrada.nextInt();
       for(int i=0;i<casos;i++){
           a=entrada.nextInt();
           b=entrada.nextInt();
           c=entrada.nextInt();
           
           if( Math.abs(a-c) < Math.abs(a-b))
               System.out.println(Math.abs(c-b) + Math.abs(a-c) );
           else
               System.out.println(Math.abs(c-b) + Math.abs(a-b) );
       }
    }
}
