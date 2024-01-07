package inheritance;

public class Animal extends Object{       //Animal is parent class

    private String type;
    private String size;
    private double weight;

    public Animal(){        //1st constructor

    }

    public Animal(String type, String size, double weight) {    // 2nd constructor
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    @Override
    public String toString() {      // toString() converts the hascode value to the exact value
        return "Animal{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", weight=" + weight +
                '}';
    }

    public void move (String speed){
        System.out.println(type + " moves " + speed);
    }

    public void makeNoise (){
        System.out.println(type + " makes same kind of noise.");
    }
}
