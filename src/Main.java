import HashTable.*;

public class Main {

    public static void main(String[] args) {
        HashTable table = new HashTable();
        table.input("a");
        table.input("b");
        table.input("c");
        table.input("d");
        table.input("e");
        table.input("f");
        table.input("g");
        table.input("Some long string");
        table.input("Another long string");
        table.input("Other long string");
        table.printAll();
//        table.input("5");
//        table.input("10");
//        System.out.println(table.get(1).getElement(0).getData().key);
//        table.remove(0);
//        System.out.println(table.get(0).getElement(0).getData().key);
    }
}
