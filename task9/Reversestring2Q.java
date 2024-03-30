import java.util.Scanner;

public class Reversestring2Q {
    public static void main(String[] args) {
        
        Scanner myscanner = new Scanner(System.in);
        System.out.println("enter the string");
        String str = myscanner.nextLine();

        for (int i=0;i<str.length();i++) {

            //System.out.print(str.charAt(i));
            System.out.print(str.charAt(str.length()-i-1));
        }     
    }
    
}


