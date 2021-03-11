package Stack;

import DynamicArray.DynamicArray;

public class Stack<T> {
    int size = 0;

    DynamicArray array = new DynamicArray(size);

    public boolean isEmpty() {
        return size == 0;
    }
}
