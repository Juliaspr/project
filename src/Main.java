import DynamicArray.DynamicArray;
import DoublyLinkedList.*;

public class Main {

    public static void main(String[] args) {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<Integer>();

        list.append(1);
        list.append(2);
        list.append(3);
        list.printAll();
        
        list.insert(4);
        list.insert(5);
        list.insert(6);
        list.printAll();

        System.out.println(list.getElement(2).getData());
    }
}
