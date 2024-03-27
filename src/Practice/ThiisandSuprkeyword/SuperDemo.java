package Practice.ThiisandSuprkeyword;

public class SuperDemo {
    int x = 1;
    public void method1(){
        System.out.println(x);
    }


}
class Childclass extends SuperDemo{
    public void method2(){
        int x = 2;
        System.out.println(this.x);
    }
    
    
    public static void main(String[] args) {
        Childclass xy = new Childclass();
        xy.method2();
}
}