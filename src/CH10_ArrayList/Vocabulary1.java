package CH10_ArrayList;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Vocabulary1 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner file1 = new Scanner(new File("C:\\Users\\jderby\\APCS\\src\\CH10_ArrayList\\text1.txt"));
        Scanner file2 = new Scanner(new File("C:\\Users\\jderby\\APCS\\src\\CH10_ArrayList\\text2.txt"));

        ArrayList<String> list1 = getWords(file1);
        ArrayList<String> list2 = getWords(file2);

        System.out.println(list1);
        System.out.println(list2);

        ArrayList<String> combinedList = overlap(list1, list2);

        System.out.println(combinedList);
        System.out.println(calculatePercentOverlap(combinedList, list1));
    }

    public static ArrayList<String> getWords(Scanner file) { //Given a file, will return a sorted ArrayList removed of duplicates
        ArrayList<String> words = new ArrayList<>();

        file.useDelimiter("[^a-zA-Z']");

        while(file.hasNext()) {
            words.add(file.next().toLowerCase());    //Creates an ArrayList and populates it with all words from the file(in lowercase)
        }

        Collections.sort(words); //Sorts the filled ArrayList

        ArrayList<String> uniqueWords = new ArrayList<>(); //Creates an ArrayList to store the unique words of the list

        if(words.size() > 0) {  //If there are words,add the first word(will always be unique)
            uniqueWords.add(words.get(0));
        }

        for(int i = 1; i < words.size(); i++) {  //Go through every other word, and if the word is not the same as the word in the
            if(!(words.get(i).compareTo(words.get(i-1)) == 0)) {  //previous index(is a new, unique word in the sorted list)
                uniqueWords.add(words.get(i));                    //add the word to the unique words list
            }
        }

        return uniqueWords;  //returns the sorted, lowercase list of all unique words in the given file
    }

    public static ArrayList<String> overlap(ArrayList<String> list1, ArrayList<String> list2) {
        ArrayList<String> overlappedWords = new ArrayList<>();
        int index1 = 0;
        int index2 = 0;

        while(index1 < list1.size() && index2 < list2.size()) {
            int compareToTemp = list1.get(index1).compareTo(list2.get(index2));

            if(compareToTemp == 0) {
                overlappedWords.add(list1.get(index1));
                index1++;
                index2++;
            }

            else if(compareToTemp < 0) {
                index1++;
            }

            else {
                index2++;
            }

        }

        return overlappedWords;
    }

    public static double calculatePercentOverlap(ArrayList<String> overlapList, ArrayList<String> compareList) {
        return ((double) overlapList.size() / compareList.size()) * 100;
    }
}
