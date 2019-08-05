package LinkedLists;

import java.io.FileNotFoundException;
import java.util.*;
import java.io.File;
import java.util.List;
import java.util.Scanner;

public class Lab11 {
    public static void main(String[] args) {
/*
        1. Write a program that creates a LinkedList of String objects.
        (i) Add the following names to the list, using the add method (or addLast method) :
        Kay, Jay, May, Fay

                (ii) Use an iterator to insert â€œRayâ€ after May.

        (iii) Then delete Jay

        (v) Add Kay again. Use an iterator to display all the names. Note that duplicates are allowed.

        // write your code here*/
        List<String> myList = new LinkedList();
        myList.add("Kay");
        myList.add("Jay");
        myList.add("May");
        myList.add("Fay");

        ListIterator<String> iterator = myList.listIterator();// |KJMF
        iterator.next();  // K|JMF
        iterator.next();  //KJ|MF
        iterator.next();   //KJM|F
        iterator.add("Ray");


        //test always!

        for (String name: myList){
            System.out.println(name);
        }// expect  ??Kay Jay May Ray Fay  one per line

        //Then delete Jay
        //    KJMR|F

        iterator.previous();
        iterator.previous();
        iterator.previous();
        iterator.remove();
        System.out.println("After remove:");
        for (String name: myList){
            System.out.println(name);
        }// expect  ??Kay May Ray Fay  one per line

        /*(iv) Use an iterator to display all the names on the list
        From the beginning of the list
        From the end of the list */
        //From the beginning of the list

        iterator = myList.listIterator();
        while (iterator.hasNext()) {
            System.out.println("Value is : "
                    + iterator.next());
        }

        System.out.println("From the end");
        // From the end of the list
        while (iterator.hasPrevious()) {
            System.out.println("Value is : "
                    + iterator.previous());
        } // expect Fay Ray May Kay

        System.out.println("After adding Kay");
        iterator.add("Kay");
        for (String name: myList){
            System.out.println(name);
        }// expect Kay Kay May Ray Fay


        //2. Insert the names given above in Q1 in a set:  Kay, Jay, May, Fay. Use the two different Set
        // implementations â€“ HashSet and TreeSet. Try inserting the same name twice. Note that duplicates are not allowed.
        //Use an iterator to display the names in the sets.
        //What is the output for
        //1. HashSet implementation?
        //2.TreeSet implementation?
        //What do you notice about the output?
        Set<String> names = new TreeSet();
        names.add("Kay");
        names.add("Jay");
        names.add("May");
        names.add("Fay");
        names.add("Kay");
        System.out.println("\n\nOutput from TreeSet");
        Iterator<String> iter2 = names.iterator();
        while (iter2.hasNext()) {
            System.out.println("Value is : "
                    + iter2.next());
        }
        //expect ??

        //hamlet.txt
        /*
        To be, or not to be, that is the question.
        Whether 'tis nobler in the mind to suffer
        The slings and arrows of outrageous fortune,
        Or to take arms against a sea of troubles
        And by opposing end them.?
         */

        //3. Write a program that reads text from a file and breaks it up into individual words.
        //See the source code â€œfilehandling.javaâ€ for code to read from a text file, hamlet.txt on the desktop, and break
        // the text into words.
        //Put hamlet.txt on the desktop to run this.
        //
        //Insert the words into a TreeSet. At the end of the input file, print all words, followed by the size of the
        // resulting set. Use an iterator.
        //This program determines how many unique words a text file has.
        //What happens if you use a HashSet instead of a TreeSet?
        String fileName = "C:\\Users\\Kieran\\Desktop\\hamlet.txt";
        Set<String> words = new TreeSet<>();
        try {
            Scanner in = new Scanner(new File(fileName));
            int lineNumber = 1;
            while (in.hasNextLine()) {
                Scanner lineParser = new Scanner(in.nextLine());
                // Use any characters other than a-z, A-Z, 0-9 as delimiters
                lineParser.useDelimiter("[^A-Za-z0-9]+");
                while (lineParser.hasNext()) {
                    String word = lineParser.next();
                    words.add(word);
                    //System.out.println(word);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("\n\nList of words");
        Iterator<String> iter3 = words.iterator() ;
        while (iter3.hasNext()) {
            System.out.println(iter3.next());
        }
        //size of words?
        System.out.println("Number of words: " + words.size());

        /*4. Add code to the program you wrote for Q.3 so that a Map is used. The key is the word and the value is the
         line number.
          */
        /*If you store just one line number for each word, then the last occurrence of the word will be in the map.
         E.g. the word â€œtoâ€ is repeated in a few lines.
          */
        /*To store all the line numbers on which a word occurred, you could use a List or a Set of line numbers â€“
        which would be better?
         */
        Map<String, List<Integer>> map = new TreeMap();  //Changed Integer to List<Integer> to allow many
        // line numbers be associated with each word

        try {
            Scanner in = new Scanner(new File(fileName));
            int lineNumber = 1;
            while (in.hasNextLine()) {
                Scanner lineParser = new Scanner(in.nextLine());
                // Use any characters other than a-z, A-Z, 0-9 as delimiters
                lineParser.useDelimiter("[^A-Za-z0-9]+");
                while (lineParser.hasNext()) {
                    String word = lineParser.next();
                    // map.put(word, lineNumber);
                    //System.out.println(word);
                }
                lineNumber++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("\n\n\nList of words and line numbers");
        Set<String> words1=   map.keySet();
        Iterator<String> iter4 = words1.iterator() ;
        while (iter4.hasNext()) {
            String word = iter4.next();
            List<Integer> lNumber = map.get(word);  // to be completed
            System.out.println(word+" "+ lNumber);

        }
        //size of words?
        System.out.println("Number of words: " + map.size());
    }
}
