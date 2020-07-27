package ls20200710_compare;

/**
 * JavaAdvanced 10.07.2020
 */
public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // int - если возвращается положительное число, то объект, с которым сравниваем, больше;
    // отрицательное - меньше;
    // ноль - равны
    int compareTo(Person p) {
        return this.getAge() - p.getAge();
    }

    // вариант 2
    static int compare(Person p1, Person p2) {
        return p1.getAge() - p2.getAge();
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
