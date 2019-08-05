package Recursion;

public class Recursion {

    public static void main(String[] args) {

        System.out.println("Exercise 1:");

        int result = Factorial.fact(4);
        System.out.println(result);

        System.out.println("Exercise 2:");

        double result2 = Factorial.myPow(3,2);
        System.out.println(result2);
        result2 = Factorial.myPow(2,2);
        System.out.println(result2);
        result2 = Factorial.myPow(5,0);
        System.out.println(result2);
        result2 = Factorial.myPow(0,5);
        System.out.println(result2);

        System.out.println("Exercise 3");
        String result3 = Factorial.reverseString("Hello!");
        System.out.println(result3);
        result3 = Factorial.reverseString("madam");
        System.out.println(result3);
        result3 = Factorial.reverseString("m");
        System.out.println(result3);

        System.out.println("Exercise 4");
        int[] a = {1, 2, 4, 5, 6 };
        int[] b = {0};
        int[] c = {6, 4, -3};
        int[] d = {-1, -4};
        //n is the size of array -1 so 4 in this case
        System.out.println("Sum of Array: "+Factorial.sumArr(a, 4)); //Expected Value: 18
        System.out.println("Sum of Array: "+Factorial.sumArr(b, 0)); //Expected Value: 0
        System.out.println("Sum of Array: "+Factorial.sumArr(c, 2)); //Expected Value: 7
        System.out.println("Sum of Array: "+Factorial.sumArr(d, 1)); //Expected Value: -5

    }
}
