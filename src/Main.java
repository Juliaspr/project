import DynamicArray.*;
import DoublyLinkedList.*;
import Qeue.*;

public class Main {

    public static void main(String[] args) {
        Qeue<Integer> qeue = new Qeue<Integer>();

        qeue.enqeue(1);
        qeue.enqeue(2);
        qeue.enqeue(3);
        qeue.enqeue(4);
        qeue.printAll();
    }
}
