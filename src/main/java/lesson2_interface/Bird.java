package lesson2_interface;

public class Bird
    extends Animal implements Flyable, Runable {
    /*
     * Class là thể hiện chi tiết
     * Interface là thể hiện trừu tượng
    
     * Khi 1 class thực thi lại interface,
     * tất cả các phương thức được khai báo trong interface
     * phải được triển khai trong class
     */
    
    @Override
    public void fly() {
        System.out.println("Flying ...");
    }

    @Override
    public void run() {
        System.out.println("Running slowly ...");
    }
    @Override
    public void tiengKeu() {
        System.out.println("ABC ...");
    }
}
