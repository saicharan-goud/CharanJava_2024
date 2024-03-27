package Practice.Scanner;
import java.util.Scanner;
public class Demo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your age");
        int age = sc.nextInt();
        if(age>=21) {
            System.out.println("Welcome");
        } else {
            System.out.println("Sorry you are not eligible");
        }
        sc.close();
    }
}
