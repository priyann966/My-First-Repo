import java.util.Scanner;

public class Palindrome1Q {
    public static void main(String[] args) {
        String str,reverse = "";

        System.out.println("enter the string to check plaindrome or not");
                Scanner myscanner = new Scanner(System.in);
                str = myscanner.nextLine();
                int length = str.length();

                for (int i=0;i<str.length();i++) {
                    // outer loop will have the entered string length
                    // storing the reversal string length in an empty string

                  reverse=reverse+str.charAt(str.length()-i-1);

                   }
                   if (str.equals(reverse)){
                    System.out.println("The string is a palindrome.");
                 }
                 else{
                    System.out.println("The string is not a palindrome.");
                   }
        }

            }      
             
        
    
    

