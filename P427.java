
package p427;

import java.util.Scanner;


public class P427 {

	public static void main(String []args){

		Scanner sc=new Scanner(System.in);
		int i;
		int N=sc.nextInt();
		
		for(i=0;i<N;i++){
			String n1=sc.next();
			String n2=sc.next();

			if(n1.equals("Luke") && n2.equals("padre")){
				System.out.println("TOP SECRET");
			}else{
				System.out.println(n1+", yo soy tu "+n2);
			}
		}
		
		
	}
}

