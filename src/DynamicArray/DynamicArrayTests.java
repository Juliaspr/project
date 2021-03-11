package DynamicArray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DynamicArrayTests {

    @Test
    public void init_size() {
        DynamicArray array = new DynamicArray();

        int expected = 0;
        int actual = array.getSize();
        assertEquals(expected, actual);
    }

    @Test
    public void set_size_check() {
        DynamicArray array = new DynamicArray(1);

        array.set(0, 1);

        int expected = 1;
        int actual = array.getSize();
        assertEquals(expected, actual);
    }


}
