
package p479sergi;

import java.util.Scanner;


public class P479sergi {

	// Declaramos un mapa de tamanyo maximo (100 Strings, 1 String por fila)
	public static String[]mapa=new String[101];
	// En las 4 posiciones, las codificamos así:
	// 0 arriba, 1 abajo, 2 derecha ,3 izquierda
	public static int[][][][]mapaAnotado=new int[101][101][4][2];
	// tamX las columnas, tamY las filas
	public static int tamX;
	public static int tamY;

	// Funcion que segun el enunciado, devuelve la distancia entre 2 puntos (no hay diagonales)
	// o devuelve -1 si uno de los puntos es -1 -1 (caso no hay malos)
	public static int distancia(int a, int b, int y, int x){
		// Caso no hay ningun malo
		if(y==-1 && x==-1)
			return -1;
		// Calculamos la distancia
		int d=Math.abs(a-y)+Math.abs(b-x);
		return d;
	}

	// Funcion que precalcula cada casilla y cada direccion por cada casilla
	// para el mapa dado
	public static void precalcular(){
			int i,j,k;
		
			// Precalculamos todos los de ARRIBA

			// Recorremos columnas
			for(j=0;j<tamX;j++){
				// Valores para cuando no encuentra a un malo
				int posX=-1;
				int posY=-1;
				// Para cada columna, recorremos la fila hacia arriba
				for(k=0;k<tamY;k++){
					// Si hay un malo, los de arriba tienen el valor de ese malo, hasta que encontremos otro
					if(mapa[k].charAt(j)=='X'){
						posX=j;
						posY=k;
					}
					// Guardamos el precalculo
					mapaAnotado[k][j][0][0]=posY;
					mapaAnotado[k][j][0][1]=posX;
				}
			}

			// Precalculamos todos los de ABAJO
			for(j=0;j<tamX;j++){
				// Valores para cuando no encuentra a un malo
				int posX=-1;
				int posY=-1;
				// Para cada columna, recorremos la fila hacia abajo
				for(k=tamY-1;k>=0;k--){
				// Si hay un malo, los de abajo tienen el valor de ese malo, hasta que encontremos otro
				if(mapa[k].charAt(j)=='X'){
						posX=j;
						posY=k;
					}
					// Valores
					mapaAnotado[k][j][1][0]=posY;
					mapaAnotado[k][j][1][1]=posX;
				}
			}

			// Precalculamos todos los DERECHA
			for(k=0;k<tamY;k++){
				// Valores para cuando no encuentra a un malo
				int posX=-1;
				int posY=-1;
				// Para cada fila, recorremos la columna hacia la derecha
				for(j=0;j<tamX;j++){
					if(mapa[k].charAt(j)=='X'){
						posX=j;
						posY=k;
					}
					// Valores
					mapaAnotado[k][j][2][0]=posY;
					mapaAnotado[k][j][2][1]=posX;
				}
			}

			// Precalculamos todos los IZQUIERDA
			for(k=0;k<tamY;k++){
				// Valores para cuando no encuentra a un malo
				int posX=-1;
				int posY=-1;
				// Para cada fila, recorremos la columna hacia la izquierda
				for(j=tamX-1;j>=0;j--){
					if(mapa[k].charAt(j)=='X'){
						posX=j;
						posY=k;
					}
					// Valores
					mapaAnotado[k][j][3][0]=posY;
					mapaAnotado[k][j][3][1]=posX;
				}
			}


	}


	public static void main(String []args){

		Scanner sc=new Scanner(System.in);
		int i,j,k;
		// Bucle infinito
		while(true){
			// Tamanyo del mapa
			tamY=sc.nextInt();
			tamX=sc.nextInt();
			// Si el mapa es 0 0, condicion de parada y salimos del programa
			if(tamY==0 && tamX==0)
				break;
			// Leemos temporal para saltar a la linea siguiente
			String tmp=sc.nextLine(); 
			
			// Leemos mapa 
			for(j=0;j<tamY;j++){
				mapa[j]=sc.nextLine();
			}
			// Precalculamos todas las posiciones del mapa para hacer consultas rapidas
			precalcular();

			// Leemos el numero de ordenes
			int nOrdenes=sc.nextInt();

			for(j=0;j<nOrdenes;j++){
				// Obtenemos coordenadas de ordendes. Les restamos 1 para adaptar nuestro sistema de coordenadas
				// al que nos propone el enunciado
				int y=sc.nextInt()-1;
				int x=sc.nextInt()-1;
				// Leemos el texto
				String texto=sc.next();
				// Segun el texto procesamos un caso.
				// Obtenemos la distancia de cada caso. Si es -1, imprimimos "NINGUNO"
				// En otros casos, imprimimos el valor devuelto
				if(texto.equals("ARRIBA")){
					int d=distancia(y,x,mapaAnotado[y][x][0][0],mapaAnotado[y][x][0][1]);
					if(d==-1)
						System.out.println("NINGUNO");
					else
						System.out.println(d);

				}else if (texto.equals("ABAJO")){
					int d=distancia(y,x,mapaAnotado[y][x][1][0],mapaAnotado[y][x][1][1]);
					if(d==-1)
						System.out.println("NINGUNO");
					else
						System.out.println(d);

				}else if (texto.equals("IZQUIERDA")){
					int d=distancia(y,x,mapaAnotado[y][x][2][0],mapaAnotado[y][x][2][1]);

					if(d==-1)
						System.out.println("NINGUNO");
					else
						System.out.println(d);
				}else if (texto.equals("DERECHA")){
					int d=distancia(y,x,mapaAnotado[y][x][3][0],mapaAnotado[y][x][3][1]);

					if(d==-1)
						System.out.println("NINGUNO");
					else
						System.out.println(d);
				}
			}
			// Al final de cada caso de prueba imprimimos esto porque nos lo pide
			// el enunciado
			System.out.println("---");
		}
		
	}
}

