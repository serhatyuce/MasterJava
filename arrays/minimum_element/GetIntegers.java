package arrays.minimum_element;

import java.util.Scanner;

public class GetIntegers {

    public static int[] readIntegers (int arrLength){

        int[] arr1 = new int[arrLength];

        Scanner getNumber = new Scanner(System.in);

        for (int i = 0; i < arrLength; i++) {
            System.out.println("enter a number");
            int num = getNumber.nextInt();
            arr1[i] = num;
        }
        return arr1;
    }

}
