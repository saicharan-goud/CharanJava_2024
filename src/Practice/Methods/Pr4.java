package Practice.Methods;

class Pr4 {
    
        int rollNum;
        int tableNum;

    
    Pr4(int r, int t){
        rollNum = r;
        tableNum = t;
    }
    void prints(){
        System.out.println("roll num: " + rollNum + " table no: "+ tableNum);
    }

    public static void main(String[] args) {
        Pr4 stud = new Pr4(5, 5);
        stud.prints();

    }
}
