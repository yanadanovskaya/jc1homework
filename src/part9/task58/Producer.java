package part9.task58;

public class Producer implements Runnable {
    private final Line line;

    public Producer(Line line) {
        this.line= line;
    }

    @Override
    public void run() {
        while (line.getCounter() < 10000) {
            try {
                Thread.sleep((int) (Math.random() * 999 + 1));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            line.add((int) (Math.random() * 99 + 1));
            System.out.println("Производитель : элементов в очереди : " + line.getCount());
        }
        System.out.println("Производитель завершил работу." + Thread.currentThread().getName());
    }
}
