package hw20_bankAccount;

import ls20200710_compare.Person;

import java.util.Arrays;

/**
 * JavaAdvanced 30.07.2020
 */
public class Main_hw20 {
    public static void main(String[] args) {
        String[] clients = {
                ":Til Schweiger  Iban:DE1335971891",
                "AG:Microsoft  Iban:DE1492178765",
                "GmbH:Pupkin SoftLab  Iban:DE1552358796",
                "e.V.:PupkinSoftLab  Iban:DE1638267112"};

        BankClient[] bankClients = bankClients(clients);
        System.out.println(Arrays.toString(bankClients));

    }

    public static BankClient[] bankClients(String[] clients) {
        BankClient[] bankClients = new BankClient[clients.length];
        for (int i = 0; i < clients.length; i++) {
            String[] temp = clients[i].split("  ");
            switch (divideToPrivateAndLegal(temp[0])) {
                case 1:
                    bankClients[i] = new PersonPrivate(temp[0], temp[1], temp[2], temp[3]);
                    break;
                case 2:
                    bankClients[i] = new Company(temp[0], temp[1],temp[2], temp[3]);
                    break;
            }
        }
        return bankClients;
    }

    public static int divideToPrivateAndLegal(String str) {
        if (str.startsWith(":")) {
            return 1;
        } else return 2;
    }
}
