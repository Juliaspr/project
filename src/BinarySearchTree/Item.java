package BinarySearchTree;

public class Item {
    public String key;
    public Item leftChild;
    public Item rightChild;
    public Item parent;

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

    public int height() {
        if (leftChild == null & rightChild == null) {
            return -1;
        }

        else if (leftChild == null || rightChild == null) {
            return 0;
        }

        else {
            if (leftChild.height() > rightChild.height()) {
                return leftChild.height();
            } else {
                return rightChild.height();
            }
        }
    }

    public int balance() {
        int left;
        int right;

        if (leftChild == null) {
            left = -1;
        } else {
            left = leftChild.height();
        }

        if (rightChild == null) {
            right = -1;
        } else {
            right = rightChild.height();
        }
        return left - right;
    }
}
