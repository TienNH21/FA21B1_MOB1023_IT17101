package lesson2_interface;

public class MainClass {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Cat cat = new Cat();
        Bird bird = new Bird();
        
        Flyable animal1 = new Bird();
        animal1.fly();
    }
}
