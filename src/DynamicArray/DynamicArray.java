package DynamicArray;

import java.util.Arrays;

public class DynamicArray<T> {
    T[] array;
    int SIZE_DEFAULT = 1;

    String error_wrongSize = "the array size cannot be less than 1";

    public DynamicArray() {
        array = (T[]) new Object[SIZE_DEFAULT];
    }

    public DynamicArray(int size) {
        array = (T[]) new Object[size];
    }

    public void set(int index, T data) {
        if (index >= array.length) {
            resize(index + 1);
        }

        array[index] = data;
    }

    public void resize(int newSize){
        if (newSize < 1) {
            throw new RuntimeException(error_wrongSize);
        }

        array = Arrays.copyOf(array, newSize);
    }

    public void printAll() {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }


    public int getSize() {
        return array.length;
    }
}
