package Practice.OOP;

public class Constructry {
    int x;

    public Constructry(){
         x = 5;

    }

    public static void main(String[] args) {
        Constructry og = new Constructry();
        System.out.println("Hello my age is " + og.x);
    }
}
