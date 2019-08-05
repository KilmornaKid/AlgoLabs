package ArraySearchs;

public class Practice {

    public static int insert(int []values, int currentSize, int newElement, int pos)
    {
        if (currentSize < values.length)
        {
            for (int i = currentSize-1; i >= pos; i--)
            {
                values[i+1] = values[i];
            }
            values[pos] = newElement;
            currentSize++;
        }
        return currentSize;
    }


    public static void selectionSort(int[] a)
    {
        //sorting in ascending order
        for (int i = 0; i <= a.length - 2; i++)
        {
            //find index such that a[index] is the smallest of a[i]…a[a.length-1]
            int index = i;
            int smallest = a[i];

            for (int j = i + 1; j <= a.length-1; j++)
            {
                if (a[j] < smallest) {
                    smallest = a[j];
                    index = j;
                }
            }
            //if index != i, swap a[index] and a[i].
            if (index != i)
            {
                int temp = a[i];
                a[i] = a[index];
                a[index] = temp;
            }
        }
    }

    public static void insertionSort(int[] a) {
        for (int i = 1; i < a.length-1; i++) {
            int value = a[i];
            int j = i - 1;

            while (j >= 0 && a[j]> value) {
                a[j + 1] = a[j];
                j--;
            }

            a[j+1]= value;

        }
    }

    public static void merge(int []first, int []second, int [] a){
        int iFirst = 0;
        int iSecond= 0;
        int j = 0;

        while(iFirst < first.length && iSecond < second.length){
            if(first[iFirst]< second[iSecond]){
                a[j] = first[iFirst];
                iFirst ++;
            }

            else{
                a[j]= second[iSecond];
                iSecond++;

            }
            j++;
        }

        while(iFirst <first.length){
            a[j]= first[iFirst];
            j++;
            iFirst ++;
        }

        while(iSecond < second.length){
            a[j]= second[iSecond];
            iSecond++;
            j++;
        }
    }

    public static void mergeSort(int[] a)
    {
        if(a.length <= 1){
            return;
        }

        int[] first = new int[a.length/2];
        int[] second = new int[a.length - first.length];

        //Copy the first half of a into the first,the second half into second

        for(int i = 0; i < first.length; i ++)
        {
            first[i] = a[i];
        }

        for (int i = 0; i <second.length ; i++) {
            second[i] = a[first.length + i];

        }

        mergeSort(first);
        mergeSort(second);
        merge(first,second,a);

    }

}
