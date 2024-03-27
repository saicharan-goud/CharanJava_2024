package Practice.Methods;

public class Pr5 {
    static void myMethod(){
        System.out.println("Hey there");
    }
    int add(){
        int x = 5;
        int y = 6;
        int z = x + y;
        return z;
    
    }
    
    public Pr5(int g){
        String x = "Dell";
        String y = "HP";
        int b = g;
        System.out.println(g);
    }
    public static void main(String[] args) {
        Pr5 prints = new Pr5(5);
        prints.myMethod();
        int result = prints.add();
        System.out.println(result);
        
    }
    {
        System.out.println("wassupp?");
    }
    static{
        System.out.println("Hi bro");
    }

    
}
