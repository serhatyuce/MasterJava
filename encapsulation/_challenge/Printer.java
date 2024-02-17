package encapsulation._challenge;

public class Printer {

    private int tonerLevel;
    private int printedPages;
    private boolean duplex;

    public Printer (){

    }

    public Printer(int tonerLevel, boolean duplex) {
        this.printedPages = 0;
        this.tonerLevel = (tonerLevel >= 0 && tonerLevel <=100) ? tonerLevel : -1;
        this.duplex = duplex;
    }

    public void addToner(int tonerAmount){

        tonerLevel = ((tonerLevel + tonerAmount) > 100) ? tonerLevel = 100 : (tonerLevel + tonerAmount);
        tonerLevel = ((tonerLevel + tonerAmount) < 0) ? tonerLevel = 0 : tonerLevel;

        System.out.println("Toner level is % " + tonerLevel);

    }

    public int printPages (int pages){

        if(tonerLevel > 0){
            System.out.println("printing...");
            printedPages = (duplex) ? (pages/2 + pages%2) : pages;
            if(duplex){
                System.out.println("duplex printing is active");
            }
            System.out.println("printed pages is : " + printedPages);
            return printedPages;
        }else {
            System.out.println("not enough toner level");
            return  -1;
        }
    }

    public int getPrintedPages() {
        return printedPages;
    }
}
