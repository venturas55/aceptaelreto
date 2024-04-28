package p720;

import java.util.Arrays;
import java.util.Scanner;

public class P720 {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int cantidad = in.nextInt();
            Long array[] = new Long[cantidad];
                //leo el array
                for (int i = 0; i < cantidad; i++) {
                    array[i] = in.nextLong();
                                    }
                
                do {
                    if (ordenadoAscendente(array)) {
                        break;
                    } else {
                        if (array.length % 2 == 0) {
                            array = Arrays.copyOfRange(array, array.length / 2, array.length);
                            //array = getSliceOfArray(array, array.length / 2, array.length);
                        } else {
                            array = Arrays.copyOfRange(array, array.length / 2 + 1, array.length);
                            //array = getSliceOfArray(array, array.length / 2 + 1, array.length);
                        }
                    }
                } while (true);
            System.out.println(array.length);
        }
    }

    static boolean ordenadoAscendente(Long[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }
    
    public static Long[] getSliceOfArray(Long[] arr,       int start, int end)    {
        Long[] slice = new Long[end - start];
        for (int i = 0; i < slice.length; i++) {
            slice[i] = arr[start + i];
        }
        return slice;
    }
}