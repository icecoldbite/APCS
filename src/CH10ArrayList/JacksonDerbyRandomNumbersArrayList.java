package CH10ArrayList;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class JacksonDerbyRandomNumbersArrayList {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Integer> numberList = new ArrayList<Integer>();
        File inputFile = new File("C:\\Users\\JPD\\IdeaProjects\\APCS\\src\\CH10ArrayList\\randomNumbers");
        Scanner input = new Scanner(inputFile);  //Creates a scanner to read the given data file and an ArrayList in which to store the values

        while(input.hasNextInt()) {  //Adds all values to the ArrayList
            numberList.add(input.nextInt());
        }

        System.out.println(numberList);

        int sum = 0;
        int highestValue = Integer.MIN_VALUE;  //Creates the variables needed for the later parts of the problem
        int lowestValue = Integer.MAX_VALUE;
        int initialSize = numberList.size();

        for(int i = 0; i < numberList.size(); i++) {  //Goes through every value in the ArrayList, summing up the values, finding the highest and lowest values in the list, and removing any multiples of 2
            int temp = numberList.get(i);
            sum+=temp;

            if(temp > highestValue) {
                highestValue = temp;
            }

            if(temp < lowestValue) {
                lowestValue = temp;
            }

            if(temp % 2 == 0) {
                numberList.remove(i);  //Removes the multiple of 2 and sets the index back by 1 to account for the missing index(so that it doesn't skip over values)
                i--;
            }

        }

        System.out.println("Average: " + (double)sum/initialSize);  //Prints the average using the saved initial length of the ArrayList(not the size of the one with the multiples of 2 deleted)

        System.out.println("min: " + lowestValue); //Prints out remaining needed fields in proper format
        System.out.println("max: " + highestValue);
        System.out.println(numberList);



    }
}
