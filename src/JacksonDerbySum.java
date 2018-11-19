import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class JacksonDerbySum {

    public static void main(String[] args) throws FileNotFoundException {
        //Step 0: Initialize
        Scanner input = new Scanner(new File("sum"));

        //Step 1: Find largest value in line and create an array to match its length

        while(input.hasNextLine()) {
            String line = input.nextLine();       //Creates a scanner for the line of the file
            Scanner lineSC = new Scanner(line);
            boolean needsPlusSign = false;   //Boolean that keeps track of whether a plus sign is needed between the printed values

            int[] finalNumber = new int[findMaxDigitLength(input, line)]; //Creates an array to keep track of sum based on the largest number of digits on the line

            //Step 2: While there is a value to be processed, add it onto the array digit by digit
            while (lineSC.hasNext()) {

                if (needsPlusSign) {   //Checks boolean(Always false first time, true for all subsequent times)
                    System.out.print(" + ");
                }

                finalNumber = addNextValueInFile(finalNumber, lineSC); //Adds value onto array

                needsPlusSign = true;   //Toggles boolean to add variables before subsequent values
            }

            //Step 3: Once completed with the additions, go through array and get rid of values ten or more, incrementing the next value place

            finalNumber = incrementArray(finalNumber);

            //Step 4: Prints output

            printArray(finalNumber);

        }


    }

    public static int findMaxDigitLength(Scanner input, String line) {
        Scanner lineSCTemp = new Scanner(line);    //Creates a separate scanner for the line of the file to prevent modification of the original line

        int maxDigit = 0;

        while(lineSCTemp.hasNext()) {           //Goes through values in line to find the value of the highest digit count
            String temp = lineSCTemp.next();
            if (temp.length() > maxDigit) {
                maxDigit = temp.length();
            }
        }


        return maxDigit;
    }

    public static int[] addNextValueInFile(int[] finalNumber, Scanner lineSC) {
        String numberToAdd = lineSC.next(); //Creates a string to be processed, converted to int, and added onto array

        System.out.print(numberToAdd);  //Prints this number to create a log of added numbers in the output

        int initialLength = numberToAdd.length(); //Length of string

        for(int i = 1; i <= initialLength; i++) { //Going from right to left in the array, take the character at the right end of the string, convert it to an int, and add it to its proper value place
            finalNumber[finalNumber.length - i] = finalNumber[finalNumber.length - i] + Character.getNumericValue(numberToAdd.charAt(numberToAdd.length() - 1));

            numberToAdd = numberToAdd.substring(0, numberToAdd.length() - 1);  //Remove the character that was just processed from the string
        }  //For loop goes for number of digits to process in string/the length of the string, ensuring no out of bounds errors

        return finalNumber;
    }

    public static int[] incrementArray(int[] finalNumber) {  //Goes from right to left checking if the value is more than or equal to ten until reaching the last value of the array
        for (int i = finalNumber.length - 1; i > 0; i--) {
            while (finalNumber[i] >= 10) {
                finalNumber[i - 1]++;
                finalNumber[i] = finalNumber[i] - 10;  //If it is >=10, subtract ten from the value, and increment the value to the left by one
            }

        }
        return finalNumber;
    }

    public static void printArray(int[] finalNumber) {  //Prints out the equals sign and each integer individually on the same line to form the output
        System.out.print(" = ");

        for (int i = 0; i < finalNumber.length; i++) {
            System.out.print(finalNumber[i]);
        }

        System.out.println();
    }



}
