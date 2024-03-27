package Practice.OOP;

public class myfriend {
    String name;
    int age;

    public myfriend(String names, int ages){
        name = names;
        age=ages;


    }
    public static void main(String[] args) {
        myfriend bestie = new myfriend("Harish",32);
        System.out.println(bestie.name + " " + bestie.age);
    }
}
