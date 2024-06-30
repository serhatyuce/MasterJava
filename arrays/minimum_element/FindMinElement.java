package arrays.minimum_element;

public class FindMinElement {

    public static void findMin (int[] arr){

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if(min > arr[i]){
                min = arr[i];
            }

        }
        System.out.println("minimum element is :" + min);
    }

}
