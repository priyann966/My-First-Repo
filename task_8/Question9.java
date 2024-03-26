package javaBasics.task8;

import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        
         Scanner myScanner = new Scanner(System.in);
        System.out.println("enter the value of a");
        int a = myScanner.nextInt();

         if (a>=65) {

            System.out.println("The person is senoir citizen");  
        }
        else{
            
            System.out.println("The person is not a senoir citizen");

        }

    }
    
}
