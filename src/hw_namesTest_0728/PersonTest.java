package hw_namesTest_0728;

/**
 * JavaAdvanced 29.07.2020
 */
public class PersonTest {
    private String name;
    private String secondName;
    private String familyName;

    public PersonTest(String name, String secondName, String familyName) {
        this.name = name;
        this.secondName = secondName;
        this.familyName = familyName;
    }

    public PersonTest(String name, String familyName) {
        this(name, "", familyName);
    }

    public PersonTest(String familyName) {
        this("", "", familyName);
    }

    @Override
    public String toString() {
        return name + secondName + familyName;
    }

    public String toShortPrint() {
        if (name != "") {
            name = name.charAt(0) + ".";
        }
        if (secondName != "") {
            secondName = secondName.substring(0, 1).concat(".");
        }
        return name + secondName + familyName;
    }
}
