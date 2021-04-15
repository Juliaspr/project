package BinarySearchTree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinarySearchTreeTests {

    @Test
    public void insert_test_workJustFine() {
        BinarySearchTree tree = new BinarySearchTree();

        tree.insert("a");

        String expected = "a";
        String actual = tree.search("a").key;
        assertEquals(expected, actual);
    }
}
