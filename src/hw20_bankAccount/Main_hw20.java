package hw20_bankAccount;

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


    }

    public static BankClient[] getBankClientArray(String[] names) {
        BankClient[] bankClients = null;
        if(names !=null){
            bankClients = new BankClient[names.length];
            for (int i = 0; i < names.length; i++) {
                String[] strNames = names[i].split(":");


            }
        }
        return bankClients;
    }


}
