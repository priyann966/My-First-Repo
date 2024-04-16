package task11;

public class Stringout {
    public static void main(String[] args) {
        String str="priyanka@234";

        try {
        System.out.println(str.charAt(12));
            
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("handling StringIndexOutOfBoundsException");

            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        
    }
    
}
