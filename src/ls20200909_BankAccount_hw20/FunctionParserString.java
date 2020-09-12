package ls20200909_BankAccount_hw20;

import java.util.function.Function;

public class FunctionParserString implements Function<String, Account> {

    @Override
    public Account apply(String s) {
        if (checkString(s)) {
            String[] ownerAndIban = s.split(" Iban:");
            String[] typeAndName = ownerAndIban[0].split(":");
            Owner owner = null;
            if (typeAndName[0].isEmpty()) {
                //createPerson
                String[] names = typeAndName[1].split(" ");
                owner = new Person(names[0], names[1]);
            } else {
                //createCompany
                owner = new Company(typeAndName[1], TypeOfOwnership.getTypeStringTwo(typeAndName[0]));
            }
            return new Account(owner, ownerAndIban[1]);
        }
        return null;
    }

    private boolean checkString(String s) { //проверка корректности строки, можно прописать условие
        //варианты проверки:
        //not null, not empty
        //contains IBAN
        //there are other symbols after the IBAN
        //contains two ":"
        return true;
    }
}
