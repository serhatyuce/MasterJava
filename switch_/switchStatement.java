package switch_;

public class switchStatement {

    public void statementOfSwitch(int switchValue) {

        switch (switchValue) {
            case 1 -> System.out.println("value is 1");
            case 2 -> System.out.println("value is 2");
            case 3, 4, 5 -> System.out.println("value is 3,4 or 5");
            default -> System.out.println("bad request.");
        }
    }

    public void selectQuarter(String month){
        System.out.println(month + " is in the " + statementOfSwitch(month) + " quarter");
    }

    public String statementOfSwitch(String month){

        return switch (month){
            case "january", "february", "march" -> "1st";
            case "april", "may", "june" -> "2st";
            case "july", "august", "september" -> "3th";
            case "october", "november", "december" -> "4th";
            default -> "bad";
        };
    }

}
