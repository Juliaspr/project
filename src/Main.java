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
        table.remove(99);
        table.input("Other long string");
        table.printAll();
    }
}
