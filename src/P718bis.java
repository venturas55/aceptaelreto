package p718bis;

import java.util.Arrays;
import java.util.Scanner;

public class P718bis {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        do {
            int nPruebas = in.nextInt();
            int[] pendientes = new int[nPruebas];

            int total = 0;
            if (nPruebas == 0) {
                break;
            }

            for (int i = 0; i < nPruebas; i++) {
                pendientes[i] = in.nextInt();
            }

            int index = Arrays.binarySearch(pendientes, pendientes[0]);
            removeTheElement(pendientes, 0);

            if (index < 0) {
            } else {
                removeTheElement(pendientes, index);
                total++;
            }
            System.out.println(total);

        } while (true);
    }

    public static int[] removeTheElement(int[] arr, int index) {

        // If the array is empty 
        // or the index is not in array range 
        // return the original array 
        if (arr == null || index < 0
                || index >= arr.length) {

            return arr;
        }

        // Create another array of size one less 
        int[] anotherArray = new int[arr.length - 1];

        // Copy the elements except the index 
        // from original array to the other array 
        for (int i = 0, k = 0; i < arr.length; i++) {

            // if the index is 
            // the removal element index 
            if (i == index) {
                continue;
            }

            // if the index is not 
            // the removal element index 
            anotherArray[k++] = arr[i];
        }

        // return the resultant array 
        return anotherArray;
    }
}
