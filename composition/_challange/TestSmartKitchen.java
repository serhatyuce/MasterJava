package composition._challange;

public class TestSmartKitchen {

    public static void main(String[] args) {

        SmartKitchen kitchen = new SmartKitchen();

 /*     kitchen.getDishWasher().setHasWorkToDo(true);
        kitchen.getIceBox().setHasWorkToDo(true);
        kitchen.getBrewMaster().setHasWorkToDo(true);

        kitchen.getBrewMaster().brewCoffee();
        kitchen.getIceBox().orderFood();
        kitchen.getDishWasher().doDishes();     */

        kitchen.setKitchenState(true,false,true);
        kitchen.doKitchenWork();

    }

}
