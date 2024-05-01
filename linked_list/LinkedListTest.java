package linked_list;

import java.util.LinkedList;

public class LinkedListTest {

    public static void main(String[] args) {

        LinkList linklist = new LinkList();

        LinkedList<String> placesToVisit1 = new LinkedList<>();
        var placesToVisit = new LinkedList<String>();

        placesToVisit.add("Sydney");
        placesToVisit.add("Texas");

        linklist.addElements(placesToVisit);
        System.out.println(placesToVisit);

        linklist.removeElement(placesToVisit);
        System.out.println(placesToVisit);

        linklist.addElements(placesToVisit);
        System.out.println(placesToVisit);

        linklist.gettingElement(placesToVisit);

        linklist.printItinerary3(placesToVisit);

        linklist.testIterator(placesToVisit);

    }
}
