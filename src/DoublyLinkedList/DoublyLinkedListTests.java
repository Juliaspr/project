package DoublyLinkedList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DoublyLinkedListTests {

    @Test
    public void list_init_test() {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<Integer>();
    }

    @Test
    public void listInit_Size_validation() {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<Integer>();

        int expected = 0;
        int actual = list.getSize();
        assertEquals(expected, actual);
    }

    @Test
    public void insert_Size_validation() {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<Integer>();

        list.insert(1);

        int expected = 1;
        int actual = list.getSize();
        assertEquals(expected, actual);
    }

    @Test
    public void insert_data_validation() {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<Integer>();

        list.insert(4);
        list.insert(3);
        list.insert(2);
        list.insert(1);
        list.insert(0);


        int expected = 3;
        int actual = list.getElement(3).getData();
        assertEquals(expected, actual);
    }

    @Test
    public void append_Size_validation() {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<Integer>();

        list.insert(1);

        int expected = 1;
        int actual = list.getSize();
        assertEquals(expected, actual);
    }

    @Test
    public void append_data_validation() {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<Integer>();

        list.append(4);
        list.append(3);
        list.append(2);
        list.append(1);
        list.append(0);


        int expected = 3;
        int actual = list.getElement(1).getData();
        assertEquals(expected, actual);
    }

    @Test
    public void getElement_dataValidation() {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<Integer>();

        list.append(4);


        int expected = 4;
        int actual = list.getElement(0).getData();
        assertEquals(expected, actual);
    }

    @Test
    public void getElement_wrongIndex_ThrowsException() {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<Integer>();
        list.append(1);

        String error_message = list.get_errorMessage("ERROR_IndexOutOfRange");

        assertThrows(RuntimeException.class, () -> list.getElement(2), error_message);
        assertThrows(RuntimeException.class, () -> list.getElement(-2), error_message);
    }

    @Test
    public void removeElement_sizeValidation() {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<Integer>();

        list.append(4);
        list.append(3);
        list.append(2);
        list.append(1);
        list.append(0);

        list.removeElement(1);


        int expected = 4;
        int actual = list.getSize();
        assertEquals(expected, actual);
    }

    @Test
    public void removeElement_dataValidation() {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<Integer>();

        list.append(4);
        list.append(3);
        list.append(2);
        list.append(1);
        list.append(0);

        list.removeElement(1);


        int expected = 2;
        int actual = list.getElement(1).getData();
        assertEquals(expected, actual);

        list.removeElement(0);
        expected = 2;
        actual = list.getElement(0).getData();
        assertEquals(expected, actual);

        list.removeElement(2);
        expected = 1;
        actual = list.getElement(1).getData();
        assertEquals(expected, actual);
    }

    @Test
    public void removeElement_wrongIndex_ThrowsException() {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<Integer>();
        list.append(1);

        String error_message = list.get_errorMessage("ERROR_IndexOutOfRange");

        assertThrows(RuntimeException.class, () -> list.removeElement(2), error_message);
        assertThrows(RuntimeException.class, () -> list.removeElement(-2), error_message);
    }

    @Test
    public void set_DataValidation() {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<Integer>();

        list.append(4);
        list.append(3);
        list.append(2);
        list.append(1);
        list.append(0);

        list.set(0, 0);


        int expected = 0;
        int actual = list.getElement(0).getData();
        assertEquals(expected, actual);

        list.set(4, 4);
        expected = 4;
        actual = list.getElement(4).getData();
        assertEquals(expected, actual);

        list.set(2, 2);
        expected = 2;
        actual = list.getElement(2).getData();
        assertEquals(expected, actual);
    }

    @Test
    public void set_wrongIndex_ThrowsException() {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<Integer>();
        list.append(1);

        String error_message = list.get_errorMessage("ERROR_IndexOutOfRange");

        assertThrows(RuntimeException.class, () -> list.set(2, 1), error_message);
        assertThrows(RuntimeException.class, () -> list.set(-2, 2), error_message);
    }

    @Test
    public void getElementByValue_DataValidation() {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<Integer>();

        list.append(4);
        list.append(3);
        list.append(2);
        list.append(1);
        list.append(0);


        int expected = 1;
        int actual = list.getElementByValue(1).getData();
        assertEquals(expected, actual);
    }

    @Test
    public void getElementByValue_ValueDoesntExist_ThrowsException() {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<Integer>();
        list.append(1);

        String error_message = list.get_errorMessage("ERROR_ElementNotFound");

        assertThrows(RuntimeException.class, () -> list.getElementByValue(2), error_message);
    }

    @Test
    public void removeElementByValue_sizeValidation() {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<Integer>();

        list.append(4);
        list.append(3);
        list.append(2);
        list.append(1);
        list.append(0);

        list.removeElementByValue(1);


        int expected = 4;
        int actual = list.getSize();
        assertEquals(expected, actual);
    }

    @Test
    public void removeElementByValue_dataValidation() {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<Integer>();

        list.append(4);
        list.append(3);
        list.append(2);
        list.append(1);
        list.append(0);

        list.removeElementByValue(1);


        int expected = 0;
        int actual = list.getElement(3).getData();
        assertEquals(expected, actual);
    }

    @Test
    public void removeElementByValue_ValueDoesntExist_ThrowsException() {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<Integer>();
        list.append(1);

        String error_message = list.get_errorMessage("ERROR_ElementNotFound");

        assertThrows(RuntimeException.class, () -> list.removeElementByValue(2), error_message);
    }

    @Test
    public void insertBefore_sizeValidation() {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<Integer>();

        list.append(4);
        list.append(3);
        list.append(2);
        list.append(1);
        list.append(0);

        Element<Integer> newElement = new Element<Integer>(10);
        list.insertBefore(list.getElementByValue(2), newElement);

        int expected = 6;
        int actual = list.getSize();
        assertEquals(expected, actual);
    }

    @Test
    public void insertBefore_valueValidation() {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<Integer>();

        list.append(4);
        list.append(3);
        list.append(2);
        list.append(1);
        list.append(0);

        Element<Integer> newElement = new Element<Integer>(10);
        list.insertBefore(list.getElementByValue(2), newElement);

        int expected = 10;
        int actual = list.getElement(2).getData();
        assertEquals(expected, actual);
    }

    @Test
    public void insertBefore_ElementDoesntExist_ThrowsException() {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<Integer>();
        list.append(1);

        String error_message = list.get_errorMessage("ERROR_ElementNotFound");

        Element<Integer> element = new Element<Integer>(10);
        Element<Integer> newElement = new Element<Integer>(11);
        assertThrows(RuntimeException.class, () -> list.insertBefore(element, newElement), error_message);
    }

    @Test
    public void insertAfter_sizeValidation() {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<Integer>();

        list.append(4);
        list.append(3);
        list.append(2);
        list.append(1);
        list.append(0);

        Element<Integer> newElement = new Element<Integer>(10);
        list.insertAfter(list.getElementByValue(2), newElement);

        int expected = 6;
        int actual = list.getSize();
        assertEquals(expected, actual);
    }

    @Test
    public void insertAfter_valueValidation() {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<Integer>();

        list.append(4);
        list.append(3);
        list.append(2);
        list.append(1);
        list.append(0);

        Element<Integer> newElement = new Element<Integer>(10);
        list.insertAfter(list.getElement(2), newElement);

        int expected = 10;
        int actual = list.getElement(3).getData();
        assertEquals(expected, actual);
    }

    @Test
    public void insertAfter_ElementDoesntExist_ThrowsException() {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<Integer>();
        list.append(1);

        String error_message = list.get_errorMessage("ERROR_ElementNotFound");

        Element<Integer> element = new Element<Integer>(10);
        Element<Integer> newElement = new Element<Integer>(11);
        assertThrows(RuntimeException.class, () -> list.insertAfter(element, newElement), error_message);
    }
}
