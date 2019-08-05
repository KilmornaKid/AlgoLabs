package Recursion;
public class TestMyArrays {
    public static void main(String[] args) {
        int [] list1 = {};
        int result = MyArrays.sum(list1);
        System.out.println(result);// expect 0

        int [] list2 = {16};
        result = MyArrays.sum(list2);
        System.out.println(result);// expect 16

        int [] list3 = {11,5,6,8};
        result = MyArrays.sum(list3);
        System.out.println(result);// expect 30
    }
}
