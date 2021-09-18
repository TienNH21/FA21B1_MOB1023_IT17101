package lesson2_interface;

public class MainClass {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Bird bird = new Bird();
        
        Chicken c = new Chicken();
//        Chicken.soChan;
        
        Flyable animal1 = new Bird();
        animal1.fly();
    }
}
