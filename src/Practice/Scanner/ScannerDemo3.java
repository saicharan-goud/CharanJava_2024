package Practice.Scanner;
import java.util.Scanner;
public class ScannerDemo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter no: ");
        int number = sc.nextInt();

        if(number>=100){
            System.out.println("Verified");
            
        } else {
            System.out.println("not verified");
        }
        sc.close();
    }
}
