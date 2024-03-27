package Practice.Scanner;
import java.util.Scanner;
public class Quizz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        System.out.println("Please enter your name to start quiz");
        String name = sc.next();
        System.out.println("Hello " + name + " let's start the quiz");
        System.out.println("Q.no 1");
        System.out.println("What is 6+6");
        int number = sc.nextInt();
        if(number==12) {
            System.out.println("correct");
        } else {
            System.out.println("you failed");
            return;
        }
        System.out.println("Who is hero in Salaar movie");
        String hero = sc.next();
        if(hero.equalsIgnoreCase("Prabhas")) {
            System.out.println("You are right! He is the greatest actor of all time");
        } else {
            System.out.println("wrong");
            System.out.println("Please try again you dumb");
        }
        sc.close();

    }
}
