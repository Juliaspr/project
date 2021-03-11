import DynamicArray.DynamicArray;

public class Main {

    public static void main(String[] args) {
        DynamicArray<Integer> array = new DynamicArray<Integer>(1);

        array.set(0, 111);
        array.set(1, 111);
        array.set(2, 111);
        array.set(3, 111);
        array.printAll();
        System.out.println();

        array.add(6);
        array.printAll();
    }
}
