package ls20200728_names;

import java.util.Arrays;

/**
 * JavaAdvanced 28.07.2020
 */
public class Main2807 {
    public static void main(String[] args) {
        String[] names = {"Иванов Иван Иванович", "Николаев Николай", "Петрова"};
        System.out.println("Base list: " + Arrays.toString(names));

        PersonName[] personNames = getPersonFromArray(names);
        System.out.println("Result list: " + Arrays.toString(personNames));
        printPersons(personNames);

    }

    public static PersonName[] getPersonFromArray(String[] names) {
        PersonName[] personNames = null; //массив-результат
        if (names != null) {
            personNames = new PersonName[names.length];
            for (int i = 0; i < names.length; i++) {
                String[] nameStrings = names[i].split(" "); //промежут. массив, в котором отдельные составляющие имени
                switch (nameStrings.length) {
                    case 1://вызов соответствующего конструктора
                        personNames[i] = new PersonName(nameStrings[0]);
                        break;
                    case 2:
                        personNames[i] = new PersonName(nameStrings[0], nameStrings[1]);
                        break;
                    case 3:
                        personNames[i] = new PersonName(nameStrings[0], nameStrings[1], nameStrings[2]);
                        break;
                }
            }
        }
        return personNames;
    }

    public static void printPersons(PersonName[] personNames){
        for(PersonName p: personNames){
            System.out.println(p.toShortString());
        }
    }
}
