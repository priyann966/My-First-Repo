package task11;

import java.util.Scanner;

public class Password extends Exception{
    public Password(String expmesge){
        super(expmesge);
     }
    //max 8 char 1 special 3 numerical values
    //Priyanka@123
    public static void verificationTest() throws Password{
        System.out.println("please enter the usename");
        Scanner scanner=new Scanner(System.in);
        String ppassword=scanner.nextLine();
        System.out.println("please enter the valid password");

        String password=scanner.nextLine();

        
            if(password.equals("Priyanka@123")){
                System.out.println("valid password");
            }else{
                throw new Password("invalid password");
            }
        }
        public static void main(String[] args) {
            try {
                verificationTest();
            } catch (Password e) {
                e.printStackTrace();
                System.out.println(e.getMessage());
                System.out.println(e.getClass());
            }
            
        }   
}
        
    
    

