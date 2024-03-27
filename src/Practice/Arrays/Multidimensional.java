package Practice.Arrays;

public class Multidimensional {
    public static void main(String[] args) {
        int arry[][] = new int[2][2];
        arry[0][0] = 1;
        arry[0][1] = 2;
        arry [1][0] = 3;
        arry[1][1] = 4;
        for(int x[]: arry){
            for(int y : x){
                System.out.print(y+" ");
            }
            System.out.println();
        }
    }
}
