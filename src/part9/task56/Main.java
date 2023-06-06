package part9.task56;

public class Main {
    public static void main(String[] args) {
        MyThread[] threads = new MyThread[10];
        for (int i = 0; i < 10; i++) {
            threads[i] = new MyThread();
            threads[i].start();
        }
    }
}
class MyThread extends Thread {
    private static final Object lock = new Object();

    @Override
    public void run() {
        synchronized (lock) {
            System.out.println(getName());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}