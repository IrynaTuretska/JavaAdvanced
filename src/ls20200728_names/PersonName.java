package ls20200728_names;

/**
 * JavaAdvanced 28.07.2020
 */
public class PersonName {
    private String familyName;
    private String firstName;
    private String fatherName;

    public PersonName(String familyName, String firstName, String fatherName) {
        this.familyName = familyName;
        this.firstName = firstName;
        this.fatherName = fatherName;
    }

    public PersonName(String familyName, String firstName) {
        //вызов первого конструктора с необходимыми параметрами, чтобы объект состоял из трех полей
        this(familyName, firstName, "");
    }

    public PersonName(String familyName) {
        this(familyName, "", "");
    }

    @Override
    public String toString() {
        return familyName + " " + firstName + " " + fatherName;
    }

    public String toShortString() {
        //1. проверка длины имени или отчества
        //2. берем нулевой символ - substring
        //3. добавляем точку
        return familyName +
                ((firstName.length() > 0) ? " " + firstName.substring(0, 1) + "." : firstName) +
                ((fatherName.length() > 0) ? " " + fatherName.substring(0, 1) + "." : fatherName);
    }
}
