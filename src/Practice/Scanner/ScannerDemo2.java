package Practice.Scanner;
import java.util.Scanner;
public class ScannerDemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your ticket no: ");
        int ticketNo = sc.nextInt();

        System.out.println("Enter movie name: ");
        String movieName = sc.next();

        System.out.println("Watch " + movieName + " with ticket no: " + ticketNo);
        System.out.println("Thank you.");
    }
}
