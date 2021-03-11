package Stack;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StackTests {

    @Test
    public void stack_init() {
        Stack<Integer> stack = new Stack<Integer> ();
    }

    @Test
    public void isEmpty_Empty() {
        Stack<Integer>  stack = new Stack<Integer> ();

        boolean expected = true;
        boolean actual = stack.isEmpty();
        assertEquals(expected, actual);
    }

    @Test
    public void isEmpty_notEmpty() {
        Stack<Integer>  stack = new Stack<Integer> ();

        stack.push(1);

        boolean expected = false;
        boolean actual = stack.isEmpty();
        assertEquals(expected, actual);
    }

    @Test
    public void size_StackEmpty() {
        Stack<Integer>  stack = new Stack<Integer> ();

        int expected = 0;
        int actual = stack.size();
        assertEquals(expected, actual);
    }

    @Test
    public void size_StackNotEmpty() {
        Stack<Integer>  stack = new Stack<Integer> ();

        stack.push(1);

        int expected = 1;
        int actual = stack.size();
        assertEquals(expected, actual);

        stack.push(1);
        stack.push(1);

        expected = 3;
        actual = stack.size();
        assertEquals(expected, actual);
    }

    @Test
    public void push_size_check() {
        Stack<Integer>  stack = new Stack<Integer> ();

        stack.push(1);

        int expected = 1;
        int actual = stack.size();
        assertEquals(expected, actual);

        stack.push(1);
        stack.push(1);

        expected = 3;
        actual = stack.size();
        assertEquals(expected, actual);
    }

    @Test
    public void push_data_check() {
        Stack<Integer>  stack = new Stack<Integer> ();

        stack.push(444);

        int expected = 444;
        int actual = stack.peek();
        assertEquals(expected, actual);

        stack.push(25);
        stack.push(35);

        expected = 35;
        actual = stack.peek();
        assertEquals(expected, actual);
    }

    @Test
    public void peek_data_check() {
        Stack<Integer>  stack = new Stack<Integer> ();

        stack.push(444);

        int expected = 444;
        int actual = stack.peek();
        assertEquals(expected, actual);

        stack.push(25);
        stack.push(35);

        expected = 35;
        actual = stack.peek();
        assertEquals(expected, actual);
    }
}
