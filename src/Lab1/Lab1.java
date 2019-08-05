package Lab1;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Lab1 {
    public static void main(String[] args) {
        List<String> arrList = new ArrayList();
        List<String> linkList = new LinkedList();
        int listSize = 10; // 10 is first value, then 100, etc

        int reps = 100;  // will need to experiment with value for reps

        //populate both lists with contents of a data file
        try {   // The name of the file which we will read from
            String filename = "C:\\\\Users\\\\T00184968\\\\Desktop\\\\words_alpha.txt"; //file in project folder
            //String filename = "C:\\Users\\t00012345\\Desktop\\words_alpha.txt"; //can have file in any folder

            // Prepare to read from the file, using a Scanner object
            File file = new File(filename);
            Scanner in = new Scanner(file);

            for (int i = 0; i < listSize; i++){
                // Read one string from the file
                String str = in.nextLine();

                // add str to ArrayList and LinkedList
                arrList.add(str);
                linkList.add(str);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            e.printStackTrace();
        }

        // generate random numbers to use as indices for get method
        // same random numbers used for ArrayList and LinkedList
        int [] randomNos = generateRandomNos(listSize, reps);

        // call testGetForArrayList, testGetForLinkedList,  testSetForArrayList etc to test get, set, insert and remove for ArrayList and LinkedList.

        long startTime = System.currentTimeMillis();
        testGetForArrayList(arrList, randomNos);
        long endTime = System.currentTimeMillis();
        long duration = (endTime - startTime);
        System.out.println("ArrayList.get duration: " + duration);

        long startTime2 = System.currentTimeMillis();
        testGetForLinkedList(linkList, randomNos);
        long endTime2 = System.currentTimeMillis();
        long duration2 = (endTime2 - startTime2);
        System.out.println("ArrayList.get duration: " + duration2);


        long startTime3 = System.currentTimeMillis();
        testSetForList(arrList,randomNos);
        long endTime3 = System.currentTimeMillis();
        long duration3 = (endTime3 - startTime3);
        System.out.println("ArrayList.set duration: " + duration3);

        long startTime4 = System.currentTimeMillis();
        testSetForList(arrList,randomNos);
        long endTime4 = System.currentTimeMillis();
        long duration4 = (endTime4 - startTime4);
        System.out.println("ArrayList.set duration: " + duration4);


    }

    public static void testSetForList(List list, int [] randomNos) {
        for (int i = 0; i < randomNos.length; i++) {
            list.set(randomNos[i], "test");  // any String value will do
        }
    }

    public static void testGetForArrayList(List list, int [] randomNos) {
        testGetForList(list, randomNos);
    }

    public static void testGetForLinkedList(List list, int [] randomNos) {
        testGetForList(list, randomNos);
    }





        public static void testGetForList(List list, int []randomNos) {
        // call get on list multiple times
        for (int i = 0; i < randomNos.length; i++){
            list.get(randomNos[i]);
        }
    }

    public static int [] generateRandomNos(int listSize, int reps){
        Random random = new Random();
        int [] randomNos = new int [reps];

        for(int i = 0; i < reps; i++) {
            randomNos[i] = random.nextInt(listSize);
        }
        return randomNos;
    }



}