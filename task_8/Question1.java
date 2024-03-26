package javaBasics.task8;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);
        System.out.println("enter the values of a,b,c& d");
        int a = myscanner.nextInt();
        int b = myscanner.nextInt();
        int c = myscanner.nextInt();
        int d = myscanner.nextInt();
        System.out.println("print the values of a="+a+",b="+b+",c="+c+",d="+d);
        
        String decision;

        if(a+b>c+d)
        {
            
            decision = "greater than";
    
        }
        else
        {
            decision ="less than";
        }
        System.out.println("a+b is "  +  decision  +  " c+d");
    

    }
    
}
