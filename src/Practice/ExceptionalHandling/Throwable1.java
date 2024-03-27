package Practice.ExceptionalHandling;

public class Throwable1 {
    public static void main(String[] args) {
        int x = 20;
        int y = 0;
        int ar [] = new int[5];
        try{
            int z = y/x;
            System.out.println(z);
            System.out.println(ar[5]);
        }
        
        catch(ArithmeticException ae) {
            
        }
        catch(ArrayIndexOutOfBoundsException arry){
            System.out.println("no index available");
        }
        catch(Exception e) {   // Super class (main exception) should be always last
            System.out.println("no index available");
        }
    }
   
}
