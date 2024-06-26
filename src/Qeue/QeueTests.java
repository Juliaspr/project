package Qeue;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class QeueTests {

    @Test
    public void qeue_init() {
        Qeue<Integer> qeue = new Qeue<Integer>();
    }

    @Test
    public void getSize() {
        Qeue<Integer> qeue = new Qeue<Integer>();

        qeue.enqeue(1);

        int expected = 1;
        int actual = qeue.getSize();
        assertEquals(expected, actual);

        qeue.enqeue(1);
        qeue.enqeue(1);
        qeue.enqeue(1);

        expected = 4;
        actual = qeue.getSize();
        assertEquals(expected, actual);
    }

    @Test
    public void enqeue_size_Validation() {
        Qeue<Integer> qeue = new Qeue<Integer>();

        qeue.enqeue(1);

        int expected = 1;
        int actual = qeue.getSize();
        assertEquals(expected, actual);

        qeue.enqeue(1);
        qeue.enqeue(1);
        qeue.enqeue(1);

        expected = 4;
        actual = qeue.getSize();
        assertEquals(expected, actual);
    }

    @Test
    public void enqeue_data_Validation() {
        Qeue<Integer> qeue = new Qeue<Integer>();

        qeue.enqeue(1);

        int expected = 1;
        int actual = qeue.peek();
        assertEquals(expected, actual);

        qeue.enqeue(2);
        qeue.enqeue(3);
        qeue.enqeue(4);

        expected = 1;
        actual = qeue.peek();
        assertEquals(expected, actual);
    }

    @Test
    public void deqeue_size_Validation() {
        Qeue<Integer> qeue = new Qeue<Integer>();

        qeue.enqeue(1);
        qeue.enqeue(1);
        qeue.enqeue(1);
        qeue.enqeue(1);
        qeue.enqeue(1);

        qeue.deqeue();

        int expected = 4;
        int actual = qeue.getSize();
        assertEquals(expected, actual);

        qeue.deqeue();
        qeue.deqeue();
        qeue.deqeue();

        expected = 1;
        actual = qeue.getSize();
        assertEquals(expected, actual);
    }

    @Test
    public void deqeue_data_Validation() {
        Qeue<Integer> qeue = new Qeue<Integer>();

        qeue.enqeue(111);
        qeue.enqeue(222);

        qeue.deqeue();

        int expected = 222;
        int actual = qeue.peek();
        assertEquals(expected, actual);

        qeue.deqeue();

        qeue.enqeue(2);
        qeue.enqeue(3);
        qeue.enqeue(4);

        expected = 2;
        actual = qeue.peek();
        assertEquals(expected, actual);
    }
}
