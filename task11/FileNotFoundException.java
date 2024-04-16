package task11;

import java.io.FileReader;

public class FileNotFoundException {
    public static void main(String[] args) {

       try {
        FileReader file = new FileReader("C:/Users/priya/Desktop/java/javaBasics/pp.txt");
    } catch (java.io.FileNotFoundException e) {
        e.printStackTrace();
        System.out.println("handling file not found exception");
        System.out.println(e.getMessage());
        System.out.println(e.getClass());

    }

    }
}
