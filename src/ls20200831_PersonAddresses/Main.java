package ls20200831_PersonAddresses;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person p1 = null;
        try {
            p1 = new Person(null, "secondName1"); //попытайся сделать операцию
        } catch (Exception e) {
            System.out.println("person not create");
        }
        System.out.println(p1);

//        Person p1 = new Person("name1", "secondName1");
//        p1.addAddress(new PersonAddress("adr11", "post"));
//        p1.addAddress(new PersonAddress("adr12", "billing"));
//        p1.addAddress(new PersonAddress("adr13", "email"));
//        p1.addAddress(new PersonAddress("adr14", "email"));
//
//        Person p2 = new Person("name2", "secondName2");
//        p2.addAddress(new PersonAddress("adr21", "post"));
//        p2.addAddress(new PersonAddress("adr22", "billing"));
//        p2.addAddress(new PersonAddress("adr23", "email"));
//        p2.addAddress(new PersonAddress("adr24", "email"));
//
//        Person p3 = new Person("name3", "secondName3");
//        p3.addAddress(new PersonAddress("adr31", "post"));
//        p3.addAddress(new PersonAddress("adr32", "billing"));
//        p3.addAddress(new PersonAddress("adr33", "email"));
//        p3.addAddress(new PersonAddress("adr34", "email"));
//
//        List<Person> people = new ArrayList<>();
//        people.add(p1);
//        people.add(p2);
//        people.add(p3);
//
//        System.out.println(PersonListHandler.personListHandler(people));


        //работа с копией объекта
        //List<PersonAddress> tempList = p1.getAddresses("email");
        //tempList.set(0, new PersonAddress("1", "1"));
        //System.out.println(tempList);

        //System.out.println(p1);

    }
}
