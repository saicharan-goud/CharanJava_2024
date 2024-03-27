package Practice;

public class continuwhile {
    public static void main(String[] args) {
        int x = 1;
        while (x<=25) {
            if(x%5==0){
                x++;
            continue;
            }
            System.out.println(x);
            x++;
        }
    }
}
