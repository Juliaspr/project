package DoublyLinkedList;

public class DoublyLinkedList<T> {
    private Element<T> start;
    private Element<T> end;
    private int size = 0;

    private final String ERROR_ElementNotFound = "Element not found";
    private final String ERROR_IndexOutOfRange = "Index is out of range";

    public int getSize() {
        return size;
    }

    public boolean contains(T data) {
        Element<T> temp = start;
        temp.setNext(start.getNext());

        while (temp.getNext() != null && !temp.getData().equals(data)) {
            temp = temp.getNext();
        }

        return temp.getData().equals(data);
    }

    public Element<T> getElement(int id) {
        Element<T> temp = start;
        temp.setNext(start.getNext());
        int counter = 0;

        while (temp.getNext() != null && counter != id) {
            temp = temp.getNext();
            counter++;
        }

        if (counter == id) {
            return temp;
        }

        throw new IllegalArgumentException(ERROR_IndexOutOfRange);
    }

    public void removeElement(int id) {
        Element<T> temp = start;
        temp.setNext(start.getNext());
        int counter = 0;

        while (temp.getNext() != null && counter != id) {
            // iterating over the list

            temp = temp.getNext();
            counter++;
        }

        if (counter == id) {
            // if element is found

            if (temp.getPrev() == null) {
                // if it's the first element

                start = temp.getNext();
                start.setPrev(null);
                return;
            }

            if (temp.getNext() == null) {
                // if it's the last element

                end = temp.getPrev();
                end.setNext(null);
                return;
            }

            Element<T> prevElement = temp.getPrev();
            Element<T> nextElement = temp.getNext();
            nextElement.setPrev(prevElement);
            prevElement.setNext(nextElement);
            size--;
            return;
        }

        throw new IllegalArgumentException(ERROR_IndexOutOfRange);
    }

    public Element<T> getElementByValue(T value) {
        Element<T> temp = start;
        temp.setNext(start.getNext());

        while (temp.getNext() != null && !temp.getData().equals(value)) {
            temp = temp.getNext();
        }

        if (temp.getData().equals(value)) {
            return temp;
        }

        throw new IllegalArgumentException(ERROR_ElementNotFound);
    }

    public void removeElementByValue(T value) {
        Element<T> temp = start;
        temp.setNext(start.getNext());

        while (temp.getNext() != null && !temp.getData().equals(value)) {
            // iterating over the list

            temp = temp.getNext();
        }

        if (temp.getData().equals(value)) {
            // if element is found

            if (temp.getPrev() == null) {
                // if it's the first element

                start = temp.getNext();
                start.setPrev(null);
                return;
            }

            if (temp.getNext() == null) {
                // if it's the last element

                end = temp.getPrev();
                end.setNext(null);
                return;
            }

            Element<T> prevElement = temp.getPrev();
            Element<T> nextElement = temp.getNext();
            nextElement.setPrev(prevElement);
            prevElement.setNext(nextElement);
            size--;
            return;
        }

        throw new IllegalArgumentException(ERROR_ElementNotFound);
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

    public void set(int id, T data) {
        Element<T> temp = start;
        temp.setNext(start.getNext());
        int counter = 0;

        while (temp.getNext() != null && counter != id) {
            temp = temp.getNext();
            counter++;
        }

        if (counter == id) {
            temp.setData(data);
            return;
        }

        throw new IllegalArgumentException(ERROR_IndexOutOfRange);
    }

    public void insertBefore(Element<T>  elementToFind, Element<T>  elementToInsert) {
        Element<T> newElement = new Element<T> (elementToInsert.getData());

        if (!contains(elementToFind.getData())) {
            throw new IllegalArgumentException(ERROR_ElementNotFound);
        }

        size++;

        if (elementToFind == start) {
            newElement.setPrev(null);
            newElement.setNext(start);
            start.setPrev(newElement);
            start = newElement;
            return;
        }

        newElement.setPrev(elementToFind.getPrev());
        newElement.setNext(elementToFind);
        elementToFind.getPrev().setNext(newElement);
        elementToFind.setPrev(newElement);
    }

    public void insertAfter(Element<T>  elementToFind, Element<T>  elementToInsert) {
        Element<T> newElement = new Element<T> (elementToInsert.getData());

        if (!contains(elementToFind.getData())) {
            throw new IllegalArgumentException(ERROR_ElementNotFound);
        }

        size++;

        newElement.setNext( elementToFind.getNext());
        elementToFind.setNext(newElement);
        newElement.setPrev(elementToFind);

        if (newElement.getNext() != null) {
            newElement.getNext().setPrev(newElement);
            return;
        }

        end = newElement;
    }

    public Boolean isEmpty() {
        if (size > 0) {
            return false;
        }
        return true;
    }

    public void printAll() {
        if (size == 0) {
            /* If list is empty */
//            System.out.println("The list is empty");
            System.out.print("");
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

    public String get_errorMessage(String error) {

        return switch (error) {
            case "ERROR_ElementNotFound" -> ERROR_ElementNotFound;
            case "ERROR_IndexOutOfRange" -> ERROR_IndexOutOfRange;
            default -> "not found";
        };

    }
}
