import DynamicArray.DynamicArray;
import DoublyLinkedList.*;

public class Main {

    public static void main(String[] args) {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<Integer>();

        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);
        list.append(6);
        list.printAll();

       list.set(0, 0);
        list.printAll();

    }
}
