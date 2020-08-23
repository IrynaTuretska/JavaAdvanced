package ls20200820_LinkedList;

public class PersonLinkedList {
    private Node start = null;
    private Node finish = null;
    private int size = 0; //показывает текущий размер листа

    public void add(Person person) {
        Node node = new Node(person);
        if (start == null) { //если в списке ничего нет
            start = node; //тогда старт смотрит на первую ноду Person
        } else { //добавление в конец
            node.setPrev(finish); //связь между последним и пред. элементами, поле prev указывает на то что было finish
            finish.setNext(node);
        }
        finish = node; //изменение ноды финиш
        size++; //увеличение размера
    }

    public void remove() { //remove the last element
        if (finish != null) { //if finish = null there is nothing to remove
            if (finish == start) { //проверка, последний ли элемент в списке мы удаляем, по адресу!
                finish = null; //первоначальное состояние списка
                start = null;
                size = 0;
            } else {
                finish.getPrev().setNext(null); //предпоследний элемент имеет next = null, обрыв списка
                finish.setPerson(null);
                finish = finish.getPrev(); //новый финиш
                size--;
            }
        }
    }

    public void removeByIndex(int index) {
        if (index > 0 && index < size) {
            if (index == size - 1) { //при удалении последнего элемента вызываем метод remove
                remove();
                return;
            }
            if (index == 0) {//удаление первого элемента
                start.getNext().setPrev(null); //берем второй элемент в списке и обнуляем ссылку prev
                start = start.getNext();
                size--;
                return;
            }
            Node node = getNodeByIndex(index);
            if (node != null) {
                node.getPrev().setNext(node.getNext());
                node.getNext().setPrev(node.getPrev());
                node.setPrev(null);
                node.setNext(null);
                node.setPerson(null);
            }
        }
    }

    private Node getNodeByIndex(int index) {
        int i = 0;
        Node currentNode = start;
        while (currentNode != null) {
            if (i == index) {
                return currentNode;
            }
            i++;
            currentNode = currentNode.getNext(); //присвоили значение текущей ноды последующей
        }
        return null;
    }

    public String toString() {
        Node currentNode = start;
        String resString = "";
        while (currentNode != null) {
            resString += currentNode.getPerson().toString() + '\n'; //берем персона, превращаем в строку и добавляем к результирующей строке
            currentNode = currentNode.getNext(); //присвоили значение текущей ноды последующей
        }
        return resString;
    }

    public int find(Person person) {
        Node currentNode = start;
        int res = -1; //если ничего не нашел, возвращает -1
        int index = 0;
        while (currentNode != null) {
            if (currentNode.getPerson().equals(person)) {
                res = index;
                break;
            } else {
                currentNode = currentNode.getNext(); //проходим по списку
                index++;
            }
        }
        return res;
    }

    public Node getStart() {
        return start;
    }

    public Node getFinish() {
        return finish;
    }

    public int getSize() {
        return size;
    }
}
