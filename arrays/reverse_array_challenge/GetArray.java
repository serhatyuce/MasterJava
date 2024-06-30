package arrays.reverse_array_challenge;

import java.util.Scanner;

public class GetArray {

    public static int[] enterNumbers(){

        Scanner getString = new Scanner(System.in);

        System.out.println("enter a list of integers, separate by comas:");
        String input = getString.nextLine();
        String[] splits = input.split(",");
        int[] values = new int[splits.length];

        for(int i = 0; i< splits.length; i++){
            values[i] = Integer.parseInt(splits[i].trim());
        }
        return values;
    }

}
