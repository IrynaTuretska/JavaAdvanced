package ls20200727_card;

/**
 * JavaAdvanced 27.07.2020
 */
public class Master extends Card {
    public Master(Person client, String cardNum) {
        super(client, cardNum);
    }

    @Override
    public String toString() {
        return "Master client name " + getPerson() + ", cardNum = " + getCardNum();
    }

    @Override
    public String toSecureString() {
        return "MASTER client name " + getPerson() + ", cardNum = " + getSecureNumber();
    }

    private String getSecureNumber() {
        String star = "";
        for (int i = 0; i < getCardNum().length() - 4; i++) {
            star += "*";
        }
        return getCardNum().substring(0, 2) + star + getCardNum().substring(getCardNum().length() - 2);
    }
}
