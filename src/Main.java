import DynamicArray.DynamicArray;

public class Main {

    public static void main(String[] args) {
        DynamicArray array = new DynamicArray(10);

        array.set(0, 1);
        array.set(1, 2);
        array.set(2, 3);
        array.printAll();
        System.out.println();

        array.resize(3);
        array.printAll();
        System.out.println();

        array.set(2, 4);
        array.printAll();

    }
}
