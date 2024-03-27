package Practice.Encapsulation;

public class Person2 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Charan");
        person.setCountry("India");
        person.setAge();

        String name = person.getName();
        String country = person.getCountry();
        
        System.out.println(country);
    }
}
