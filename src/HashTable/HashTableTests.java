package HashTable;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Random;

public class HashTableTests {

    @Test
    public void init_test() {
        HashTable table = new HashTable();
    }

    @Test
    public void insert() {
        HashTable table = new HashTable();

        table.input(5);
        table.input(10);

        int expected = 5;
        int actual = table.get(0).getElement(1).getData().data;
        assertEquals(expected, actual);
    }

    @Test
    public void insert_collision() {
        HashTable table = new HashTable();

        table.input(5);
        table.input(10);

        int expected = 5;
        int actual = table.get(0).getElement(1).getData().data;
        assertEquals(expected, actual);
    }

    @Test
    public void insert_stressTesting() {
        HashTable table = new HashTable();
        Random rand = new Random();
        for (int i = 0; i < 10000; i++) {
            table.input(rand.nextInt(255));
        }
    }

    @Test
    public void get_normal() {
        HashTable table = new HashTable();

        table.input(5);
        table.input(10);

        int expected = 5;
        int actual = table.get(0).getElement(1).getData().data;
        assertEquals(expected, actual);
    }

    @Test
    public void get_outBounds_ReturnNull() {
        HashTable table = new HashTable();

        Object expected = null;
        Object actual = table.get(30);
        assertEquals(expected, actual);


        actual = table.get(-1);
        assertEquals(expected, actual);
    }
}
