package javaBasics.task8;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
         Scanner myscanner = new Scanner(System.in);
        System.out.println("enter the value of a,b");
        int a = myscanner.nextInt();
        int b = myscanner.nextInt();
        int c = b;
            b = a;
            a= c;

        System.out.println("the value of a is  "+a );
        System.out.println("the value of b is "+b);
    }
    
}
