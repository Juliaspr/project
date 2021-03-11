package DynamicArray;

public class DynamicArray<T> {
    public T[] array;
    public int SIZE_DEFAULT = 0;

    public DynamicArray() {
        array = (T[]) new Object[SIZE_DEFAULT];
    }
}
