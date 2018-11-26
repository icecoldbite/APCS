import java.io.*;
import java.util.Scanner;
import java.io.PrintStream;

public class JacksonDerbyPersonalityTest {
    public static void main(String args[]) throws FileNotFoundException {
        //Step 1: Prompt for input file until given a valid file
        Scanner input = new Scanner(requestFile()); //Creates a scanner using requested file name

        //Step 2: Request an output file to which to print the results
        PrintStream writer = new PrintStream(requestOutput()); //Creates a PrintStream to output to the requested file name, creating the file if it does not exist

        while(input.hasNextLine()) { //While there is a survey to process

            //Step 3: Scan input for name and print name to output
            writer.println(input.nextLine());

            //Step 4: Go through input and store the number of A answers for each of the four categories and the number of B answers for each of the four categories
            int[] aAnswers = new int[4];  //Creates two arrays to store the a and b answers, with spots for each of the four categories
            int[] bAnswers = new int[4];
            sortAnswers(aAnswers, bAnswers, input); //Modifies arrays to match number of a and b answers


            //Step 5: Print these values to output formatted to match example
            writer.println(aAnswers[0] + "A-" + bAnswers[0] + "B " + aAnswers[1] + "A-" + bAnswers[1] + "B " + aAnswers[2] + "A-" + bAnswers[2] + "B " + aAnswers[3] + "A-" + bAnswers[3] + "B ");

            //Step 6: Compare percentage of B Answers to total answers and print said percentage to output
            int percentageOne = calculatePercent(aAnswers, bAnswers, 0);
            int percentageTwo = calculatePercent(aAnswers, bAnswers, 1);
            int percentageThree = calculatePercent(aAnswers, bAnswers, 2);
            int percentageFour = calculatePercent(aAnswers, bAnswers, 3);

            printPercentage(percentageOne, percentageTwo, percentageThree, percentageFour, writer); //Prints percentages in proper format

            //Step 7: Based on percentage, print to output the letter corresponding to their personality type
            writer.println(createType(percentageOne, percentageTwo, percentageThree, percentageFour));

        }

    }

    public static void sortAnswers(int[] aAnswers, int[] bAnswers, Scanner input) { //Sums up all a and b answers, modifying their corresponding arrays in the process
        String answers = input.nextLine();  //Creates a string to be read though out of the given answers

        for(int i = 0; i < 10; i++) {  //For each chunk of 7 letters, process them in the given sequence and add them to the arrays accordingly

            char temp = answers.charAt(i * 7);
            if(temp == 'A') {
                aAnswers[0]++;
            }
            else {
                bAnswers[0]++;
            }
            temp = answers.charAt((i * 7) + 1);
            if(temp == 'A') {
                aAnswers[1]++;
            }
            else {
                bAnswers[1]++;
            }
            temp = answers.charAt((i * 7) + 2);
            if(temp == 'A') {
                aAnswers[1]++;
            }
            else {
                bAnswers[1]++;
            }
            temp = answers.charAt((i * 7) + 3);
            if(temp == 'A') {
                aAnswers[2]++;
            }
            else {
                bAnswers[2]++;
            }
            temp = answers.charAt((i * 7) + 4);
            if(temp == 'A') {
                aAnswers[2]++;
            }
            else {
                bAnswers[2]++;
            }
            temp = answers.charAt((i * 7) + 5);
            if(temp == 'A') {
                aAnswers[3]++;
            }
            else {
                bAnswers[3]++;
            }
            temp = answers.charAt((i * 7) + 6);
            if(temp == 'A') {
                aAnswers[3]++;
            }
            else {
                bAnswers[3]++;
            }

        }
    }

    public static int calculatePercent(int[] aAnswers, int[] bAnswers, int index) {
        return (int)((bAnswers[index] / ((double)bAnswers[index] + aAnswers[index])) * 100); //Returns percentage of b answers to total answers as an int
    }

    public static String createType(int percentageOne, int percentageTwo, int percentageThree, int percentageFour) { //Goes through each percentage, assigning a letter tot hat person based on the values of those specific categories
        String type = "";

        if (percentageOne > 50) {
            type += 'I';
        }
        else if(percentageOne < 50) {
            type += 'E';
        }
        else {
            type += 'X';
        }

        if (percentageTwo > 50) {
            type += 'N';
        }
        else if(percentageTwo < 50) {
            type += 'S';
        }
        else {
            type += 'X';
        }

        if (percentageThree > 50) {
            type += 'F';
        }
        else if(percentageThree < 50) {
            type += 'T';
        }
        else {
            type += 'X';
        }

        if (percentageFour > 50) {
            type += 'P';
        }
        else if(percentageFour < 50) {
            type += 'J';
        }
        else {
            type += 'X';
        }

        return type;
    }

    public static void printPercentage(int percentageOne, int percentageTwo, int percentageThree, int percentageFour, PrintStream writer) { //Prints the percentages in the proper format
        writer.print("[" + percentageOne + "%, ");
        writer.print(percentageTwo + "%, ");
        writer.print(percentageThree + "%, ");
        writer.print(percentageFour + "%] = ");
    }

    public static File requestFile(){   //Finds the name of the input file
        Scanner input = new Scanner(System.in); //Initializes needed scanner
        boolean exists;

        System.out.print("Input File Name: "); //Asks for file name and creates a file to match
        String fileName = input.next();
        File inputFile = new File(fileName);
        exists = inputFile.exists(); //Checks to see if file exists

        while(!exists) { //If the file did not exist, continue prompting for file until they give a value that does fit
            System.out.print("File not found. Try again: ");
            fileName = input.next();
            inputFile = new File(fileName);
            exists = inputFile.exists();
        }


        return inputFile;

    }

    public static String requestOutput() { //Requests the name of the output file to be created and printed to
        System.out.print("Output name: ");
        Scanner fileNameInput = new Scanner(System.in);
        return fileNameInput.next();
    }


}
