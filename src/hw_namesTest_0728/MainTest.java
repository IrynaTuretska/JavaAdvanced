package hw_namesTest_0728;

/**
 * JavaAdvanced 29.07.2020
 */
public class MainTest {
    public static void main(String[] args) {
        String[] names = new String[]{"Stefan Thomas Reich", "Alex Mueller", "Smith", "James John Brown", "N Noname"};

        PersonTest[] personsTest = getPersonsArray(names);
        toPrint(personsTest);
    }

    public static PersonTest[] getPersonsArray(String[] array) {
        PersonTest[] persons = null;
        if (array != null) {
            persons = new PersonTest[array.length];
            for (int i = 0; i < array.length; i++) {
                String[] onlyNames = array[i].split(" ");
                switch (onlyNames.length) {
                    case 1:
                        persons[i] = new PersonTest(onlyNames[0]);
                        break;
                    case 2:
                        persons[i] = new PersonTest(onlyNames[0], onlyNames[1]);
                        break;
                    case 3:
                        persons[i] = new PersonTest(onlyNames[0], onlyNames[1], onlyNames[2]);
                        break;
                }
            }
        }
        return persons;
    }

    public static void toPrint(PersonTest[] personsTest) {
        for (PersonTest element : personsTest) {
            System.out.println(element.toShortPrint());
        }
    }
}
