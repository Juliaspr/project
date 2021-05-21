package HashTable;
import DoublyLinkedList.*;
import DynamicArray.*;

public class HashTable {
    int size = 5;
    DynamicArray<DoublyLinkedList<TableObject>> data;

    public HashTable() {
        data = new DynamicArray<DoublyLinkedList<TableObject>>(size);
        for (int i = 0; i < size; i++) {
            data.insert(i, new DoublyLinkedList<TableObject>());
        }
    }

    public HashTable(int size) {
        this.size = size;
        data = new DynamicArray<DoublyLinkedList<TableObject>>(this.size);

        for (int i = 0; i < this.size; i++) {
            data.insert(i, new DoublyLinkedList<TableObject>());
        }
    }

    public void input(int data) {
        int index = data % size;
        this.data.get(index).insert(new TableObject(index, data));
    }

    public DoublyLinkedList<TableObject> get(int index) {
        if (index >= size || index < 0) {
            return null;
        }

        return data.get(index);
    }

    public void remove(int index) {
        if (index >= size || index < 0) {
            return;
        }

        data.insert(index, new DoublyLinkedList<TableObject>());
    }
}
