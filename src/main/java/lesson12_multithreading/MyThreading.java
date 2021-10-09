package lesson12_multithreading;

public class MyThreading extends Thread {
    private String message;
    
    public MyThreading(String message) {
        this.message = message;
    }
    
    @Override
    public void run() {
        String txt = this.message;
        System.out.println(txt);
    }
}
