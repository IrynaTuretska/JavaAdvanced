package ls20200831_personListHandler;

import java.util.ArrayList;
import java.util.List;

public class PersonListHandler {

    public static List<String> personListHandler(List<Person> people, String type) {
        List<String> list = new ArrayList<>();
        if (people != null) {
            for (Person person : people) {
                List<PersonAddress> tempAddressList = person.getAddresses(type);
                String nameString = person.getFirstName() + ' ' + person.getSecondName();
                for (PersonAddress adr : tempAddressList) {
                    list.add(adr.getAddress() + ' ' + nameString);
                }
            }
        }
        return list;
    }

    public static List<String> personListHandler(List<Person> people) {
        return personListHandler(people,"email");
    }

}

