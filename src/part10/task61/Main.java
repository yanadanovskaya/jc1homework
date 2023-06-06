package part10.task61;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.time.LocalDateTime;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        FileWriterService fileWriterService = new FileWriterService();
        fileWriterService.execute();
    }
}
    class FileWriterService {
    public void execute() {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("hello.txt");
            for (int i = 0; i <= 10; i++) {
                executorService.submit(new WriterTask(fileWriter) {
                });
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            executorService.shutdown();
            try {
                if (!executorService.awaitTermination(60, TimeUnit.SECONDS)) {
                    executorService.shutdownNow();
                }
            } catch (InterruptedException e) {
                executorService.shutdownNow();
            }
            if (fileWriter != null) {
                try {
                    fileWriter.close();

                } catch (IOException e) {
                    e.printStackTrace();

                }
            }
        }
    }

        public static class WriterTask implements Callable {

            private final Writer writer;

            public WriterTask(FileWriter writer) {
                this.writer = writer;
            }

            @Override
            public Void call() throws Exception {
                String message = "Hello World " + LocalDateTime.now();
                synchronized (writer) {
                    writer.write(message + System.lineSeparator());
                }
                System.out.println("Thread " + Thread.currentThread().getName() + "  message: " + message);
                return null;
            }
        }
    }