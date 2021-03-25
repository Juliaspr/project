import Deck.Deck;
import DynamicArray.*;
import DoublyLinkedList.*;
import Qeue.*;

public class Main {

    public static void main(String[] args) {
        Deck<Integer> deck = new Deck<Integer>();

        deck.pushBack(1);
        deck.pushBack(2);
        deck.pushBack(3);
        deck.printAll();
        System.out.println();

        deck.pushFront(222);
        deck.printAll();
        System.out.println();

        deck.popBack();
        deck.popBack();
        deck.printAll();
        System.out.println();

        System.out.println(deck.peekBack());
    }
}
