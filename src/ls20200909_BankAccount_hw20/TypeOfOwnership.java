package ls20200909_BankAccount_hw20;

public enum TypeOfOwnership {
    GMBH {
        @Override
        public String getTypeString() {
            return "GmbH";
        }
    },
    AG {
        @Override
        public String getTypeString() {
            return "AG";
        }
    },
    EV {
        @Override
        public String getTypeString() {
            return "e.V.";
        }
    };
    //для реализации метода в Enum, чтобы в зависимости от типа подхватывалось название
    public abstract String getTypeString();

    //возвращает наименование Enum
    public static TypeOfOwnership getTypeStringTwo(String s) {
        if (s.equals("GmbH")) {
            return TypeOfOwnership.GMBH;
        } else if (s.equals("AG")) {
            return TypeOfOwnership.AG;
        } else if (s.equals("e.V.") || s.equals("eV")) {
            return TypeOfOwnership.EV;
        } else return null;
    }

    @Override
    public String toString() {
        return getTypeString();
    }
}
