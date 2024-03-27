package Practice;

public class nestedforloop {
    public static void main(String[] args) {
        for(int x = 1; x<20; x++) {
            if(x%3==0)
            continue;
            for(int a=1; a<20; a++){
                System.out.println(x+"  "+a);
            }
        }
    }
}
