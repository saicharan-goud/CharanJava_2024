package Practice.Accessmodifiers;

public class student {
    int x;
    String hello;

    public student(){
        x = 5;
        hello = "Tesla";

    }
    public static void main(String[] args) {
        student cars = new student();
        System.out.println(cars.x + " " + cars.hello);
    }
    }
