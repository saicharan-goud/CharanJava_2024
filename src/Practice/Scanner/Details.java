package Practice.Scanner;
import java.util.Scanner;
public class Details {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        System.out.println("Please verify your age");
        System.out.println("");
        System.out.println("Enter your year of birth");
        int number = sc.nextInt();
        if(number<2003) {
            System.out.println("You are eligible");
        } else {
            System.out.println("Sorry, you are not eligible");
            
        }
        System.out.println("Please enter your name");
        String name = sc.next();
        System.out.println("Thank you " + name + " for siging up");
        sc.close();

    }
}
