/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package p108;

import java.util.*;

public class P108 {
    public static void main(String[] args) {
        String linea, maximoS = "", minimoS = "", esSuperior = "";
        float maximo, minimo, sumaTotal, sumaComidas;
        float[] damic = new float[5];
        String[] letrasDAMIC={"DESAYUNOS","COMIDAS","MERIENDAS","CENAS","COPAS"};
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            maximo = Float.MIN_VALUE;
            minimo = Float.MAX_VALUE;
            sumaTotal = 0;
            Arrays.fill(damic, 0);
            sumaComidas = 0;
            int i = 0;
            int icomidas = 0;
            do {

                linea = in.nextLine();
                if (linea.equals("N 0"))
                    break;
                String[] valores = linea.split(" ");
                float valor = Float.parseFloat(valores[1]);
                // System.out.println(valores[0] + " y " + valores[1] + " o " + valor);
                switch (valores[0].charAt(0)) {
                    case 'D':
                        damic[0] = valor;
                        break;
                    case 'A':
                        damic[1] = valor;
                        icomidas++;
                        sumaComidas += valor;
                        break;
                    case 'M':
                        damic[2] = valor;
                        break;
                    case 'I':
                        damic[3] = valor;
                        break;
                    case 'C':
                        damic[4] = valor;
                        break;
                    default:
                        break;
                }
                sumaTotal += valor;
                i++;
            } while (true);
            //System.out.println("length: "+ damic.length);
            for (int j = 0; j < damic.length; j++) {
                //System.out.println(j+":>"+damic[j]);
                if (damic[j] > maximo) {
                    maximo = damic[j];
                    maximoS=letrasDAMIC[j];
                }else if(damic[j] == maximo){
                    maximoS="EMPATE";
                }
                if (damic[j] < minimo) {
                    minimo = damic[j];
                    minimoS=letrasDAMIC[j];
                }else if(damic[j] == minimo){
                    minimoS="EMPATE";
                }

            }

            //System.out.println(sumaComidas + " a ver " + icomidas + " ");
            //System.out.println(sumaComidas / icomidas + ">" + sumaTotal / i);

            if (sumaComidas / icomidas > sumaTotal / i)
                esSuperior = "SI";
            else
                esSuperior = "NO";

            System.out.println(maximoS + "#" + minimoS + "#" + esSuperior);
        }
        in.close();
    }
}