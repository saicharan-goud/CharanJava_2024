package Practice.Instancevaraiblestatic;

class block {
    int x = 50;

    {
        x = 90;

    }

    {
        System.out.println("Number");
    }
    {
        System.out.println("printed");
    }
    public static void main(String[] args) {
        block num = new block();
        System.out.println(num.x);
    }
}
