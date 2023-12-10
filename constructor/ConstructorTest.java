package constructor;

public class ConstructorTest {

    public static void main(String[] args) {
        Constructor firstPerson = new Constructor("serhat",500,"serhat@gmail.com");

        System.out.println(firstPerson.getName());
        System.out.println(firstPerson.getCreditLimit());
        System.out.println(firstPerson.getEmail());

        Constructor secondPerson = new Constructor("john","john@yandex");
        System.out.println(secondPerson.getName());
        System.out.println(secondPerson.getCreditLimit());
        System.out.println(secondPerson.getEmail());

        Constructor thirdPerson = new Constructor();
        System.out.println(thirdPerson.getName());
        System.out.println(thirdPerson.getCreditLimit());
        System.out.println(thirdPerson.getEmail());
    }
}
