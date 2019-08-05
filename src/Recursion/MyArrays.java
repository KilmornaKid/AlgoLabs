package Recursion;
import java.util.Arrays;

public class MyArrays {
    public static int sum(int[] data)
    {
        if (data.length == 0){
            return 0;
        }
        else if (data.length == 1) {
            return data[0];
        }
        // get last item in the array – call it last
        int last = data[data.length - 1];
        //Use Arrays.copyOf to get the a copy of the array withoiut the last item – call this new array data1

        int[] head = Arrays.copyOf(data, data.length - 1);
        // call this method recursively on data1
        int sum = sum(head);

        int result = last + sum;
        return result;
    }
}
