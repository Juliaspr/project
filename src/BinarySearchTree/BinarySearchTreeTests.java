package BinarySearchTree;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinarySearchTreeTests {

    @Test
    public void insert_workJustFine() {
        BinarySearchTree tree = new BinarySearchTree();

        tree.insert("a");

        String expected = "a";
        String actual = tree.search("a").key;
        assertEquals(expected, actual);
    }

    @Test
    public void search_normalTest() {
        BinarySearchTree tree = new BinarySearchTree();

        tree.insert("a");

        String expected = "a";
        String actual = tree.search("a").key;
        assertEquals(expected, actual);
    }

    @Test
    public void search_NotFoundException() {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert("a");
        String error_message = "Not found";
        assertThrows(RuntimeException.class, () -> tree.search("g"), error_message);
    }

    @Test
    public void min_normalTest() {
        BinarySearchTree tree = new BinarySearchTree();

        tree.insert("ab");
        tree.insert("abcd");
        tree.insert("a");

        String expected = "a";
        String actual = tree.min().key;
        assertEquals(expected, actual);
    }

    @Test
    public void max_normalTest() {
        BinarySearchTree tree = new BinarySearchTree();

        tree.insert("ab");
        tree.insert("abcd");
        tree.insert("a");

        String expected = "abcd";
        String actual = tree.max().key;
        assertEquals(expected, actual);
    }

    @Test
    public void successor_normalTest() {
        BinarySearchTree tree = new BinarySearchTree();

        tree.insert("g");
        tree.insert("q");
        tree.insert("d");
        tree.insert("t");
        tree.insert("j");

        String expected = "q";
        String actual = tree.successor(tree.search("j")).key;
        assertEquals(expected, actual);
    }

    @Test
    public void successor_NotFound_Exception() {
        BinarySearchTree tree = new BinarySearchTree();

        tree.insert("g");
        tree.insert("q");
        tree.insert("d");
        tree.insert("t");
        tree.insert("j");

        String error_message = "Not found";
        assertThrows(RuntimeException.class, () -> tree.successor(tree.search("t")), error_message);
    }

    @Test
    public void predecessor_normalTest() {
        BinarySearchTree tree = new BinarySearchTree();

        tree.insert("g");
        tree.insert("q");
        tree.insert("d");
        tree.insert("t");
        tree.insert("j");

        String expected = "g";
        String actual = tree.predecessor(tree.search("j")).key;
        assertEquals(expected, actual);
    }

    @Test
    public void predecessor_NotFound_Exception() {
        BinarySearchTree tree = new BinarySearchTree();

        tree.insert("g");
        tree.insert("q");
        tree.insert("d");
        tree.insert("t");
        tree.insert("j");

        String error_message = "Not found";
        assertThrows(RuntimeException.class, () -> tree.predecessor(tree.search("d")), error_message);
    }

    @Test
    public void delete_normalTest() {
        BinarySearchTree tree = new BinarySearchTree();

        tree.insert("g");
        tree.insert("q");
        tree.insert("d");
        tree.insert("t");
        tree.insert("j");
        tree.insert("z");

        tree.delete(tree.search("t"));

        String expected = "z";
        String actual = tree.successor(tree.search("q")).key;
        assertEquals(expected, actual);
    }

    @Test
    public void delete_notFound_Exception() {
        BinarySearchTree tree = new BinarySearchTree();

        tree.insert("g");
        tree.insert("q");
        tree.insert("d");
        tree.insert("t");
        tree.insert("j");
        tree.insert("z");

        String error_message = "Not found";
        assertThrows(RuntimeException.class, () -> tree.delete(tree.search("ger")), error_message);
    }
}
