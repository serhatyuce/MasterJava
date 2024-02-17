package encapsulation._challenge;

public class printerTest {

    public static void main(String[] args) {

        Printer printer1 = new Printer(50,true);

        printer1.printPages(21);
        printer1.addToner(120);
        printer1.printPages(10);


    }

}
