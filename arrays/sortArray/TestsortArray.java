package arrays.sortArray;
import java.util.Arrays;

public class TestsortArray {
    public static void main(String[] args) {

        GetIntegers getInt = new GetIntegers();
        SortIntegers sortInt = new SortIntegers();

        int[] arr1 = getInt.getIntegers(5);
        System.out.println(Arrays.toString(arr1));

        int[] arr2 = sortInt.sortIntegers(arr1);
        System.out.println(Arrays.toString(arr2));
    }

}
