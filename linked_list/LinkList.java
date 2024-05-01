package linked_list;

import arrays.sortArray.SortIntegers;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkList {

    public static void addElements(LinkedList<String> list) {

        list.addFirst("Darwin");
        list.addLast("Hobart");
        //Queue Methods (F in F out)
        list.offer("Melbourne");
        list.offerFirst("Brisbane");
        list.offerLast("Toowoomba");
        //Stack Methods
        list.push("Alice Springs");
        list.push("Quinland");

    }

    public static void removeElement(LinkedList<String> list) {

        list.remove(4);
        list.remove("Brisbane");

        System.out.println(list);
        String s1 = list.remove();     //removes first element
        System.out.println(s1 + " was removed");

        String s2 = list.removeFirst();     //removes first element
        System.out.println(s2 + " was removed");

        String s3 = list.removeFirst();     //removes last element
        System.out.println(s3 + " was removed");
        // Queue /Dequeue poll method
        String p1 = list.poll();    //removes first element
        System.out.println(p1 + " was removed");

        String p2 = list.pollFirst();    //removes first element
        System.out.println(p2 + " was removed");

        String p3 = list.pollLast();    //removes last element
        System.out.println(p1 + " was removed");

        String p4 = list.pop();     // removes first element
        System.out.println(p4 + " has been removed");
    }

    public static void gettingElement(LinkedList<String> list) {

        System.out.println("Retrieved element = " + list.get(4));
        System.out.println("First element = " + list.getFirst());
        System.out.println("Last element = " + list.getLast());

        System.out.println("Darwin is at position : " + list.indexOf("Darwin"));
        System.out.println("Index number of Melbourne is : " + list.lastIndexOf("Melbourne"));
        //Queue Retrieval Method
        System.out.println("Element from element() is :" + list.element());
        //Stack Retrieval Method
        System.out.println("Element from peek : " + list.peek());
        System.out.println("Element from peekFirst : " + list.peekFirst());
        System.out.println("Element from peekLast : " + list.peekLast());
    }

    public static void printItinerary(LinkedList<String> list) {     // traditional for loop

        System.out.println("Trip starts at : " + list.getFirst());
        for (int i = 1; i < list.size(); i++) {
            System.out.println("-->from " + list.get(i - 1) + " to " + list.get(i));
        }
        System.out.println("Trip ends at : " + list.getLast());
    }

    public static void printItinerary2(LinkedList<String> list) {    //enhanced for loop

        System.out.println("Trip starts at : " + list.getFirst());
        String previousCity = list.getFirst();
        for (String city : list) {
            System.out.println("-> from " + previousCity + " to " + city);
            previousCity = city;
        }
        System.out.println("Trip ends at : " + list.getLast());
    }

    public static void printItinerary3(LinkedList<String> list) {

        System.out.println("Trip starts at : " + list.getFirst());
        String previousCity = list.getFirst();
        ListIterator<String> iterator = list.listIterator(1);
        while (iterator.hasNext()) {     //has.Next checks if there are elements - check if any elements remain to be processed
            var city = iterator.next();     //retrieve element from this object - to get next element in the list
            System.out.println("-> from " + previousCity + " to " + city);
            previousCity = city;
        }
        System.out.println("Trip ends at : " + list.getLast());
    }

    public static void testIterator(LinkedList<String> list) {

        //var iterator = list.iterator();     //iterator provide a safe way to remove an element
        var iterator = list.listIterator();
        //An iterator forwards only, and only supports the remove method
        //A ListIterator can be used to go both forwards and backwards , and In addition to the remove method, It also supports the add and set methods

        while (iterator.hasNext()) {
            //System.out.println(iterator.next());
            if (iterator.next().equals("Brisbane")) {
                //iterator.remove();
                iterator.add("Lake Wivenhoe");
            }
        }

        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }

        System.out.println(list);

        var iterator2 = list.listIterator(3);   //this is a way to get an iterator with the cursor positioned in some other place
        System.out.println("cursor located between index 2 and index 3 : " + iterator2.next());
    }

}
