import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class JacksonDerbyPersonalityTest {
    public static void main(String args[]) throws FileNotFoundException {
        //Step 1: Prompt for input file until given a valid file
        Scanner input = new Scanner(new File("personality"));

        //Step 2: Request an output file to which to print the results
        //Leave as system.out for now

        //Step 3: Scan input for name and print name to output
        System.out.println(input.nextLine());

        //Step 4: Go through input and store the number of A answers for each of the four categories and the number of B answers for each of the four categories
        int[] aAnswers = new int[4];
        int[] bAnswers = new int[4];

        //Step 5: Print these values to output formatted to match example

        //Step 6: Compare percentage of B Answers to total answers and print said percentage to output

        //Step 7: Based on percentage, print to output the letter corresponding to their personality type

        //Step 8: Repeat steps 3-7 until there are no more names to process






    }





}
