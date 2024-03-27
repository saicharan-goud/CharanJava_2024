package Practice;

public class skipanumber {
    public static void main(String[] args) {
        for(int x=1; x<=30;x++){
            if(x%5==0){
                continue;
            }
            System.out.println(x);
        }
    }
}
