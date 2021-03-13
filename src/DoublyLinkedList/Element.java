package DoublyLinkedList;

public class Element<T> {
    T data;
    Element<T> next;
    Element<T> prev;

    public Element(T data) {
        this.data = data;
    }

}
