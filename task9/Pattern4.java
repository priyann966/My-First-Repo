import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
          Scanner myscanner = new Scanner(System.in);
        System.out.println("enter the value of a");
        int a = myscanner.nextInt();

        for(int i=1;i<=a;i++){
            // outer loop with 5 rows

            for(int j=1;j<=a;j++){
                // inner loop with 5 coloumns

            if(i==j || i==(a-j+1))
            // here if i1=j1...i5=j5
            // or if i1=j5....i5=j1
            {
                System.out.print("*");

            }
            else
            {
                System.out.print(" ");

            }

        }

        System.out.println(" ");
        
    }
    }
}
