package composition._challange;

public class DishWasher {

    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public  void doDishes(){
        if(hasWorkToDo){
            System.out.println("Dishwasher is washing now");
            hasWorkToDo = false;
        }
    }

}
