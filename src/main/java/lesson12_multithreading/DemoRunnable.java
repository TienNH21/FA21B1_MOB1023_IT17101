package lesson12_multithreading;

public class DemoRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Xin chào IT17101");
    }
    
    public static void main(String[] args) {
        Thread t1 = new Thread(new DemoRunnable()),
            t2 = new Thread(new DemoRunnable());
        
        System.out.println("---------------------");
        t1.start();
        System.out.println(t1.getId());
        System.out.println(t1.getName());
        System.out.println(t1.getPriority());
        System.out.println("---------------------");
        
        
        System.out.println("---------------------");
        t2.start();
        System.out.println(t2.getId());
        System.out.println(t2.getName());
        System.out.println(t2.getPriority());
        System.out.println("---------------------");
    }
}
