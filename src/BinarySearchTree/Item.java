package BinarySearchTree;

public class Item {
    public String key;
    Item leftChild;
    Item rightChild;
    Item parent;

    public Item() {
        key = null;
        leftChild = null;
        rightChild = null;
        parent = null;
    }

    public Item(String key) {
        this.key = key;
        leftChild = null;
        rightChild = null;
        parent = null;
    }
}
