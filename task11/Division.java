package task11;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the values of a and b");
        a =scanner.nextInt();
        b =scanner.nextInt();
        try {
            c=a/b;
            System.out.println(c);
            
        } catch (Exception e) {
            System.out.println("error in division"+e.getMessage());
            System.out.println("error"+e.getClass());
            System.out.println("error"+e.getCause());

        }

           System.out.println("end of program");
        
    }
    
}
