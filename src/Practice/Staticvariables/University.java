package Practice.Staticvariables;

public class University {
    
    int rollNum;
    String studentName;
    static String clgName = "PSG";

    University(int r, String n){
        rollNum = r;
        studentName = n;

    }
    void show(){
        System.out.println("roll number"+rollNum + "  "+studentName+"  "+clgName);
    }
    public static void main(String[] args) {
        University s1 = new University(101, "Saicharan");
        University s2 = new University(102, "Lahari");
        University s3 = new University(103, "Avanthi");
        University s4 = new University(104, "Karthik");
        s1.show();
        s2.show();
        s3.show();
        s4.show();
    }
}





