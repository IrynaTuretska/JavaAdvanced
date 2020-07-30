package ls20200727_card;

import java.util.Arrays;

/**
 * JavaAdvanced 27.07.2020
 */
public class Main2707 {
    public static void main(String[] args) {
        String[] bankData = new String[]{"1234567891011123 Ivan",
                "1356563211186512 John", "1347186487219823 Bob"};

        Card[] cards = cardClient(bankData);
        System.out.println(Arrays.toString(cards));
        System.out.println("- - - - -");
        printCardArray(cards);
    }

    public static Card[] cardClient(String[] array) {
        Card[] cards = new Card[array.length]; //инициализация нового массива для заполнения номерами карт
        for (int i = 0; i < array.length; i++) {
            String[] res = array[i].split(" "); // разбивка на номер и имя по пробелу, использует регулярное выражение
            switch (getCardType(res[0])) {
                case 1:
                    cards[i] = new Master(new Person(res[1]), res[0]);
                    break;
                case 2:
                    cards[i] = new Visa(new Person(res[1]), res[0]);
                    break;
                default:
                    System.out.println("Mistake");
            }
        }
        return cards;
    }

    public static int getCardType(String number) {
        if (number.startsWith("12")) return 1; //master card
        if (number.startsWith("13")) return 2; //visa
        return 0;
    }

    public static void printCardArray(Card[] cards) {
        for (Card card : cards) {
            System.out.println(card.toSecureString());
        }
    }
}
