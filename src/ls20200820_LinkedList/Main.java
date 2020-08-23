package ls20200820_LinkedList;

public class Main {
    public static void main(String[] args) {
        PersonLinkedList list = new PersonLinkedList();
        list.add(new Person("Person 1"));
        list.add(new Person("Person 2"));
        list.add(new Person("Person 3"));
        list.add(new Person("Person 4"));

        System.out.println("full list: " + list); // вызывает по умолчанию toString переданного объекта

        list.remove();
        System.out.println("last element removed: " + list);
        Person p = new Person("Person 2"); //элемент для поиска
        System.out.println(list.find(p));
        System.out.println("- - - - - -");
        list.removeByIndex(1);
        System.out.println(list);
    }
}
