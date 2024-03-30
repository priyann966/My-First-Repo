import java.util.Scanner;

public class Greatest7Q {
    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);
        System.out.println("enter the values of a,b,c");
        int a = myscanner.nextInt();
        int b = myscanner.nextInt();
        int c = myscanner.nextInt();

        if(a>b && a>c){
            System.out.println("a is the greatest number" );
        }
        else if (b>c){
            System.out.println("b is the greatest number");

        }
        else
        {

            System.out.println("c is the greatest number");
        
        }
        // using ternery operator 
        // System.out.println(a>b && a>c ? "a " : b>c ? "b" : "c" + "is the greatest number");

        
    }
    
}
