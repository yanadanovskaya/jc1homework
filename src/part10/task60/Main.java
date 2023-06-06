package part10.task60;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        CompletionService<String> completionService = new ExecutorCompletionService<>(executorService);
        for (int i = 0; i < 10; i++) {
            completionService.submit(new SumOfNumbers());
        }
        for (int i = 0; i < 10; i++) {
            Future<String> future = completionService.take();
            String sum = future.get();
            System.out.println("Сумма чисел: " + sum);
        }
        executorService.shutdown();
    }
}
class SumOfNumbers implements Callable<String> {
    private static final int NUMBERS = 10;

    @Override
    public String call() throws Exception {
        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        int sum = 0;
        for (int i = 0; i < NUMBERS; i++) {
            int num = random.nextInt(100);
            numbers.add(num);
            sum += num;
        }
        System.out.println("Поток" + Thread.currentThread().getName() + " сгенерирован " + numbers);
        TimeUnit.SECONDS.sleep(random.nextInt(10) + 1);
        return String.valueOf(sum);
    }
}



