package hw20_bankAccount;

/**
 * JavaAdvanced 30.07.2020
 */
public class PersonPrivate {
    private String name;
    private String secondName;


    public PersonPrivate(String name, String secondName) {

        this.name = name;
        this.secondName = secondName;
    }

    @Override
    public String toString() {
        return "PersonPrivate{" +
                "name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                '}';
    }
}
