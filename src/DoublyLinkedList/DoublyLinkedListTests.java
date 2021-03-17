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
    public void getElement_indexOutOfRange_ThrowsException() {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<Integer>();
        list.append(1);

        String error_message = list.get_errorMessage("ERROR_IndexOutOfRange");

        assertThrows(RuntimeException.class, () -> list.getElement(2), error_message);
    }
}
