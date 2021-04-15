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

    public Item search(String key) {
        return searchRec(key, root);
    }

    public Item min() {
        Item node = root;
        while (node.leftChild != null) {
            node = node.leftChild;
        }
        return node;
    }

    public Item max() {
        Item node = root;
        while (node.rightChild != null) {
            node = node.rightChild;
        }
        return node;
    }

    private Item searchRec(String key, Item node) {
        if (node == null) {
            throw new RuntimeException("Not found");
        }

        if (key.equals(node.key)) {
            return node;
        }

        boolean toLeftChild = key.compareTo(node.key) < 0;
        if (toLeftChild) {
            return searchRec(key, node.leftChild);
        } else {
            return searchRec(key, node.rightChild);
        }
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
