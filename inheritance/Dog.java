package inheritance;

public class Dog extends Animal{

    private String earShape;
    private String tailShape;

    public Dog(){                                       //constructor for Dog class
        super("mutt","Big",50);         //super() calls constructor from the parent class
    }

    public Dog(String type, double weight){             // 2nd constructor
        this(type,weight,"perky", "curled");
    }

    public Dog(String type, double weight, String earShape, String tailShape) {
        super(type,weight < 15 ? "small" : (weight < 35 ? "medium" : "large") ,weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }

    @Override
    public void move(String speed) {
        super.move(speed);
    }
}
