package HashTable;

import org.junit.jupiter.api.Test;

public class HashTableTests {

    @Test
    public void init_test() {
        HashTable table = new HashTable();
    }

    @Test
    public void insert_doNothing() {
        HashTable table = new HashTable();

        table.input(5);
        table.input(10);

        int expected = 10;
        Object actual = table.get(0).getElement(1).getData();
    }
}
