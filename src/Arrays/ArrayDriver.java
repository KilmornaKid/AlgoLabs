package Arrays;

import java.util.Arrays;
import java.util.Random;


public class ArrayDriver {
    public static void main(String[] args) {

        int [] values = new int[9];
        values[0] = 1;
        values[1] = 32;
        values[2] = 50;
        values[3] = 23;
        values[4] = 55;
        values[5] = 55;
        values[6] = 5;
        values[7] = 255;
        values[8] = 8;


        Random random = new Random();
        final int SIZE = 100000;
        int[] a = new int[SIZE];
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(Integer.MAX_VALUE);
        }

        int [] b = a.clone();
        int [] c = a.clone();
        int [] d = a.clone();

        //int currentSize = 5;

        //currentSize = Arrays.ArraysMethods.insert(values, currentSize, 10, 2);
        //expected output 1,4,10,15,23,55

        //for (int i=0; i < currentSize; i++)
        //  System.out.println(values[i]);

        /*
        Arrays.ArraysMethods.insertionSort(values);
        for (int i = 0; i <values.length ; i++) {
            System.out.println(values[i]);
        }
        */

        System.out.println("Merge");
        long start4 = System.currentTimeMillis();
        ArraysMethods.mergeSort(a);
        long finish4 = System.currentTimeMillis();
        System.out.print(finish4 - start4);


        System.out.println("\nSecond Array Selection");
        long start5 = System.currentTimeMillis();
        ArraysMethods.selectionSort(b);
        long finish5 = System.currentTimeMillis();
        System.out.print(finish5 - start5);

        System.out.println("\nThird Array Insertion");
        long start6 = System.currentTimeMillis();
        ArraysMethods.insertionSort(c);
        long finish6 = System.currentTimeMillis();
        System.out.print(finish6 - start6);

        System.out.println("\nFourth Array Java Array Sort");
        long start7 = System.currentTimeMillis();
        Arrays.sort(d);
        long finish7 = System.currentTimeMillis();
        System.out.print(finish7 - start7);


        System.out.println("\nPART 2 Merge");

        final int SIZE2 =100000;
        int[] f = new int[SIZE2];
        for (int i = 0; i < f.length; i++) {
            a[i] = i;
        }
        a[100] = 465;

        int[] g = f.clone();
        int[] h = f.clone();
        int[] i = f.clone();

        long start1 = System.currentTimeMillis();
        ArraysMethods.mergeSort(f);
        long finish1 = System.currentTimeMillis();
        System.out.print(finish1 - start1);

        System.out.println("\nSecond Array Part 2 Selection");
        long start2 = System.currentTimeMillis();
        ArraysMethods.selectionSort(g);
        long finish2 = System.currentTimeMillis();
        System.out.print(finish2 - start2);

        System.out.println("\nThird Array Part 2 Insertion");
        long start3 = System.currentTimeMillis();
        ArraysMethods.insertionSort(h);
        long finish3 = System.currentTimeMillis();
        System.out.print(finish3 - start3);

        System.out.println("\nThird Array Part 2 Java Array Sort");
        long start8 = System.currentTimeMillis();
        Arrays.sort(i);
        long finish8 = System.currentTimeMillis();
        System.out.print(finish8 - start8);


        int [] x = new int[5];
        x[0] = 7;
        x[1] = 10;
        x[2] = 11;
        x[3] = 16;
        x[4] = 20;

        int [] y = new int[7];
        y[0] = 2;
        y[1] = 8;
        y[2] = 9;
        y[3] = 12;
        y[4] = 15;
        y[5] = 19;
        y[6] = 32;

        int[] z = new int[12];

        ArraysMethods.merge(x,y,z);




    }
}