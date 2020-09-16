package ls20200916;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Ivan", Arrays.asList(new Address("address1", "mail"),
                new Address("address2", "post")));

        Person p2 = new Person("Anna", Arrays.asList(new Address("address4", "mail"),
                new Address("address5", "post"), new Address("address6", "billing")));

        Person p3 = new Person("Paul", Arrays.asList(new Address("address8", "mail"),
                new Address("address9", "post")));

        Person p4 = new Person("Anna", Arrays.asList(new Address("address11", "mail"),
                new Address("address12", "post")));


        List<Person> people = new ArrayList<>();
        people.add(p1);
        people.add(p2);
        people.add(p3);
        people.add(p4);

        //System.out.println(people);
        //System.out.println(getPersonsWithAddresses(people));
        System.out.println(getPersonNamesWithAddresses(people));

    }

    public static Map<Person, Set<Address>> getPersonsWithAddresses(List<Person> people) {
        Map<Person, Set<Address>> result = new HashMap<>();
        for (Person p : people) {
            Set<Address> addresses = new HashSet<>(p.getAddress());
            result.put(p, addresses);
        }
        return result;
    }

    public static Map<String, Set<Address>> getPersonNamesWithAddresses(List<Person> people) {
        Map<String, Set<Address>> result = new HashMap<>();
        for (Person p : people) {
            Set<Address> addresses = new HashSet<>(p.getAddress());
            result.put(p.getName(), addresses);
        }
        return result;
    }
}
