package ls20200831_PersonAddresses;

import java.util.ArrayList;
import java.util.List;

public class PersonListHandler {
    public static List<String> personListHandler(List<Person> people) {
        List<String> list = new ArrayList<>();
        if (people != null) {
            for (Person p : people) {
                List<PersonAddress> tempAddressList = p.getAddresses("email");
                String nameString = p.getFirstName() + " " + p.getSecondName();
                for (PersonAddress address : tempAddressList) {
                    list.add(new String(address.getAddress() + " " + nameString)); //привязка адреса к имени
                }
            }
        }
        return list;
    }
}
