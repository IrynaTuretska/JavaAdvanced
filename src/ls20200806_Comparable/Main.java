package ls20200806_Comparable;

import java.util.Arrays;

/**
 * JavaAdvanced 06.08.2020
 */
public class Main {
    public static void main(String[] args) {

        Book[] books = {new Book("Соммерсет Моэм", "Узорный покров", 2005),
                new Book("Соммерсет Моэм", "Узорный покров", 2018),
                new Book("Людмила Улицкая", "Красная линия", 2008),
                new Book("Людмила Улицкая", "Красная линия", 2012),
                new Book("Джон Ирвинг", "Правила виноделов", 1999)};


        Arrays.sort(books);
        System.out.println(Arrays.toString(books));
    }
}
