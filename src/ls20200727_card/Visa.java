package ls20200727_card;

/**
 * JavaAdvanced 27.07.2020
 */
public class Visa extends Card {
    public Visa(Person client, String cardNum) {
        super(client, cardNum);
    }

    @Override
    public String toString() {
        return "VISA client name " + getPerson() + ", cardNum = " + getCardNum();
    }

    @Override
    public String toSecureString() {
        return "VISA client name " + getPerson() + ", cardNum = " + getSecureNumber();
    }

    private String getSecureNumber() {
        String star = "";
        for (int i = 0; i < getCardNum().length() - 6; i++) {
            star += "*";
        }
        return getCardNum().substring(0, 4) + star + getCardNum().substring(getCardNum().length() - 2);
    }
}
