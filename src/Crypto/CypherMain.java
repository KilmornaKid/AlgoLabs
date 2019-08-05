package Crypto;

public class CypherMain {
    public static void main(String[] args) {
        System.out.println(Cypher.encryptCaeser("K IERAN",0));
        System.out.println(Cypher.encryptCaeser("KIERAN",-1));
        System.out.println(Cypher.encryptCaeser("KIE  RAN",1));
        System.out.println(Cypher.encryptCaeser("kieran",0));
        System.out.println(Cypher.encryptCaeser("1",0));
        System.out.println(Cypher.encryptCaeser("",1));
        System.out.println(Cypher.encryptCaeser(" ",1));

        int nums[] = new int[5];
        nums[0] = 3;
        nums[1] = 5;
        nums[2] = 2;
        nums[3] = 1;
        nums[4] = 6;

        for (int number:nums) {
            System.out.println(number);
        }

        System.out.println("New Problem No Name");
        System.out.println(Cypher.noName(nums,1,5));

    }
}
