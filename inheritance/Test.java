package inheritance;

public class Test {

    public static void main(String[] args) {

        Animal animal2 = new Animal("Generic animal","Huge",400);
        doAnimalStuff(animal2,"slow");

        Dog dog1 = new Dog();
        doAnimalStuff(dog1, "fast");

        Dog yorkie = new Dog("yorkie",15);
        doAnimalStuff(yorkie,"fast");

        Dog retriever = new Dog("Labrador retriever", 65, "floppy","swimmer");
        doAnimalStuff(retriever,"slow");

    }

    public static void doAnimalStuff(Animal animal1,String speed){
        animal1.makeNoise();
        animal1.move(speed);
        System.out.println(animal1);
        System.out.println("_ _ _ _ _");
    }

}
