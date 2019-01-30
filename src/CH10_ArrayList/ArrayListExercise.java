package CH10_ArrayList;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class ArrayListExercise {
    public static void main(String[] args) throws FileNotFoundException {
        File inputFile = new File("C:\\Users\\jderby\\APCS\\src\\CH10_ArrayList\\data");
        Scanner input = new Scanner(inputFile);  //Creates a Scanner to read the data file

        ArrayList<String> wordList = new ArrayList<>();
        while (input.hasNext()) { //Fills up the ArrayList with all Strings in the data file
            wordList.add(input.next());
        }

        System.out.println(wordList);  //Prints list of all words

        /*

        Collections.reverse(wordList); //Reverses list of all words

        System.out.println(wordList);  //Prints list of all reversed words

        for (int i = 0; i < wordList.size(); i++) {  //Goes through all Strings in ArrayList, and if it ends in s(is plural)
            String word = wordList.get(i);           //it replaces the String with one with the s capitalized
            if (word.charAt(word.length() - 1) == 's') {
                wordList.set(i, word.substring(0, word.length() - 1) + "S");
            }
        }

        System.out.println(wordList);  //Prints the reversed list of the words with the plurals' s capitalized

        for (int i = 0; i < wordList.size(); i++) { //Goes through the ArrayList and removes all of the capitalized plurals
            String word = wordList.get(i);
            if (word.charAt(word.length() - 1) == 'S') {
                wordList.remove(i);
            }
        }

        System.out.println(wordList); //Prints out the reversed list with all plurals removed */

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 4, 8, 9, 11, 15, 17, 28, 41, 59));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(4, 7, 11, 17, 19, 20, 23, 28, 37, 59, 81));
        ArrayList<Integer> list3 = intersect(list1,list2);
        System.out.println(list3);


    }

    public static ArrayList<Integer> intersect(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> commonNumbers = new ArrayList<>();
        for(int i = 0; i < list1.size(); i++) {
            if(list2.contains(list1.get(i))) {
                commonNumbers.add(list1.get(i));
            }
        }

        return commonNumbers;

    }

}
