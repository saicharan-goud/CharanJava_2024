package Practice.Scanner;
import java.util.Scanner;
public class Practice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String names[] = {"Charan", "Lahari"};
        System.out.println("Welcome");
        System.out.println("Please choose an option");
        System.out.println("Search by name or Number");
        String name = sc.next();
        if(name.equalsIgnoreCase("Charan")){
            if(name.equalsIgnoreCase("Lahari")){
                System.out.println("Hello");
            }
        } else {
            System.out.println("Sorry");
            System.out.println("Please try again");
        }
        System.out.println("WELCOME " + name);
        System.out.println("Enter pincode ");
        int pincode = sc.nextInt();
        if(pincode==2334){
            
            System.out.println("Ok " + name + " Please continue with DOB");
        } else {
            System.out.println("Thank you");
        }
        System.out.println(names);
    }
}
