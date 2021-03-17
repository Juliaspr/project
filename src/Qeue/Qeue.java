package Qeue;

import DynamicArray.DynamicArray;

public class Qeue<T> {
    private int size = 0;
    private DynamicArray<T> array = new DynamicArray<T>(size);

    public void enqeue(T data) {
        array.add(data);
        size++;
    }

    public void deqeue() {
        array.remove(0);
        size--;
    }

    public T peek() {
        return array.get(0);
    }

    public int getSize() {
        return size;
    }

    public void printAll() {
        array.printAll();
    }
}
