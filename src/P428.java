
package p428;

import java.util.Scanner;


public class P428 {

public static void main(String []args){

		Scanner sc=new Scanner(System.in);
		int i,j;
		int N=sc.nextInt();
		
		for(i=0;i<N;i++){
			int n1=sc.nextInt();
			// Convertimos base 5
			String cad=Integer.toString(n1,5);
			
			int num4s=0;
			for(j=0;j<cad.length();j++){
				if(cad.charAt(j)=='4'){
					num4s++;
					if(num4s>1)
						break;
				}
			}

			if(num4s>1)
				System.out.println("SI");
			else
				System.out.println("NO");
		}
		
		
	}
}

