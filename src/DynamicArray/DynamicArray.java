package DynamicArray;

import java.util.Arrays;

public class DynamicArray<T> {
    T[] array;
    int SIZE_DEFAULT = 0;

    String error_outOfBounds = "the array is out of bounds";
    String error_wrongSize = "the array size cannot be less than 1";

    public DynamicArray() {
        array = (T[]) new Object[SIZE_DEFAULT];
    }

    public DynamicArray(int size) {
        array = (T[]) new Object[size];
    }

    public T get(int index) {
        if (index < 0 || index > array.length) {
            throw new RuntimeException(error_outOfBounds);
        }

        return array[index];
    }

    public void insert(int index, T data) {
        if (index >= array.length) {
            resize(index + 1);
        }

        if (index < 0) {
            throw new RuntimeException(error_outOfBounds);
        }

        array[index] = data;
    }

    public void remove(int index) {
        if (index < 0 || index >= array.length) {
            throw new RuntimeException(error_outOfBounds);
        }

        T[] newArray = (T[]) new Object[array.length - 1];

        System.arraycopy(array, 0, newArray, 0, index);

        for (int i = index + 1; i < array.length; i++) {
            newArray[i-1] = array[i];
        }

        array = newArray;
    }

    public void resize(int newSize){
        if (newSize < 1) {
            throw new RuntimeException(error_wrongSize);
        }

        array = Arrays.copyOf(array, newSize);
    }

    public int getSize() {
        return array.length;
    }

    public int findFirst(T value) {
        // возвращает индекс первого вхождения
        // если не находит, возвращает -1.

        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(value)) {
                return i;
            }
        }

        return -1;
    }

    public int findLast(T value) {
        // возвращает индекс последнего вхождения
        // если не находит, возвращает -1.

        int index = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(value)) {
                index = i;
            }
        }

        return index;
    }

    public void add(T value) {
        resize(array.length + 1);

        array[array.length - 1] = value;
    }

    public void addFront(T value) {
        resize(array.length + 1);

        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i-1];
        }

        insert(0, value);
    }

    public void printAll() {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public String get_errorMessage(String error) {
        if (error == error_wrongSize) {
            return error_wrongSize;
        }

        return "No error message";
    }
}
