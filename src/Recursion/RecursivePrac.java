package Recursion;

public class RecursivePrac {

    public static void main(String[] args) {

        System.out.println(factorial(5));
        System.out.println(factorial(1));
        System.out.println(factorial(0));

        System.out.println("\n Array numbers:");
        int [] numbers = new int[6];
        numbers[0] = 5;
        numbers[1] = 3;
        numbers[2] = 12;
        numbers[3] = 4;
        numbers[4] = 8;
        numbers[5] = 22;

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(i);
        }


        for (int i = 0; i < numbers.length; i++) {
            System.out.println(i);
        }

        System.out.println("\n This is the smallest in the arr: ");
        System.out.println(smallest(numbers));

        System.out.println("\n Binary search Where is 12 in the arr: ");
        System.out.println("At Index "+binarySearch(numbers,12));

    }

    //Recursive factorial method
    public static int factorial( int num){
        if ( num == 1 || num == 0 )
            return 1;
        else{
            int result = num * factorial(num - 1);
            return result;
        }
    }

    public static int smallest(int[] arr){
        int lIndex = arr.length - 1;
        return smallest(arr, lIndex);
    }

    private static int smallest(int[] arr,  int lastIndex){
        if(lastIndex == 0){
            return arr[lastIndex];
        }
        else {
            int small = smallest(arr, lastIndex -1);
            if(small < arr[lastIndex]){
                return small;
            }
            else{
                return arr[lastIndex];
            }
        }
    }

    public static int binarySearch(int[] arr, int find){
        int lIndex = arr.length - 1;
        return binarySearch(arr, find, lIndex);
    }

    private static int binarySearch(int[] arr, int find, int lastIndex){
        if(lastIndex == 0){
            if(arr[lastIndex] == find){
                return 0;
            }
            else {
                return -1;
            }
        }
        else{
            int index = binarySearch(arr, find, lastIndex -1);
            if (index == -1){
                if(arr[lastIndex] == find){
                    return lastIndex;
                }
                else{
                    return -1;
                }
            }
            else{
                return index;
            }
        }
    }

}
