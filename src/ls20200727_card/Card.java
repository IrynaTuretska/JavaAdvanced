package ls20200727_card;

/**
 * JavaAdvanced 27.07.2020
 */
public abstract class Card {
    private Person person;
    private String cardNum;

    public Card(Person client, String cardNum) {
        this.person = client;
        this.cardNum = cardNum;
    }

    public String getCardNum() {
        return cardNum;
    }

    public Person getPerson() {
        return person;
    }

    @Override
    public String toString() {
        return "Card client " + person + ", cardNum = " + cardNum;
    }

    public abstract String toSecureString();
}
