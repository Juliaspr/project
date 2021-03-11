package Stack;

import DynamicArray.DynamicArray;

public class Stack<T> {
    int size = 0;
    DynamicArray<T> array = new DynamicArray<T>(size);

    public void push(T data) {
        array.insert(size, data);
        size++;
    }

    public T peek() {
        return array.get(array.getSize() - 1);
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}
