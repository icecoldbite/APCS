import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class JacksonDerbySum {

    public static void main(String[] args) throws FileNotFoundException {
        //Step 0: Initialize
        Scanner input = new Scanner(new File("sum"));

        //Step 1: Find largest value in line and create an array to match its length

        while(input.hasNextLine()) {

            String line = input.nextLine();       //Creates a scanner for the line of the file
            Scanner lineSC = new Scanner(line);
            boolean needsPlusSign = false;

            int[] finalNumber = new int[findMaxDigitLength(input, line)];

            //Step 2: While there is a value to be processed, add it onto the array digit by digit
            while (lineSC.hasNext()) {

                if (needsPlusSign) {
                    System.out.print(" + ");
                }

                finalNumber = addNextValueInFile(finalNumber, lineSC);

                needsPlusSign = true;

            }


            //Step 3: Once completed with the additions, go from right to left checking if the value is more than ten until reaching the last value of the array

            for (int i = finalNumber.length - 1; i > 0; i--) {
                while (finalNumber[i] >= 10) {
                    finalNumber[i - 1]++;
                    finalNumber[i] = finalNumber[i] - 10;  //Step 3a: If it is, subtract ten from the value, and increment the value to the left by one
                }

            }

            //Step 4: Print out each integer individually on the same line to form the output

            System.out.print(" = ");

            for (int i = 0; i < finalNumber.length; i++) {
                System.out.print(finalNumber[i]);
            }

            System.out.println();

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
        String numberToAdd = lineSC.next();

        System.out.print(numberToAdd);

        int initialLength = numberToAdd.length();

        for(int i = 1; i <= initialLength; i++) {
            finalNumber[finalNumber.length - i] = finalNumber[finalNumber.length - i] + Character.getNumericValue(numberToAdd.charAt(numberToAdd.length() - 1));

            numberToAdd = numberToAdd.substring(0, numberToAdd.length() - 1);
        }



        return finalNumber;
    }



}
