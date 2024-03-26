package javaBasics.task8;

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);
        System.out.println("enter the value of n");
        int n = myscanner.nextInt();
        int j=1;
        for(int i=n ;i >= 1; i--){
        j=j*i;
        System.out.println(j);
        // System.out.println(i);
        }
        System.out.println("the factorial of the given number is " +j);



    }



}
