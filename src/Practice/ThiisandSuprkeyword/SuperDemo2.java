package Practice.ThiisandSuprkeyword;

public class SuperDemo2 {
    int x = 100;

    public void method1(){
        System.out.println(x);
    }
    
}
class SuperDemo3 extends SuperDemo2{
    int x = 250;
    
    void method2(){
        System.out.println(super.x);
        
        
    }
    public static void main(String[] args) {
        SuperDemo3 ref = new SuperDemo3();
        ref.method2();

    }
}
