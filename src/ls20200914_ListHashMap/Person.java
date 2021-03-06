package ls20200914_ListHashMap;

import java.util.Objects;

public class Person {
    private String name;
    //private int age;

    public Person(String name, int age) {
        this.name = name;
        //this.age = age;
    }

    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return "Person: " + name ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
