package Practice.Scanner;
import java.util.Scanner;
public class Pincode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your passcode: ");
        int number = sc.nextInt();

        if(number==1212) {
            System.out.println("Welcome");
        } else {
            System.out.println("Wrong passcode");
        }
        sc.close();
    }
}
