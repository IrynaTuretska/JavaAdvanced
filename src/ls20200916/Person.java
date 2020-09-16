package ls20200916;

import java.util.List;
import java.util.Objects;

public class Person {
    private String name;
    private List<Address> address;

    public Person(String name, List<Address> address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public List<Address> getAddress() {
        return address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) &&
                Objects.equals(address, person.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address);
    }

    @Override
    public String toString() {
        return "\n" + name + ", " + address;
    }
}

