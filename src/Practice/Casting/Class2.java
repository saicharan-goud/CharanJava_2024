package Practice.Casting;

public class Class2 {
    public static void main(String[] args) {
        UpDownCasting up = new DownCasting();
        DownCasting d= (DownCasting)up;
        up.method1();
        up.method2();
        d.ChildMethod2();
        
    }
}
