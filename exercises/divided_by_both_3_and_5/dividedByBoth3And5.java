package exercises.divided_by_both_3_and_5;

public class dividedByBoth3And5 {

    public void sumUntilNumber(int number){

        int totalCountedNumber =0;

        for(int counter = 1; counter<=number; counter++){
            if(counter%3 == 0 && counter%5 ==0){
                totalCountedNumber += counter;
                System.out.println(counter + " divisible by 3 and 5");
            }
        }
        System.out.println(totalCountedNumber + " total sum of divisible number by 3 and 5");
    }

}
