package Practice.Methods;

public class Pr3 {
    int addition(){
        int x = 5;
        int y = 10;
        int z = x = y;
        return z;
    }
    public static void main(String[] args) {
        Pr3 ad = new Pr3();
        int result = ad.addition();
        System.out.println(result);
    }

    }

