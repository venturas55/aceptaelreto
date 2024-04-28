/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p430;

import java.util.Scanner;

/**
 *
 * @author VeNtU
 */
public class P430 {
	public static void main(String []args){

		Scanner sc=new Scanner(System.in);
		int i,j,k;
	
		
		int diaRes=0;
		int []dia=new int[100001];
		int []periodo=new int[100001];
		do{
			int nPruebas=sc.nextInt();
			
			if(nPruebas==0)
				break;
			
			for(j=0;j<nPruebas;j++){
				dia[j]=sc.nextInt();
				periodo[j]=sc.nextInt();
			}
			
			diaRes=dia[0];

			for(j=1;j<nPruebas;j++){
				while(dia[j]<=diaRes)
					dia[j]=dia[j]+periodo[j];
				diaRes=dia[j];
			}

			System.out.println(diaRes);

		}while(true);
	}
}

