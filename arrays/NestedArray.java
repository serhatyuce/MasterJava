package arrays;

import java.util.Arrays;

public class NestedArray {
    public static void main(String[] args) {

        int[][] array1 = new int[5][4];

        for(int[] el : array1){
            System.out.println(Arrays.toString(el));
        }
        System.out.println();

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                System.out.print(array1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        for(var element : array1){
            for(var inElement : element){
                System.out.print(inElement + " ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println(Arrays.deepToString(array1));
        System.out.println();

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                array1[i][j] = (i * 10) + (j + 1);
                System.out.print(array1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        array1[1] = new int[] {10,20,30};
        System.out.println(Arrays.deepToString(array1));

        Object[] anArray = new Object[3];
        System.out.println(Arrays.toString(anArray));

        anArray[0] = new String[] {"a", "b", "c"};
        System.out.println(Arrays.deepToString(anArray));

        anArray[1] = new String[][]{
                {"1","2"},
                {"5","6","7"},
                {"8","9"}
        };
        System.out.println(Arrays.deepToString(anArray));

        anArray[2] = new int[2][2][2];
        System.out.println();

        for(Object element : anArray){
            System.out.println("Element typ" +
                    "e = " + element.getClass().getSimpleName());
            System.out.println("Element toString() = " + element);
            System.out.println(Arrays.deepToString((Object[]) element));
        }

    }
}
