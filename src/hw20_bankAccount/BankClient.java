package hw20_bankAccount;

/**
 * JavaAdvanced 30.07.2020
 */
public class BankClient {
    private PersonPrivate person;
    private Company company;
    private String account;

    public BankClient(PersonPrivate person, String account) {
        this.person = person;
        this.account = account;
    }

    public BankClient(Company company, String account) {
        this.company = company;
        this.account = account;
    }

    @Override
    public String toString() {
        return "BankClient{" +
                "person=" + person +
                ", company=" + company +
                ", account='" + account + '\'' +
                '}';
    }
}
