package exercises.palindrome_number;

public class NumberPalindrome {

    //it is an example for while loop

    public static boolean isPalindrome(int number){

        int reverse = 0;
        int lastDigit;
        int exNum = number;

        while (exNum != 0){
            lastDigit = exNum % 10;
            exNum = exNum / 10;
            reverse = reverse*10 + lastDigit;
        }
        return number == reverse;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(-1551));
    }

}
