package Practice.ExceptionalHandling;
//TRY KEYWORD
public class Keyword1 {
    public static void main(String[] args) {
        System.out.println("Hello  ");
        try{ int x= 10;
        int y = 0;
        int z = x/y;
        System.out.println(z);} //  The method should be inside try keyword
        catch(ArithmeticException ae){ // Catch should be always there with try
            ae.printStackTrace();  // this shows us what the error is.
        }
        System.out.println("Bye"); // Everything prints after an error
        
        
        
        
    }
}
