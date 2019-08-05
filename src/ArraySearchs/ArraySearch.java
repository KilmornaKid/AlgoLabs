package ArraySearchs;

public class ArraySearch {

    public static int linearSearch(int[] x, int key){
        boolean found = false;

        for (int i = 0; i < x.length; i++) {
            if(x[i] == key){
                return i;
            }
        }
        return -1;
    }


    public static int noName(int[] a , int pos, int currentSize)
    {
        for(int i = pos; i < currentSize - 1; i++)
        {
            a[i] = a[i + 1];
        }
        currentSize--;
        return currentSize;
    }

}
