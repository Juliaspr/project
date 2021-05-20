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
    }

    public HashTable(int size) {
        this.size = size;
        data = new DoublyLinkedList[size];
    }
}
