package DoublyLinkedList;

public class Element<T> {
    T data;
    Element<T> next;
    Element<T> prev;

    public Element(T data) {
        this.data = data;
    }

    public Element<T> getNext() {
        return next;
    }

    public Element<T> getPrev() {
        return prev;
    }

    public T getData() {
        return data;
    }

}
