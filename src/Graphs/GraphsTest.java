package Graphs;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class GraphsTest {

    @Test
    public void init_test() {
        Graphs graph = new Graphs(1);
    }

    @Test
    public void add_adds_integers() {
        Graphs graph = new Graphs(10);
        graph.add(4, 2);
        graph.add(3, 1);
        graph.add(2, 3);
        graph.add(1, 1);
        graph.delete(2, 1);

        int expected = 2;
        int actual = graph.get(3).get(1);
        assertEquals(expected, actual);
    }
}
