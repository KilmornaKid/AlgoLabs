package Recursion;

public class MyMath {

    public static int smallestThreeNums(int x, int y, int z){
        int smallest;
        if(x < y)
            smallest = x;
        else
            smallest = y;
        if(z < smallest)
            smallest = z;

        return smallest;
    }


    public static int powerUp(int x, int y){
        int result = 1;
        for(int i = 0; i < y; i++){
            result = result * x;

        }
        return result;
    }

    public static int sumNums(int x){
        int i, result=1;
        int number = x;
        for(i = 1; i<=number; i++){
            result = result*i;
        }
        return result;
    }

    public static  int factorial(int n){
        int factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        return factorial;
    }

    public  static boolean isPrime(int x){
        boolean ans = false;

        if (x==2){
            ans = true;
        }else if(x!=2){
            for (int i = 2; i < x; i++) {
                if(x % i == 0){
                    ans = false;
                    break;
                }else{
                    ans = true;
                }
            }
        }
        return ans;
    }

    public static int numberCount(String sentance){
        int words = 1;
        for (int i = 1; i < sentance.length(); i++) {
            if(sentance.charAt(1) == ' '){
                words--;
            }
            if(sentance.charAt(i) == ' '){
                words++;
            }
        }

        return words;
    }


    public static boolean Validate(String password) {

        boolean valid = false;
        int upper = 0;
        int lower = 0;
        int digit = 0;

        if (password.length() >= 8) {

            for (int i = 0; i < password.length(); i++) {
                if (Character.isLowerCase(password.charAt(i))) {
                    lower++;
                }
            }

            for (int i = 0; i < password.length(); i++) {
                if (Character.isUpperCase(password.charAt(i))) {
                    upper++;
                }
            }

            for (int i = 0; i < password.length(); i++) {
                if (Character.isDigit(password.charAt(i))) {
                    digit++;
                }
            }
        }

        if(lower > 0 && upper > 0 && digit > 0){
            System.out.println(lower +" "+upper+" "+digit);

            valid = true;
        }

        return valid;
    }


    public static void NumberCounter(int a, int b, int c, int d, int e, int f){

        int[] numbers = new int[100];

        for(int i =0; i < 100; i++){
            numbers[a] ++;
            numbers[b] ++;
            numbers[c] ++;
            numbers[d] ++;
            numbers[e] ++;
            numbers[f] ++;

        }

        System.out.println(numbers);

    }

}
