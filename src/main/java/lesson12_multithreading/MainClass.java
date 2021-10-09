package lesson12_multithreading;

public class MainClass {
    public static void main(String[] args) {
        Thread t1 = new MyThreading("Đây là thread t1"),
            t2 = new MyThreading("Đây là thread t2");
        
        t1.start();
        t2.start();
    }
}
