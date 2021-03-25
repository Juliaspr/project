package Deck;

import DoublyLinkedList.*;
import DynamicArray.DynamicArray;

public class Deck<T> {
    private String deckIsEmptyError = "there's nothing in deck. It's empty";
    private DynamicArray<T> array = new DynamicArray<T>();



    public void pushFront(T value) {
        array.addFront(value);
    }

    public void popFront() {
        array.remove(0);
    }

    public T peekFront() {

        if (array.getSize() <= 0) {
            throw new RuntimeException(deckIsEmptyError);
        }

        return array.get(0);
    }

    public void pushBack(T value) {
        array.add(value);
    }

    public void popBack() {
        array.remove(getSize() - 1);
    }

    public T peekBack() {

        if (array.getSize() <= 0) {
            throw new RuntimeException(deckIsEmptyError);
        }

        return array.get(getSize() - 1);
    }

    public int getSize() {
        return array.getSize();
    }

    public void printAll() {
        array.printAll();
    }

    public String get_errorMessage(String error) {
        if (error.equals(deckIsEmptyError)) {
            return deckIsEmptyError;
        }
        return "No error message";
    }
}
