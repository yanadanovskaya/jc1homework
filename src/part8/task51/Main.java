package part8.task51;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        String[] files = {"one", "two", "three", "four", "five"};
        try {
            StringBuilder res = new StringBuilder();
            for (String file : files) {
                BufferedReader reader1 = new BufferedReader(new FileReader("./src/part8/task51/Main" + file));
                String s = reader1.readLine();
                while (s != null) {
                    res.append(s);
                    res.append("\n");
                    s = reader1.readLine();
                }
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("./src/part8/task51/Main" ));
            bufferedWriter.write(res.toString());
            bufferedWriter.close();
            File f1 = new File("./src/part8/task51/Main" );
            String[] listFiles = f1.list();
            BufferedWriter bufferedWriter1 = new BufferedWriter(new FileWriter("./src/part8/task51/Main" ));
            if (listFiles == null) {
                System.out.println("Файлы не прочитаны");
            } else {
                bufferedWriter1.write(String.join("\n", listFiles));
                bufferedWriter1.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
