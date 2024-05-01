package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class List {

    public static void main(String[] args) {

        String[] array1 = new String[5];
        String[] array2 = {"1","2","3"};        //anonymous array
        String[] array3 = new String[] {"a","c","b"};

        String[][] array4 = new String[][] {        //multi-dimensional array
                {"january","february"},
                {"march","april","may"}
        };

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(array3));
        System.out.println(Arrays.deepToString(array4));

        Arrays.sort(array3);
        System.out.println(Arrays.toString(array3));
        System.out.println("'b' found at index of : " + Arrays.binarySearch(array3,"b"));

        ArrayList <String> arrayList1 = new ArrayList<>();       //instantiating a list without value
        ArrayList <String> arrayList2 = new ArrayList<>(java.util.List.of("first","Second","third","zero"));       //ınstantiating with values

        System.out.println(arrayList1);
        System.out.println(arrayList2);
        arrayList2.sort(Comparator.naturalOrder());
        System.out.println(arrayList2);
        arrayList2.sort(Comparator.reverseOrder());
        System.out.println(arrayList2);

        String[] originalArray = new String[] {"first","second","Third"};
        var originalList = Arrays.asList(originalArray);                    //Array as an ArrayList

        System.out.println(Arrays.toString(originalArray));
        System.out.println(originalList);

        originalList.set(0,"one");      //any change will have effect on the source array
        System.out.println(Arrays.toString(originalArray));
        System.out.println(originalList);

        originalList.sort(Comparator.naturalOrder());       //sorted a List
        System.out.println(originalList);

    }


}
