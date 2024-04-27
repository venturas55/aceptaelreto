/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p431;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author VeNtU
 */
public class P431 {


	public static void main(String []args){

		Scanner sc=new Scanner(System.in);
		int i,j,k;


		int mHer,nHij,maximo, temporal,hijTmp;

		do{
			int nFam=sc.nextInt();
			
			if(nFam==0)
				break;
			
			// Dclaramos dinamicamente para que no haya ceros
			int [] arrayFamilias=new int[nFam];
			for(j=0;j<nFam;j++){
				nHij=sc.nextInt();
				mHer=sc.nextInt();


				hijTmp=sc.nextInt();
				maximo=hijTmp*mHer;
				
				for(k=1;k<nHij;k++){

					hijTmp=sc.nextInt();
					temporal=hijTmp*mHer;
					if(temporal>maximo)
						maximo=temporal;
				}	
				arrayFamilias[j]=maximo;		

			}
			Arrays.sort(arrayFamilias);
			
			for(j=nFam-1;j>=1;j--){
				System.out.print(arrayFamilias[j]+" ");
			}
			System.out.println(arrayFamilias[j]);
			

		}while(true);
		
		
	}
}
