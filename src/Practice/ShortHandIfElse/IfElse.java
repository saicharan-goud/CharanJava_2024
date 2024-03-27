package Practice.ShortHandIfElse;

public class IfElse {
    public static void main(String[] args) {
    int time = 5;
    if(time>=12) {
        System.out.println(time + ":pm Good afternoon");
    } else if (time>4){
        System.out.println(time + ": pm Good evening");
    }else {
        System.out.println(time + ": pm goodnight");
    }
}
}
