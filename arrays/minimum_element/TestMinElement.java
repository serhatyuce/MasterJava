package arrays.minimum_element;

import java.util.Arrays;

public class TestMinElement {

    public static void main(String[] args) {

        GetIntegers getIntegers = new GetIntegers();
        FindMinElement findMinElement = new FindMinElement();

        int[] array1 =  getIntegers.readIntegers(4);
        System.out.println(Arrays.toString(array1));

        findMinElement.findMin(array1);


    }

}
