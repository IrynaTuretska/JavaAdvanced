package ls20200817_equals_example;

public class Main {
    public static void main(String[] args) {

        Address address = new Address("Berlin", "Alexander Platz");
        Person p1 = new Person("Jack", address);
        Person p2 = new Person("Nick");
        Person p3 = new Person("Jack", address);

        //System.out.println(p1 == p2);
        System.out.println(p1.equals(p3));

    }
}
