package ls20200909_BankAccount_hw20;

// Дан массив строк - клиентов банка следующего вида:
//        :Til Schweiger  Iban:DE15971891
//        AG:Microsoft  Iban:DE15978765
//        GmbH:Pupkin SoftLab  Iban:DE15954356
//        e.V.:PupkinSoftLab  Iban:DE15954356
// т.е. форма собственности: Название   Iban:счет. Если форма собственности не указана, клиент физ лицо
// Необходимо создать класс для описания физ. лиц, с полями для имени и фамилии, и класс (или классы?) для описания юр лиц.
// Для каждой строки исходного массива необходимо получить соответствующий Account с полями owner, iban).
// Распечатать массив Account.

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String[] strings = new String[]{
                ":Til Schweiger  Iban:DE15971891",
                "AG:Microsoft  Iban:DE15978765",
                "GmbH:Pupkin SoftLab  Iban:DE15954356",
                "e.V.:PupkinSoftLab  Iban:DE15954356"
        };
        Account[] account1 = Parser.parseStringToAccounts(strings, new FunctionParserString());
        System.out.println(Arrays.toString(account1));

        System.out.println("- - - - -");
        Account[] account2 = Parser.parseStringToList(strings, new FunctionParserString());
        System.out.println(Arrays.toString(account2));
    }
}
