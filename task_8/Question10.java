package javaBasics.task8;

import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);
        System.out.println("enter the values of a");
        int a = myscanner.nextInt();
        int length = 0;
        while(a>0)
        {
            length++;
            //System.out.println(length);
            a= a/10;   
            //System.out.println(a); 
        }
        System.out.println(length);
        
    }
    
}
