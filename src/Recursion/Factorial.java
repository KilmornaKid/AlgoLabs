package Recursion;

public class Factorial {

    public static int fact(int n){
        if(n == 1 || n == 0)
            return 1;
        else
            return n * fact(n-1);
    }

    public static double myPow(double x, int y){
        if( y == 0 ){
            return 1;
        }else
            return ( x * myPow(x,y-1));
    }

    public static String reverseString(String str){
        if(str.isEmpty()){
            return str;
        } else {
            return reverseString(str.substring(1))+str.charAt(0);
        }

    }

    //REF: https://stackoverflow.com/questions/20253651/recursively-sum-the-integers-in-an-array
    public static int sumArr(int[] values, int size){
        if (size == 0)
            return values[size];
        else
            return values[size] + sumArr(values, size-1);
    }





}
