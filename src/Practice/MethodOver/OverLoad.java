package Practice.MethodOver;

class OverLoad {
    void Assign(int x, int y){
        System.out.println(x-y);
    }
    void Assign(int x, int y, int z){
        
        System.out.println(x+y+z);


    
    }
    public static void main(String[] args) {
        OverLoad xy = new OverLoad();
        xy.Assign(5,7, 6);
    }
}

    
