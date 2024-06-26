package OffsetHashTable;
import org.junit.jupiter.api.Test;
import java.util.Random;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class OffsetHashTableTests {
    @Test
    public void init_test() {
        OffsetHashTable table = new OffsetHashTable();
    }

    @Test
    public void insert() {
        OffsetHashTable table = new OffsetHashTable();
        table.input("a");
        table.input("b");
        table.input("c");

        String expected = "c";
        String actual = table.get_object("c").data;
        assertEquals(expected, actual);
    }

    @Test
    public void insert_stressTesting() {
        OffsetHashTable table = new OffsetHashTable();
        Random rand = new Random();
        for (int i = 0; i < 10000; i++) {
            table.input(Integer.toString(rand.nextInt(255)));
        }
    }

    @Test
    public void get_normal() {
        OffsetHashTable table = new OffsetHashTable();
        table.input("a");
        table.input("b");
        table.input("c");

        String expected = "c";
        String actual = table.get_object("c").data;
        assertEquals(expected, actual);
    }

    @Test
    public void remove_normal() {
        OffsetHashTable table = new OffsetHashTable();
        table.input("a");
        table.input("b");
        table.input("c");

        table.remove("b");

        Object expected = null;
        Object actual = table.get_object("b");
        assertEquals(expected, actual);
    }
}
