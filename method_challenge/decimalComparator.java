package method_challenge;

public class decimalComparator {

    public static boolean areEqualByThreeDecimalPlaces (double num1, double num2){

        long newnum1 = (long)(num1*1000);
        long newnum2 = (long)(num2*1000);


        return newnum1 == newnum2;






    }

    public static void main(String[] args) {

        System.out.println(areEqualByThreeDecimalPlaces(3.8563,3.2564));

    }
}
