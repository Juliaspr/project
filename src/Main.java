import HashTable.*;

public class Main {

    public static void main(String[] args) {
        HashTable table = new HashTable();
        table.input(5);
        table.input(10);
        System.out.println(table.get(0).getElement(0).getData().data);
        table.remove(0);
        System.out.println(table.get(0).getElement(0).getData().data);
    }
}
