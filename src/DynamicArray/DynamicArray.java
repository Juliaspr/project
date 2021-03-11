package DynamicArray;

import java.util.Arrays;

public class DynamicArray<T> {
    T[] array;
    int SIZE_DEFAULT = 1;

    String error_outOfBounds = "the array is out of bounds";
    String error_wrongSize = "the array size cannot be less than 1";

    public DynamicArray() {
        array = (T[]) new Object[SIZE_DEFAULT];
    }

    public DynamicArray(int size) {
        array = (T[]) new Object[size];
    }

    public void set(int index, T data) {
        if (index >= array.length) {
            throw new RuntimeException(error_outOfBounds);
        }

        array[index] = data;
    }

    public void resize(int newSize){
        if (newSize < 1) {
            throw new RuntimeException(error_wrongSize);
        }

        if (newSize < array.length) {
            array = Arrays.copyOf(array, newSize);
            return;
        }

        array = Arrays.copyOf(array, array.length + newSize);
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
