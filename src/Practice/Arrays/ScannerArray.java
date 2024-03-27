package Practice.Arrays;
import java.util.Scanner;
public class ScannerArray {
    public static void main(String[] args) {
        int NUM = 10;
        int arr[] = new int[NUM];

        Scanner scan = new Scanner(System.in);
            for(int i = 1; i<NUM; i++) {
                System.out.println("Enter a number: "+ i);
                arr[i] = scan.nextInt();
            }
        
    }
}
