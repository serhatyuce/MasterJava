package arrays.reverse_array_challenge;

import java.util.Arrays;

public class GetArrayTest {

    public static void main(String[] args) {
        GetArray getArray = new GetArray();
        Reverse reverse = new Reverse();

        int[] arr = getArray.enterNumbers();
        System.out.println(Arrays.toString(arr));
        reverse.reverseArray(arr);
    }
}