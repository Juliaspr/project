package BinarySearchTree;

public class BinarySearchTree {
    Item root;

    public BinarySearchTree() {
        root = new Item();
    }

    public BinarySearchTree(String key) {
        root = new Item(key);
    }

    public void insert(String key) {
        if (root.key == null) {
            root = new Item(key);
            return;
        }
        insertRec(key, root);
    }

    private void insertRec(String key, Item node) {

        // левая часть
        if (key.compareTo(node.key) < 0) {
            if (node.leftChild != null) {
                insertRec(key, node.leftChild);
            } else {
                node.leftChild = new Item(key);
                node.leftChild.parent = node;
            }
        }

        // правая часть
        if (key.compareTo(node.key) >= 0) {
            if (node.rightChild != null) {
                insertRec(key, node.rightChild);
            } else {
                node.rightChild = new Item(key);
                node.rightChild.parent = node;
            }
        }
    }
}
