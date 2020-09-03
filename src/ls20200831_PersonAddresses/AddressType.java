package ls20200831_PersonAddresses;

//константы пишутся заглавными буквами, не относятся к полям
public enum AddressType {
    EMAIL(1, "email address") {
        public void send() {
            System.out.println("this is a mail address - send by internet");
        }
    },
    POST(2, "post address") {
        public void send() {
            System.out.println("this is post address - send by DHL");
        }
    },
    BILLING(3, "billing address") {
        public void send() {
            System.out.println("this is a billing address - for invoices");
        }
    };

    private String strValue;
    private int intValue;

    AddressType(int intValue, String strValue) {
        this.intValue = intValue;
        this.strValue = strValue;
    }

    public abstract void send();

    @Override
    public String toString() {
        return "AddressType{" +
                "strValue='" + strValue + '\'' +
                ", intValue=" + intValue +
                '}';
    }

    public String test() {
        if (this.name() == "EMAIL") {
            return "send email";
        } else {
            return "go to post office";
        }
    }
}
