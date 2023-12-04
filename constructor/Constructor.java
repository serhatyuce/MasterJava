package constructor;

public class Constructor {

    private String name;
    private double creditLimit;
    private String email;

    public Constructor(){
        this("Nobady","nobady@outlook");
    }

    public Constructor(String name, String email) {     //constructor chaining example
        this(name, 1000, email);
    }

    public Constructor(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
