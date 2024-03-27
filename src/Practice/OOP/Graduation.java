package Practice.OOP;

public class Graduation {
    String university;
    int year;

    public Graduation(){
        university="icfai";
        year=2022;

    }

    public static void main(String[] args) {
        Graduation myclglife = new Graduation();
        System.out.println(myclglife.year+ " " + myclglife.university);
    }
}
