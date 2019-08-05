package Arrays;

import java.util.Random;

public class Test {
    public static void main(String[] args) {

        int [] values = new int[4];
        values[0] = 8;
        values[1] = 6;
        values[2] = 7;
        values[3] = 2;

        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }

        ArraysMethods.selectionSort(values);

        for (int i = 0; i < values.length; i++) {
            System.out.println("\n"+values[i]);
        }

    }
}
