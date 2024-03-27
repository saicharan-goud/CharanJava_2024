package Practice.OOP;

public class Nameage {
    String Fname = "Saicharan";
    String Lname = "Purushotham";
    int age = 23;
    public static void main(String[] args) {
        Nameage myobj = new Nameage();
        System.out.println("Name "  +   myobj.Fname+ " " + myobj.Lname);
        System.out.println(myobj.age);
    }

}
