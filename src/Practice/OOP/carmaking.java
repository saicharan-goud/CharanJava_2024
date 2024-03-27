package Practice.OOP;

public class carmaking {
    String carname;
    int caryear;
    public carmaking(String name, int year){
        carname = name;
        caryear = year;

    }
    public static void main(String[] args) {
        carmaking mycar = new carmaking("dodge", 1930);
        System.out.println(mycar.carname + " "+ mycar.caryear);

    }

}
