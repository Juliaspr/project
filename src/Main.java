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


        Element<Integer> node = list.getElement(5);
        Element<Integer> newElement = new Element<Integer>(4444);
        list.insertAfter(node, newElement);
        list.printAll();

    }
}
