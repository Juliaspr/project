package DoublyLinkedList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DoublyLinkedListTests {

    @Test
    public void list_init_test() {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<Integer>();
    }

    @Test
    public void listInit_Size_Test() {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<Integer>();

        int expected = 0;
        int actual = list.getSize();
        assertEquals(expected, actual);
    }
}
