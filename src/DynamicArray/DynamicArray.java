package DynamicArray;

public class DynamicArray<T> {
    T[] array;
    int SIZE_DEFAULT = 0;

    String error_outOfBounds = "the array is out of bounds";

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


    public int getSize() {
        return array.length;
    }
}
