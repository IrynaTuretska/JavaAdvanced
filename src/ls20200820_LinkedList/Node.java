package ls20200820_LinkedList;

public class Node {
    private Node next; //адрес предыдущего элемента
    private Node prev; //адрес последующего элемента
    private Person person;

    public Node(Person person) {
        this.person = person;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
