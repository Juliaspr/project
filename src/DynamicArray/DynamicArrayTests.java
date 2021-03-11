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
}
