package Recursion;

public class TestMyMath {
    public static void main(String[] args) {
        System.out.println("\nQuestion 1 Smallest Number:");

        int result = MyMath.smallestThreeNums(1, 3, 5);
        System.out.println(result); //expected 1
        result = MyMath.smallestThreeNums(12,10,13);
        System.out.println(result); //expected 10
        result = MyMath.smallestThreeNums(12,10,8);
        System.out.println(result); //expected 8
        result = MyMath.smallestThreeNums(0,0,0);
        System.out.println(result); //expected 8
        result = MyMath.smallestThreeNums(-1,0,0);
        System.out.println(result); //expected -1

        System.out.println("\nQuestion 2 Powers:");

        result = MyMath.powerUp(2,2);
        System.out.println(result); //expected 4
        result = MyMath.powerUp(5,3);
        System.out.println(result); //expected 125
        result = MyMath.powerUp(4,2);
        System.out.println(result); //expected 16
        result = MyMath.powerUp(0,2);
        System.out.println(result); //expected 0
        result = MyMath.powerUp(2,0);
        System.out.println(result); //expected 1

        System.out.println("\nQuestion 3 Sums:");

        result = MyMath.sumNums(3);
        System.out.println(result); //expected 6
        result = MyMath.sumNums(5);
        System.out.println(result); //expected 120
        result = MyMath.sumNums(8);
        System.out.println(result); //expected 4032
        result = MyMath.sumNums(1);
        System.out.println(result); //expected 4032

        System.out.println("\nQuestion 4 Facts:");

        result = MyMath.factorial(4);
        System.out.println(result); //expected 24

        System.out.println("\nQuestion 6 Primes: ");

        boolean primeResult = MyMath.isPrime(2);
        System.out.println(primeResult); //expected  true

        primeResult = MyMath.isPrime(3);
        System.out.println(primeResult); //expected true

        primeResult = MyMath.isPrime(19);
        System.out.println(primeResult); //expected true

        primeResult = MyMath.isPrime(4);
        System.out.println(primeResult); //expected false

        System.out.println("\nQuestion 7 Word Count: ");

        int wordCount = MyMath.numberCount("Hello World");
        System.out.println(wordCount); //expected 2

        wordCount = MyMath.numberCount("My name is Kieran");
        System.out.println(wordCount); //expected 4

        wordCount = MyMath.numberCount("Ha!!!");
        System.out.println(wordCount); //expected 1

        wordCount = MyMath.numberCount("Hi");
        System.out.println(wordCount); //expected 1


        System.out.println("\nQuestion 7 Valid: ");

        boolean valid = MyMath.Validate("Kieran9");
        System.out.println(valid);//expected false

        valid = MyMath.Validate("KieranStack");
        System.out.println(valid);//expected false

        valid = MyMath.Validate("kieran");
        System.out.println(valid);//expected false

        valid = MyMath.Validate("Kieran9");
        System.out.println(valid);//expected false

        valid = MyMath.Validate("Sft234");
        System.out.println(valid);//expected false

        System.out.println("\nQuestion 8 number counter: ");
        MyMath.NumberCounter(1,2,3,4,5,6);
    }




}
