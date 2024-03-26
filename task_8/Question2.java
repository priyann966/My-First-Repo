package javaBasics.task8;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
       Scanner myscanner = new Scanner(System.in);
        System.out.println("enter the value of a");
        int a = myscanner.nextInt();

        String decision;
        if (a%2==0) {
            decision = "even";
            }
            else{
                decision = "odd";
            }
            System.out.println(a+ " is "  +  decision  +  " number");


    }
    
}
