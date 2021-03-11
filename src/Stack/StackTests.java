package Stack;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StackTests {

    @Test
    public void stack_init() {
        Stack stack = new Stack();
    }

    @Test
    public void stack_isEmpty() {
        Stack stack = new Stack();

        boolean expected = true;
        boolean actual = stack.isEmpty();
        assertEquals(expected, actual);
    }

    @Test
    public void size_Empty() {
        Stack stack = new Stack();

        int expected = 0;
        int actual = stack.size();
        assertEquals(expected, actual);
    }
}
