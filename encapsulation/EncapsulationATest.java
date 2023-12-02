package encapsulation;

public class EncapsulationATest {

    public static void main(String[] args) {
        EncapsulationA user = new EncapsulationA();

        user.setName("serhat");
        user.setSurName("yuce");
        user.setId(55);

        System.out.println("Name :" + user.getName());
        System.out.println("Surname :" + user.getSurName());
        System.out.println("ID number :" + user.getId());

    }

}
