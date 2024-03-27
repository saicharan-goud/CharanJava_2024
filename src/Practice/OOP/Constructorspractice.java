package Practice.OOP;

public class Constructorspractice {
    int x=5;
    public static void main(String[] args) {
        Constructorspractice hi = new Constructorspractice();
        System.out.println(hi.x);
    }
    public Constructorspractice () {
        x=22;
        System.out.println("I'm trying");
    }
    
}
