package Practice.Encapsulation;

class GetterSetter {
    private String name = "Charan";

    public String getName(){
        return name;
    }
    public void setName(String name){
        System.out.println("Name changed");
        this.name=name;

    }
    

    

}

