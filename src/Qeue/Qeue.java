package Qeue;

import DynamicArray.DynamicArray;

public class Qeue<T> {
    int size = 0;
    DynamicArray<T> array = new DynamicArray<T>(size);

    public void enqeue(T data) {
        array.add(data);
        size++;
    }


}
