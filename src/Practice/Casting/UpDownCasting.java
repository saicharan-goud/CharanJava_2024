package Practice.Casting;

class UpDownCasting {
    void method1() {
        System.out.println("Parent class 1");
    }
    void method2(){
        System.out.println("Parent class 2");
    }

}

class DownCasting extends UpDownCasting{
    void method1(){
        System.out.println("Child class method 1");
    }
    void ChildMethod2(){
        System.out.println("child class method 2");
    }
}
