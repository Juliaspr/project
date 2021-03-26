package QuadraticSort;
import java.util.Arrays;

public class QuadraticSort {
    public void sort(int[] data)
    {
        int temp;
        boolean sorted = false;

        while (!sorted) {

            sorted = true;
            for (int i = 0; i < data.length - 1; i++) {
                if (data[i] > data[i+1]) {
                    temp = data[i];
                    data[i] = data[i+1];
                    data[i+1] = temp;
                    sorted = false;
                }
            }

        }
    }
}