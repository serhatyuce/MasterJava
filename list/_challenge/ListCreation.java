package list._challenge;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class ListCreation {

    public void printActions () {

        String textBlock = """
                select a number
                0 - shut down.
                1 - add item (comma delimited).
                2 - remove any item (comma delimited).
                """;
        System.out.println(textBlock + " ");
    }

    public void addItem (ArrayList<String> list) {
        System.out.println("add items separate with comma");
        Scanner scanner =new Scanner(System.in);
        String[] items = scanner.nextLine().split(",");         //?
        //list.addAll(List.of(items));

        for(String i : items){
            String trimmed = i.trim();      //trims white space
            if(list.indexOf(trimmed) < 0){  // checks element of list whether in the list - block duplicated elements
                list.add(trimmed);
            }
        }
    }

    public void removeItems (ArrayList<String> list) {
        System.out.println("remove items separate with comma");
        Scanner scanner =new Scanner(System.in);
        String[] items = scanner.nextLine().split(",");         //?

        for(String i : items){
            String trimmed = i.trim();      //trims white space
            list.remove(trimmed);
        }
    }

    public void action () {

        Scanner getInput = new Scanner(System.in);

        boolean flag = true;
        ArrayList<String> groceries = new ArrayList<>();
        while(flag) {
            printActions();
            switch(Integer.parseInt(getInput.nextLine())) {
                case 1 -> addItem(groceries);
                case 2 -> removeItems(groceries);
                default -> flag = false;
            }
            groceries.sort(Comparator.naturalOrder());
            System.out.println(groceries);
        }
    }

}
