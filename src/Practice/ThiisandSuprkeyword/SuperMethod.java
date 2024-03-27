package Practice.ThiisandSuprkeyword;

public class SuperMethod {
    int x = 10;
    int y =15;

    void method1(){
        System.out.println(x+y);
    }
}
class SuperMethod2 extends SuperMethod{
    int a = 20;
    int b = 20;
    
    void method2(){
        super.method1();
        System.out.println(a+b);
        
    }
    public static void main(String[] args) {
        SuperMethod2 ref = new SuperMethod2();
        ref.method2();
        
    }
}

