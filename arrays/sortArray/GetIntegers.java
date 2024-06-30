package arrays.sortArray;

import java.util.Scanner;

public class GetIntegers {

    public static int[] getIntegers(int len){

        Scanner getInput = new Scanner(System.in);

        int[] array1 = new int[len];

        //get integers
        for(int i = 0; i < array1.length; i++){
            System.out.println("enter a number");
            array1[i] = getInput.nextInt();
        }
        return array1;
    }
}
