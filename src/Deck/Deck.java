package Deck;

import DoublyLinkedList.*;
import DynamicArray.DynamicArray;

public class Deck<T> {
    DynamicArray<T> array = new DynamicArray<T>();

    public void pushFront(T value) {
        array.addFront(value);
    }

    public void popFront() {
        array.remove(0);
    }

    public T peekFront() {
        return array.get(0);
    }
}
