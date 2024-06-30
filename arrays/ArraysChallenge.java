package arrays;

import java.util.Random;

public class ArraysChallenge {

    public Integer[] getRandomArray(int len){

        Random random =new Random();
        Integer[] newInt = new Integer[len];

        for(int i = 0; i < len; i++){
            newInt[i] = random.nextInt(100);
        }
        return  newInt;
    }

}
