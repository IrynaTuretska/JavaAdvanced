package hw20_bankAccount;

/**
 * JavaAdvanced 30.07.2020
 */
public class PersonPrivate extends BankClient {
    private String name;
    private String secondName;


    public PersonPrivate(String client, String accountNumber, String name, String secondName) {
        super(client, accountNumber);
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
