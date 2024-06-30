package arrays.sortArray;

import java.util.Arrays;

public class SortIntegers {

    public static int[] sortIntegers(int[] array2){

        int[] sortedArray = Arrays.copyOf(array2, array2.length);

        int temp;
        boolean flag = true;
        while(flag){
            flag=false;
            for(int i = 0; i < sortedArray.length-1; i++){
                if(sortedArray[i] < sortedArray[i+1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }

        }
        return sortedArray;
    }
}
