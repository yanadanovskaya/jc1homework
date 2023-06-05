package part9.task58;

public class Consumer implements Runnable {

    private final Line line;

    public Consumer(Line line) {
        this.line = line;
    }

    @Override
    public void run() {

        while (line.getCounter() < 10000) {
            try {
                Thread.sleep((int) (Math.random() * 999 + 1));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (line.getCount() > 0) {
                line.deletion();
                System.out.println("Потребитель : элементов в очеред : "
                        + line.getCount()
                        + " (Обработаных элементов = "
                        + line.getCounter()
                        + ")");
            }
        }
        System.out.println("Потребитель завершил работу." + Thread.currentThread().getName());

    }
}