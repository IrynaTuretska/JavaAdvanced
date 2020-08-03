package hw20_bankAccount;

/**
 * JavaAdvanced 30.07.2020
 */
public class Company {
    private String typeOfOwnership;
    private String companyName;


    public Company(String typeOfOwnership, String companyName) {
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
