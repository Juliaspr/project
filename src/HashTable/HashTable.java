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

    public void input(String data) {
        TableObject item = new TableObject(data);
        int index = hash(item.key);
        this.data.get(index).insert(item);
    }

    public DoublyLinkedList<TableObject> get(int key) {
        int index = hash(key);
        return data.get(index);
    }

    public void remove(int key) {
        int index = hash(key);
        for (int i = 0; i < data.get(index).getSize(); i++) {
            int currentKey = data.get(index).getElement(i).getData().key;

            if (data.get(index).getSize() <= 1) {
                data.insert(index, new DoublyLinkedList<TableObject>());
                return;
            }

            if (currentKey == key) {
                data.get(index).removeElement(i);
                return;
            }
        }
    }

    public int hash(int key) {
        return key % size;
    }

    public void printAll() {
        for (int i = 0; i < size; i++) {
            System.out.println();
            System.out.println("HashTable[" + i + "]:");
            DoublyLinkedList<TableObject> currentList = data.get(i);

            for (int f = 0; f < currentList.getSize(); f++) {
                System.out.print("[" + f + "] " + "Key: " + currentList.getElement(f).getData().key);
                System.out.println("; Data: " + currentList.getElement(f).getData().data);
            }
        }
    }
}
