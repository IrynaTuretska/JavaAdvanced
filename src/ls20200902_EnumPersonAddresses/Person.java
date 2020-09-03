package ls20200902_EnumPersonAddresses;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String firstName;
    private String secondName;
    private List<PersonAddress> addresses; //на этом этапе - только переменная, которая будет указывать на список, списка нет

    public Person(String firstName, String secondName, List<PersonAddress> addresses) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.addresses = addresses;
    }

    public Person(String firstName, String secondName) { //персона БЕЗ списка адресов, надо выделить для него память
//        this.firstName = Objects.requireNonNull(firstName); //тот же вариант
//        this.secondName = secondName;

        if (firstName != null) {
            this.firstName = firstName;
            this.secondName = secondName;
        } else {
            throw new IllegalArgumentException(); //если пришел null, объект не создается. Объект сам контролирует свою целостность
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public List<PersonAddress> getAddresses() {
        return new ArrayList<>(addresses); //для защиты - возвращаем не исходный лист, а копию листа
    }

    public List<PersonAddress> getAddresses(String type) { //для получения списка адресов с заданным типом
        List<PersonAddress> res = new ArrayList<>();
        for (PersonAddress address : addresses) {
            if (address.getType().equals(type)) {//если тип адреса совпадает с заданным, добавляем адрес
                res.add(address);
            }
        }
        return res;
    }

    public void addAddress(PersonAddress address) { //добавление адресов, если пришел Person без списка адресов
        if (address != null) { //проверка исходного параметра, что он не null
            if (addresses == null) { //проверка, существует ли уже список PersonAddress, куда мы хотим записать адрес
                addresses = new ArrayList<>(); //если нет - создаем его, 16 элементов по умолчанию
            }
            addresses.add(address); //добавляем адрес в созданный список
        }
    }

    @Override
    public String toString() {
        return firstName + " " + secondName + addresses;
    }
}
