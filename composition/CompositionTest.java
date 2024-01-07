package composition;

public class CompositionTest {

    public static void main(String[] args) {

        ComputerCase theCase  = new ComputerCase("dellModelX","Dell","220V");
        Monitor theMonitor = new Monitor("LGZQ12","LG",27,"1920 x 1444");
        MotherBoard theMotherBord = new MotherBoard("intel2536","intel",8,2,"v2.44");
        PersonalComputer thePC = new PersonalComputer("2024","Dell",theCase,theMonitor,theMotherBord);

        thePC.powerUp();

        thePC.getMonitor().drawPixelAt(10,20,"red");            // accessing the ComputerCase, Monitor, MotherBoard through the thePC object, this is ehat composition is it is different from the inheritance
        thePC.getMotherBoard().loadProgram("windows OS");
        thePC.getComputerCase().pressPowerButton();


    }

}
