package ls20200710_compare;

/**
 * JavaAdvanced 10.07.2020
 */
public class Main2 {
    public static void main(String[] args) {
        Person p1 = new Person("Ivan", 20);
        Person p2 = new Person("John", 22);

        System.out.println(p1.getAge() > p2.getAge());
        System.out.println(p2.compareTo(p1));
        System.out.println(PersonCompare.compare(p1,p2));

    }
}
