package arrays.reverse_array_challenge;

import java.util.Arrays;

public class Reverse {

    public static void reverseArray(int[] array){

        int maxIndex = array.length-1;
        int halflength = array.length/2;

        for (int i = 0; i < halflength; i++) {

            int temp = array[i];
            array[i] = array[maxIndex-i];
            array[maxIndex -i] = temp;
            System.out.println("-->" + Arrays.toString(array));

        }
    }

}
