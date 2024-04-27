/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p477;


import java.util.*;


public class P477{
	// Declaramos los vectores con espacio suficiente para los limites
	public static long[] dIno=new long[1000];
	public static long[] dVil=new long[1000];
	public static long[] armasUsadas=new long[1000];
	public static long nArmas;


	// Funcion auxiliar que devuelve el indice de la mejor arma entre las disponibles
	public static int mejorArma(){
		int hayArma=0;
		int candidata=0;
		// recorremos las armas
		for(int i=0;i<nArmas;i++){
			// Si el arma esta usada la ignoramos
			if(dIno[i]==-1)
				continue;
			// Si no hay arma, indicamos que la actual es el arma seleccionada
			if(hayArma==0){
				hayArma=1;
				candidata=i;
				continue;
			}
			// Si hay arma, comparamos el arma seleccionada con la candidata.
			// Si la supera, entonces se sustituye el arma seleccionada
			if(dIno[candidata]>dIno[i]){
				candidata=i;
			} else if(dIno[candidata]==dIno[i] && dVil[i]>dVil[candidata]){
				candidata=i;
			}

		}
		// Devolvemos el indice del arma seleccionada
		return candidata;
	}

	public static void main(String []args){

		Scanner sc=new Scanner(System.in);
		int i,j,k;
		// Bucle infinito
		while(true){
			int nUsadas=0;
			// Leemos la vida
			long vida=sc.nextInt();
			// Si la vida es cero, es condicion de parada, paramos el programa
			if(vida==0)
				break;
			// Leemos el numero de armas y cada uno de sus valores (danyo inocentes y villanos)
			nArmas=sc.nextInt();
			for(j=0;j<nArmas;j++){
				dIno[j]=sc.nextInt();
				dVil[j]=sc.nextInt();
			}
			// Bucle infinito
			while(true){
				// Obtenemos l mejor arma
				int candidata=mejorArma();
				// MArcamos el arma como usada
				dIno[candidata]=-1;
				// La marcamos como usada
				armasUsadas[nUsadas]=candidata;
				nUsadas++;
				// Restamos vida
				vida=vida-dVil[candidata];
				// Si la vida es <= 0, acabamos
				if(vida<=0)
					break;
				// Si hemos usado todas las armas, acabamos
				if(nUsadas==nArmas)
					break;

			}
			// Si al salir la vida es mayor que 0 es que hemos usado todas y no hemos podido vencer
			if(vida>0){
				System.out.println("MUERTE ESCAPA");
			}
			// Si no... es que hemos vencido e imprimimos la lista de armas usadas en el orden correcto
			else{
				System.out.print((armasUsadas[0]+1));
				for(j=1;j<nUsadas;j++){
					System.out.print(" "+(armasUsadas[j]+1));
				}
				System.out.print("\n");

			}

		}
		
	}
}
