package part8.task47;

import java.io.File;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        File read = new File("/C:/work/");

        if (read.isDirectory()) {

            for (File file : Objects.requireNonNull(read.listFiles())) {
                if (file.isDirectory()) {
                    System.out.println(file.getName() + "\t - catalog");
                } else {
                    System.out.println(file.getName() + "\t - file");
                }
            }
        }
    }
}
