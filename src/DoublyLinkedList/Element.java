package DoublyLinkedList;

public class Element<T> {
    private T data;
    private Element<T> next;
    private Element<T> prev;

    public Element(T data) {
        this.data = data;
    }

    public Element<T> getNext() {
        return next;
    }

    public void setNext(Element nextElement) {
        next = nextElement;
    }

    public Element<T> getPrev() {
        return prev;
    }
    public void setPrev(Element prevElement) {
        prev = prevElement;
    }

    public T getData() {
        return data;
    }

}
