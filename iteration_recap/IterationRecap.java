package iteration_recap;

public class IterationRecap {

     public void forLop(){
        for (int initial=0; initial<=10; initial++) {
            System.out.println("number : " + initial);
        }
        System.out.println("example to understand for statement");
    }

    public  void whileLoop(){
        int number = 0;
        while (number < 10){
            System.out.println("number : " + number);
            number++;
        }
        System.out.println("example to understand while statement");
    }

    public  void whileLoop(int startNumber){
        while(startNumber < 15){
            startNumber++;

            if(startNumber < 5){
                System.out.println("skipping number : " + startNumber);
                continue;
            }

            if(startNumber == 14){
                System.out.println("Breaking at :" + startNumber);
                break;
            }
            System.out.println("we just get this numbers :" + startNumber );
        }
    }

    public void doWhileLoop(){

        int initial = 0;

        do{
            System.out.println("number : " + initial);
            initial++;
        }while(initial < 10);

    }





}
