package polymorphsim.challange_exercise;

public class CarTest {

    public static void main(String[] args) {

        Car car2 = new Car("2022 blue ferrari 296 gts");
        runRace(car2);

        Car ferrari = new GasPoweredCar("2022 blue ferrari3000",15.4,8);
        /*ferrari.startEngine();
        ferrari.runEngine();
        ferrari.drive();*/

        runRace(ferrari);

    }

    public static void runRace(Car car1){
        car1.startEngine();
        car1.drive();
    }

}
