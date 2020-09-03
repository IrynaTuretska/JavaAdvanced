package ls20200902_EnumPersonAddresses;

import java.util.ArrayList;
import java.util.List;

public class PersonListHandler {
    private static String type = "email"; //static - чтобы не создавать новый объект

    public static List<String> personListHandler(List<Person> people) {
        List<String> list = new ArrayList<>(); //пустой результирующий лист
        if (people != null) {
            for (Person p : people) {
                List<PersonAddress> tempAddressList = p.getAddresses(type);
                String nameString = p.getFirstName() + " " + p.getSecondName();
                for (PersonAddress address : tempAddressList) {
                    list.add(address.getAddress() + " " + nameString); //привязка адреса к имени
                }
            }
        }
        return list;
    }

    public static void setType(String type) { //чтобы поменять поведение метода, например, post
        PersonListHandler.type = type;
    }

}
