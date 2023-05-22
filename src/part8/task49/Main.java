package part8.task49;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        int n = sum();
        System.out.println(n);
    }

    static int sum(){

        BufferedReader bufferedReader = null;
        int sum = 0;

        try {
            bufferedReader = new BufferedReader(new FileReader("input.txt"));

            String s = null;

            while ((s = bufferedReader.readLine()) != null) {
                String [] ss = s.split("[\\\\/№;:а-яА-Яa-zA-Z?!,.\\-(){}\\[\\]@#\\$%^&?*~<>\\s]+");


                for(String S1:ss) {
                    if(S1.length()>0)
                        sum+=Integer.parseInt(S1);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return sum;

    }

}