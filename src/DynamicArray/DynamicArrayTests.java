package DynamicArray;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class DynamicArrayTests {

    @Test
    public void init_size() {
        DynamicArray<Integer> array = new DynamicArray<Integer>();

        int expected = 0;
        int actual = array.getSize();
        assertEquals(expected, actual);
    }

    @Test
    public void get_data_check() {
        DynamicArray<Integer> array = new DynamicArray<Integer>(1);
        array.insert(0, 1);

        Object expected = 1;
        Object actual = array.get(0);
        assertEquals(expected, actual);
    }

    @Test
    void get_IndexOutOfBounds() {
        DynamicArray<Integer> array = new DynamicArray<Integer>(1);

        String error_message = array.get_errorMessage("error_outOfBounds");

        assertThrows(RuntimeException.class, () -> array.get(-1), error_message);
        assertThrows(RuntimeException.class, () -> array.get(22), error_message);
    }

    @Test
    public void insert_size_check() {
        DynamicArray<Integer> array = new DynamicArray<Integer>(1);

        array.insert(0, 1);

        int expected = 1;
        int actual = array.getSize();
        assertEquals(expected, actual);
    }

    @Test
    public void insert_data_check() {
        DynamicArray<Integer> array = new DynamicArray<Integer>(1);
        array.insert(0, 1);

        Object expected = 1;
        Object actual = array.get(0);
        assertEquals(expected, actual);
    }

    @Test
    public void insert_indexEqualsSize() {
        DynamicArray<Integer> array = new DynamicArray<Integer>(1);

        array.insert(0, 1);
        array.insert(1, 22);

        Object expected = 22;
        Object actual = array.get(1);
        assertEquals(expected, actual);
    }

    @Test
    public void insert_indexGreaterSize() {
        DynamicArray<Integer> array = new DynamicArray<Integer>(1);

        array.insert(0, 1);
        array.insert(2, 22);

        Object expected = 22;
        Object actual = array.get(2);
        assertEquals(expected, actual);
    }

    @Test
    public void resize_size_check() {
        DynamicArray<Integer> array = new DynamicArray<Integer>(10);

        array.resize(1);

        int expected = 1;
        int actual = array.getSize();
        assertEquals(expected, actual);
    }

    @Test
    public void resize_data_check() {
        DynamicArray<Integer> array = new DynamicArray<Integer>(1);

        array.insert(0, 1);
        array.insert(2, 22);
        array.resize(1);

        Object expected = 1;
        Object actual = array.get(0);
        assertEquals(expected, actual);

        array.resize(9);
        array.insert(8, 22);

        expected = 22;
        actual = array.get(8);
        assertEquals(expected, actual);
    }

    @Test
    void resize_sizeNegative() {
        DynamicArray<Integer> array = new DynamicArray<Integer>(1);

        String error_message = array.get_errorMessage("error_wrongSize");

        assertThrows(RuntimeException.class, () -> array.resize(-1), error_message);
    }

    @Test
    public void getSize_check() {
        DynamicArray<Integer> array = new DynamicArray<Integer>(1);

        int expected = 1;
        int actual = array.getSize();
        assertEquals(expected, actual);

        array.resize(20);
        expected = 20;
        actual = array.getSize();
        assertEquals(expected, actual);
    }

    @Test
    public void findFirst_index_check() {
        DynamicArray<Integer> array = new DynamicArray<Integer>(1);

        array.insert(0, 111);
        array.insert(1, 234);
        array.insert(2, 234);
        array.insert(3, 234);
        array.insert(4, 444);
        array.insert(5, 114231);

        int expected = 1;
        int actual = array.findFirst(234);
        assertEquals(expected, actual);
    }

    @Test
    public void findFirst_NotExistingElement() {
        DynamicArray<Integer> array = new DynamicArray<Integer>(1);

        array.insert(0, 111);
        array.insert(1, 234);
        array.insert(2, 234);
        array.insert(3, 234);
        array.insert(4, 444);
        array.insert(5, 114231);

        int expected = -1;
        int actual = array.findFirst(5);
        assertEquals(expected, actual);
    }

    @Test
    public void findLast_index_check() {
        DynamicArray<Integer> array = new DynamicArray<Integer>(1);

        array.insert(0, 111);
        array.insert(1, 234);
        array.insert(2, 234);
        array.insert(3, 234);
        array.insert(4, 444);
        array.insert(5, 114231);

        int expected = 3;
        int actual = array.findLast(234);
        assertEquals(expected, actual);
    }

    @Test
    public void findLast_NotExistingElement() {
        DynamicArray<Integer> array = new DynamicArray<Integer>(1);

        array.insert(0, 111);
        array.insert(1, 234);
        array.insert(2, 444);
        array.insert(3, 114231);

        int expected = -1;
        int actual = array.findLast(5);
        assertEquals(expected, actual);
    }

    @Test
    public void add_size_check() {
        DynamicArray<Integer> array = new DynamicArray<Integer>(0);

        array.add(6);

        int expected = 1;
        int actual = array.getSize();
        assertEquals(expected, actual);

        array.add(1);
        array.add(1);
        array.add(1);
        expected = 4;
        actual = array.getSize();
        assertEquals(expected, actual);
    }

    @Test
    public void add_data_check() {
        DynamicArray<Integer> array = new DynamicArray<Integer>(0);

        array.add(6);

        int expected = 6;
        int actual = array.get(0);
        assertEquals(expected, actual);

        array.add(1);
        array.add(1);
        array.add(1);
        expected = 1;
        actual = array.get(3);
        assertEquals(expected, actual);
    }
}
