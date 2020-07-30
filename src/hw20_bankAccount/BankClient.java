package hw20_bankAccount;

/**
 * JavaAdvanced 30.07.2020
 */
public abstract class BankClient {
    private String client;
    private String accountNumber;

    public BankClient(String client, String accountNumber) {
        this.client = client;
        this.accountNumber = accountNumber;
    }

    @Override
    public String toString() {
        return "BankClient{" +
                "client='" + client + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                '}';
    }
}
