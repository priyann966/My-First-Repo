package task11;

import java.util.Scanner;

public class InvalidAgeException extends Exception {
    // using parametrised constrctor to set the title
    public InvalidAgeException(String expmesge){
        super(expmesge);
    }
    public static void ageException() throws InvalidAgeException{
        System.out.println("please enter the age of the user");
        Scanner scanner=new Scanner(System.in);
        int age=scanner.nextInt();
        if(age>=18){
            System.out.println("entered age is valid");
        }else{
            throw new InvalidAgeException("invalid age exception");
        }
    }
    public static void main(String[] args) {
        try {
            ageException();
        } catch (InvalidAgeException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println(e.getClass());
            // System.out.println(e.);

        }
    }

    
}
