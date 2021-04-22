package BinarySearchTree;
public class BinarySearchTree {
    Item root;
    String NOT_FOUND_ERROR = "Not found";

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
        Item newNode = insertRec(key, root);
        if (newNode != null) {
            balance(newNode);
        }
    }

    private void rotateRight(Item input) {
        Item parent = input.parent;
        Item leftChild = input.leftChild;
        input.leftChild = leftChild.rightChild;
        leftChild.rightChild = input;
        leftChild.parent = parent;
        input.parent = leftChild;

        if (parent != null) {
            if (parent.leftChild == input) {
                parent.leftChild = leftChild;
            } else {
                parent.rightChild = leftChild;
            }
        }
        updateRoot();
    }

    private void rotateLeft(Item input) {
        Item parent = input.parent;
        Item rightChild = input.rightChild;
        input.rightChild = rightChild.leftChild;
        rightChild.leftChild = input;
        input.parent = rightChild;
        rightChild.parent = parent;

        if (parent != null) {
            if (parent.leftChild == input) {
                parent.leftChild = rightChild;
            } else {
                parent.rightChild = rightChild;
            }
        }
        updateRoot();
    }

    public void balance(Item input) {

        if (input == null) {
            return;
        }

        if (input.balance() > 1) {
            if (input.leftChild.balance() > 0) {
                rotateRight(input);
            } else {
                rotateLeft(input.leftChild);
                rotateRight(input);
            }
        }

        else if (input.balance() < -1) {
            if (input.rightChild.balance() < 0) {
                rotateLeft(input);
            } else {
                rotateRight(input.rightChild);
                rotateLeft(input);
            }
        } else {
            balance(input.parent);
        }
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

    public Item successor(Item input) {

        boolean rightChildExists = input.rightChild != null;
        if (rightChildExists) {
            input = input.rightChild;

            boolean leftChildExists = input.leftChild != null;
            while (leftChildExists) {
                input = input.leftChild;
                leftChildExists = input.leftChild != null;
            }
            return input;
        }

        else {
            boolean parentExists = input.parent != null;
            while (parentExists) {
                if (input.parent.leftChild == input) {
                    return input.parent;
                } else {
                    input = input.parent;
                }
                parentExists = input.parent != null;
            }
        }
        throw new RuntimeException(NOT_FOUND_ERROR);
    }

    public Item predecessor(Item input) {
        boolean leftChildExists = input.leftChild != null;
        if (leftChildExists) {
            input = input.leftChild;
            while (input.rightChild != null) {
                input = input.rightChild;
            }
            return input;
        }
        else {
            boolean parentExists = input.parent != null;
            while (parentExists) {
                if (input.parent.rightChild.equals(input)) {
                    return input.parent;
                } else {
                    input = input.parent;
                }
                parentExists = input.parent != null;
            }
        }
        throw new RuntimeException(NOT_FOUND_ERROR);
    }

    public Item delete(Item deletionNode) {
        int children = 0;
        if (deletionNode.leftChild != null) children++;
        if (deletionNode.rightChild != null) children++;

        boolean isLeftChild = false;
        if (deletionNode.parent.leftChild != null) {
            isLeftChild = deletionNode.parent.leftChild.equals(deletionNode);
        }

        if (children > 1) {
            if (isLeftChild) {
                Item nextNode = successor(deletionNode);
                nextNode.leftChild = deletionNode.leftChild;
                nextNode.leftChild = nextNode;
                nextNode.leftChild.parent = nextNode;
                nextNode.parent = nextNode;
                return nextNode;
            } else {
                Item nextNode = successor(deletionNode);
                nextNode.leftChild = deletionNode.leftChild;
                nextNode.rightChild = nextNode;
                nextNode.rightChild.parent = nextNode;
                nextNode.parent = nextNode;
                return nextNode;
            }
        }

        if (children == 1) {

            if (deletionNode.leftChild != null) {

                if (isLeftChild) {
                    Item newChild = deletionNode.leftChild;
                    deletionNode.leftChild.parent = null;
                    deletionNode.parent.leftChild = newChild;
                    newChild.parent = deletionNode.parent;
                    return deletionNode.parent.leftChild;
                } else {
                    Item newChild = deletionNode.leftChild;
                    deletionNode.leftChild.parent = null;
                    deletionNode.parent.rightChild = newChild;
                    newChild.parent = deletionNode.parent;
                    return deletionNode.parent.rightChild;
                }

            } else {

                if (isLeftChild) {
                    Item newChild = deletionNode.rightChild;
                    deletionNode.rightChild.parent = null;
                    deletionNode.parent.leftChild = newChild;
                    newChild.parent = deletionNode.parent;
                    return deletionNode.parent.leftChild;
                } else {
                    Item newChild = deletionNode.rightChild;
                    deletionNode.rightChild.parent = null;
                    deletionNode.parent.rightChild = newChild;
                    newChild.parent= deletionNode.parent;
                    return deletionNode.parent.rightChild;
                }
            }
        }

        else {
            if (isLeftChild) {
                deletionNode.parent.leftChild = null;
            } else {
                deletionNode.parent.rightChild = null;
            }

            return deletionNode.parent;
        }
    }

    private Item searchRec(String key, Item node) {
        if (node == null) {
            throw new RuntimeException(NOT_FOUND_ERROR);
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

    private Item insertRec(String key, Item node) {

        // левая часть
        if (key.compareTo(node.key) <= 0) {
            if (node.leftChild != null) {
                return insertRec(key, node.leftChild);
            } else {
                node.leftChild = new Item(key);
                node.leftChild.parent = node;
                return node.leftChild;
            }
        }

        // правая часть
        else {
            if (node.rightChild != null) {
                return insertRec(key, node.rightChild);
            } else {
                node.rightChild = new Item(key);
                node.rightChild.parent = node;
                return node.rightChild;
            }
        }
    }

    private void updateRoot() {
        Item first = min();
        while (first.parent != null) {
            first = first.parent;
        }
        root = first;
    }
}
