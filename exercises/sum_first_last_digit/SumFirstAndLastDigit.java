package exercises.sum_first_last_digit;

public class SumFirstAndLastDigit {

    public static int sumFirstAndLastDigit (int number){

        int lastDigit;
        int firstDigit = 0;

        if(number<0){
            return -1;
        }

        if(number == 0){
            return 0;
        }

        lastDigit = number % 10;

        if(number/10 >= 1 ){
            while(number >= 10){
                firstDigit = number/10;
                number = number/10;
            }
        }else {
            firstDigit = number;
        }

        return firstDigit+lastDigit;
    }

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(1002));
    }
    
}
