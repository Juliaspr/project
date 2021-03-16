package DoublyLinkedList;

public class DoublyLinkedList<T> {
    private Element<T> start;
    private Element<T> end;
    private int size = 0;

    public int getSize() {
        return size;
    }

    public void insert(T value) {
        Element<T> newElement = new Element<T>(value);

        if (start == null) {
            /* If list is empty */
            newElement.setNext(null);
            newElement.setPrev(null);
            start = newElement; end = newElement;
            size++;
            return;
        }

        newElement.setNext(start);
        newElement.setPrev(null);
        start.setPrev(newElement);
        start = newElement;
        size++;
    }

    public void append(T value) {
        Element<T> newElement = new Element<T>(value);

        if (end == null) {
            /* If list is empty */
            newElement.setNext(null);
            newElement.setPrev(null);
            start = newElement;
            end = newElement;
            size++;
            return;
        }

        end.setNext(newElement);
        newElement.setNext(null);
        newElement.setPrev(end);
        end = newElement;
        size++;
    }

    public void printAll() {
        if (size == 0) {
            /* If list is empty */
            System.out.println("The list is empty");
            return;
        }

        Element<T> temp = start;
        temp.setNext(start.getNext());

        while (temp.getNext() != null) {
            System.out.print(temp.getData() + " ");
            temp = temp.getNext();
        }
        System.out.println(temp.getData());
    }
}
