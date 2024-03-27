package Practice.ThiisandSuprkeyword;

public class SuperConstructo {
    int x = 10;
    int y =20;
    void method1(int x, int y) {
        System.out.println(x+y);
    }

}
class SuperCons2 extends SuperConstructo{
    void method2(int x, int y){

        
        System.out.println(200000);
    }
    public static void main(String[] args) {
        SuperCons2 ref = new SuperCons2();
        ref.method2(5,7);

    }
}


