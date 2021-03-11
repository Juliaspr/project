import DynamicArray.DynamicArray;

public class Main {

    public static void main(String[] args) {
        DynamicArray<Integer> array = new DynamicArray<Integer>(1);

        array.insert(0, 111);
        array.insert(1, 111);
        array.insert(2, 222);
        array.insert(3, 111);
        array.insert(4, 111);
        array.printAll();
        System.out.println();

        array.remove(2);
        array.printAll();
    }
}
