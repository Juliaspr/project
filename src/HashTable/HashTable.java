package HashTable;
import DoublyLinkedList.*;

public class HashTable {
    // each one of the table object is an array
    // object[0] - key of the object
    // object[1] - data of the object

    int size;
    DoublyLinkedList[] data;

    public HashTable() {
        size = 5;
        data = new DoublyLinkedList[size];

        for (int i = 0; i < size; i++) {
            data[i] = new DoublyLinkedList();
        }
    }

    public void input(int data) {
        int index = data % size;
        this.data[index].insert(new TableObject(index, data));
    }

    public DoublyLinkedList<TableObject> get(int index) {
        if (index >= size || index < 0) {
            return null;
        }

        return data[index];
    }
}
