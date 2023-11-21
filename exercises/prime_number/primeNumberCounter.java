package exercises.prime_number;

public class primeNumberCounter {

    public void countPrime(int checkUntil){     //this method prints and counts prime numbers until given number.

        int totalPrimeValue = 0;

        for(int counter = 1; totalPrimeValue<3 && counter<=checkUntil; counter++){

            if(isPrimeNumber(counter)){
                System.out.println(counter + " is a prime number ");
                totalPrimeValue++;

              /*  if(totalPrimeValue == 3){       //this condition breaks loop for first 3 prime number
                    System.out.println("found first 3 prime number -exiting for loop.");
                    break;
                }
                */
            }
        }
        System.out.println("there is " + totalPrimeValue + " prime number");
    }

    public boolean isPrimeNumber(int num){      //this method determine whether prime number

        if(num <= 1){
            return false;
        }

        for(int divisor = 2; divisor <= Math.sqrt(num); divisor++){
            if(num % divisor == 0){
                return false;
            }
        }
        return true;
    }

}
