package RandomLearnings;

import java.io.*;

//https://www.codingninjas.com/studio/library/bufferedreader-vs-scanner-class-in-java

public class BufferedReaderClass {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your integer data here:");
        int x = Integer.parseInt(bf.readLine());
        System.out.println("Enter your float data here:");
        float y = Float.parseFloat(bf.readLine());
        System.out.println("Enter your string here:");
        String object = bf.readLine();
        System.out.println("Cast from string to Integer: "+ x);
        System.out.println("Cast from String to Float: "+ y);
        System.out.println(object);
    }
}