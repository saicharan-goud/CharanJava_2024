package Practice.Accessmodifiers;

public class workplace {
    String empname;
    int empid;
    String empdesignation;
    int phonenum;

    public workplace(String emp_name, int emp_id){
        empname = emp_name;
        empid = emp_id;
        System.out.println("Empname: " + empname + " empid: " + empid);

    }
    workplace(String emp_designation){
        this("charan", 1212);
        empdesignation = emp_designation;
        System.out.println("empdesignation: " + empdesignation);
    }

    public static void main(String[] args) {
        //workplace e = new workplace("charan", 1212);
        workplace e1 = new workplace("software.engineer");
       // System.out.println(e.empname + "  " + e.empid);
    }

    }
