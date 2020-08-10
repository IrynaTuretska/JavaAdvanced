package ls20200805_Comparator;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        String[] names = {"Jack", "Nick", "John", "Anna"};
        //System.out.println("Jack".compareTo("John"));
        //System.out.println(names[0].compareTo(names[1]));

        Arrays.sort(names);
        //System.out.println(Arrays.toString(names));

        Person[] people = {new Person("JackAndJohns", 25),
                new Person("Anna", 28),
                new Person("Anna123", 35),
                new Person("Nick1", 30),
                new Person("Nick88", 26),
                new Person("John3333", 18),
        };

        //System.out.println(people[0].compareTo(people[1]));
        //Arrays.sort(people);

        //Comparator

        Comparator<Person> typeOfSorting; //переменная типа Comparator
        int key = 3;
        switch (key) {
            case 1: //sort by age
                System.out.println("sort by age: ");
                typeOfSorting = new PersonComparatorByAge();
                Arrays.sort(people, typeOfSorting);
                break;
            case 2:
                System.out.println("sort by name: ");
                typeOfSorting = new PersonComparatorByName();
                Arrays.sort(people, typeOfSorting);
                break;
            case 3:
                System.out.println("sort by name length: ");
                typeOfSorting = new PersonComparatorByNameLength();
                Arrays.sort(people,typeOfSorting);
                break;
/*
            //lambda: краткая запись класса Comparator
            case 4:
                Arrays.sort(people, (o1, o2) -> o1.getAge() - o2.getAge());
                break;
                */

            default:
                System.out.println("sort by default: ");
                Arrays.sort(people);
        }

        System.out.println(Arrays.toString(people));

//        System.out.println("sort by age: ");
//        Arrays.sort(people, new PersonComparatorByAge());
//        System.out.println(Arrays.toString(people));
//
//        System.out.println("sort by name: ");
//        Arrays.sort(people, new PersonComparatorByName());
//        System.out.println(Arrays.toString(people));

    }
}
