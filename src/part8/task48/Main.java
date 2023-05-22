package part8.task48;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String args[]) throws Exception {
        File file = new File("data");
        FileInputStream fis = new FileInputStream(file);
        byte[] byteArray = new byte[(int) file.length()];

        fis.read(byteArray);
        String data = new String(byteArray);
        System.out.println("Number of characters in the String: " + data.length());

        int count=0;
            byte[] bytesArray = new byte[(int)file.length()];
            fis.read(bytesArray);
            String s = new String(bytesArray);
            String [] data = s.split(" ");
            for (int i=0; i<data.length; i++) {
                count++;
            }
            System.out.println("Number of characters in the given file are " +count);
        }
    }





    

