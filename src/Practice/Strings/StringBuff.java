package Practice.Strings;

public class StringBuff {
    public static void main(String[] args) {
        StringBuffer n = new StringBuffer("ABCDEFGHIJK");
    
    
    System.out.println(n.substring(7)); //Starts from 7th character
    System.out.println(n.append(" Hello")); //adds string at the last position
    System.out.println(n.delete(1,3)); //to delete particular characters from a string
    System.out.println(n.substring(1)); //only prints from where you want.
    System.out.println(n.insert(4, "1234")); //Allows you to add String anywhere you want
    System.out.println(n.replace(0,3, "abc")); //replace any string you want in any position
    System.out.println(n.reverse()); //get output in reverse
    }
}
