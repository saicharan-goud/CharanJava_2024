package Practice.Scanner;
import java.util.Scanner;
class ScannerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Rollno: ");
        int rollno = sc.nextInt();
        System.out.println("Enter your name: ");
        String name = sc.next();
        System.out.println("Roll no : "+ rollno + " Name: " + name);
        sc.close();
    }
}
