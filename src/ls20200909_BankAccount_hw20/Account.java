package ls20200909_BankAccount_hw20;

public class Account {
    private Owner owner;
    private String iban;

    public Account(Owner owner, String iban) {
        this.owner = owner;
        this.iban = iban;
    }

    @Override
    public String toString() {
        return "\n" + owner + " " + iban;
    }
}
