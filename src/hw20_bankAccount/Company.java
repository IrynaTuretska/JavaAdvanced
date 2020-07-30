package hw20_bankAccount;

/**
 * JavaAdvanced 30.07.2020
 */
public class Company extends BankClient {
    private String typeOfOwnership;
    private String companyName;


    public Company(String client, String accountNumber, String typeOfOwnership, String companyName) {
        super(client, accountNumber);
        this.typeOfOwnership = typeOfOwnership;
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return "Company{" +
                "typeOfOwnership='" + typeOfOwnership + '\'' +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}
