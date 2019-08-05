package ArraySearchs;

public class ArrayDriver {
    public static void main(String[] args) {

        //Two int arrays with unsorted values

        int[] values = new int[5];
        values[0] = 1;
        values[1] = 8;
        values[2] = 6;
        values[3] = 4;
        values[4] = 3;

        int[] values2 = new int[5];
        values2[0] = 7;
        values2[1] = 4;
        values2[2] = 2;
        values2[3] = 3;
        values2[4] = 12;

        //Print out Array: (values) -unsorted
        System.out.println("\nUnSorted Values");
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }

        //Print out an Array: (values 2) -unsorted
        System.out.println("\nUnSorted Values2");
        for (int i = 0; i < values2.length; i++) {
            System.out.println(values2[i]);
        }

        //LinearSearch searches for an element with matching value to key -- prints out index matching key
        System.out.println("\nLinearSearch");
        System.out.println("Value 6 located at Array index: "+ArraySearch.linearSearch(values, 6));
        System.out.println("End\n");


        System.out.println("\nExp");
        System.out.println(ArraySearch.noName(values,3,5));
        System.out.println("END -- Exp\n");

        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }


        System.out.println("\nValues2\n");
        for (int i = 0; i < values2.length; i++) {
            System.out.println(values2[i]);
        }

        //Combine two Arrays (they may be un sorted)
        System.out.println("\nValues Merged");
        final int SIZE = 10;
        int a[] = new int[SIZE];
        Practice.merge(values,values2, a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        //Sort an Array
        System.out.println("\nSorted");
        Practice.mergeSort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
