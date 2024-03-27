package Practice.Arrays;

//         for (int i=0; i<5; i++)   //taking i = 0 because index starts with 0 always
//         {
        
//         System.out.println(nums[i]);
//         }
//     }
// }
// class Demo3 {
//     public static void main(String[] args) {
//         int numb[] = {1,2,3,4,5};

//         System.out.println(numb[2]);
//     }
// }
class Demoo{
    public static void main(String[] args) {
        int numss [][] = new int[3][4];
        numss[0][0] = 5;
        numss[0][1] = 6;
        numss[0][2] = 5;
        numss[1][0] = 8;
        numss[1][1] = 10;
        numss[1][2] = 12;
        numss[2][0] = 14;
        numss[2][1] = 16;
        numss[2][2] = 18;
        // Scanner sc = new Scanner(System.in) ;
        // System.out.println("Hello");
        // System.out.println("please enter a number");
        // int num = sc.nextInt();
        // if(num<10){
        //     System.out.println("True");
        // } else{
        //     System.out.println("False");
        // }
        for(int i=0; i<3; i++){
            for(int j=0;j<4; j++){
                System.out.print(numss[i][j]+" ");

            }
            System.out.println();
        }
        
    }
}