package Practice.OOP;

public class carmaking {
    String carname;
    int caryear;
    public carmaking(String name, int year){
        carname = name;
        caryear = year;

    }
    public static void main(String[] args) {
        carmaking mycar1 = new carmaking("dodge", 1930);
        System.out.println(mycar1.carname + " "+ mycar1.caryear);

    }

}
