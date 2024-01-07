package string_inspection_methods;

public class StringInspectionMethods {

    public static void printInformation (String string1){

        if(string1.isEmpty()){
            System.out.println("string is empty");
            return;
        }

        if(string1.isBlank()){
            System.out.println("string is blank");
            return;
        }

        int length =string1.length();
        System.out.printf("Length = %d %n",length);                             //%d --> decimal number %n insert a new line character
        System.out.printf("First char = %c %n", string1.charAt(0));             //%c --> unicode character
        System.out.printf("Last char = %c %n",string1.charAt(length - 1));
        System.out.printf("index of r = %d %n",string1.indexOf('r'));
        System.out.printf("index of wa = %d %n",string1.indexOf("wa"));
        System.out.printf("index of r = %d %n",string1.lastIndexOf('r'));
    }
}
