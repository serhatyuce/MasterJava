package arrays;

import java.util.Arrays;
import java.util.Collections;
public class ArrayChallengeTest{
    public static void main(String[] args) {

        ArraysChallenge getArray = new ArraysChallenge();

        Integer[] firstArray = getArray.getRandomArray(10);
        System.out.println(Arrays.toString(firstArray));

        Arrays.sort(firstArray);
        System.out.println(Arrays.toString(firstArray));

        Arrays.sort(firstArray,Collections.reverseOrder());
        System.out.println(Arrays.toString(firstArray));

    }

}
