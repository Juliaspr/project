package DynamicArray;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
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
        array.set(0, 1);

        Object expected = 1;
        Object actual = array.get(0);
        assertEquals(expected, actual);
    }

    @Test
    public void set_size_check() {
        DynamicArray<Integer> array = new DynamicArray<Integer>(1);

        array.set(0, 1);

        int expected = 1;
        int actual = array.getSize();
        assertEquals(expected, actual);
    }

    @Test
    public void set_data_check() {
        DynamicArray<Integer> array = new DynamicArray<Integer>(1);
        array.set(0, 1);

        Object expected = 1;
        Object actual = array.get(0);
        assertEquals(expected, actual);
    }

    @Test
    public void set_indexEqualsSize() {
        DynamicArray<Integer> array = new DynamicArray<Integer>(1);

        array.set(0, 1);
        array.set(1, 22);

        Object expected = 22;
        Object actual = array.get(1);
        assertEquals(expected, actual);
    }

    @Test
    public void set_indexGreaterSize() {
        DynamicArray<Integer> array = new DynamicArray<Integer>(1);

        array.set(0, 1);
        array.set(2, 22);

        Object expected = 22;
        Object actual = array.get(2);
        assertEquals(expected, actual);
    }

}
