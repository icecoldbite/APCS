//This program will output an average temperature and the days above said average given a imputed number of temperature data values

import java.util.Scanner;

public class JacksonDerbyWeatherAnalysis {
    public static void main(String[] args) {
        //Step 1: Ask for days and create an array of matching length
        Scanner input = new Scanner(System.in);
        int days = askForDays(input);
        int[] tempLog = new int[days];

        //Step 2: Prompt user for required temperatures and add to array, summing the numbers
        double tempTotal = tempSum(input, days, tempLog);

        //Step 3: Calculate average
        double avgTemp = tempTotal / days;

        //Step 4: Compare recorded temperature to average
        int daysOver = calculateDaysOverAvgTemp(days, tempLog, avgTemp);

        //Step 5: Print out average temperature and days above average
        System.out.println("Average temp = " + Math.round(avgTemp * 10) / 10.0);
        System.out.println(daysOver + " days were above average.");

    }

    public static double tempSum(Scanner input, int days, int[] tempLog) {  //Takes a scanner and an array of ints and prompts user to fill out the array until all boxes are filled. Will add up all values and return the sum as well
        double tempTotal = 0.0;
        for (int i = 1; i <= days; i++) {
            System.out.print("Day " + i + "'s high temp: ");
            int temp = input.nextInt();
            tempTotal = tempTotal + temp;
            tempLog[i - 1] = temp;

        }

        return tempTotal;
    }

    public static int askForDays(Scanner input) {         //Takes a scanner, prompts user for number of inputs, and returns said value
        System.out.print("How many days' temperatures?");
        return input.nextInt();

    }

    public static int calculateDaysOverAvgTemp(int days, int[] tempLog, double avgTemp) {   //Goes through given array and, given an avg to compare to, will tally every value in the array above avg, returning said value
        int daysOver = 0;
        for (int i = 1; i <= days; i++) {
            if (tempLog[i - 1] > avgTemp) {
                daysOver = daysOver + 1;
            }
        }
        return daysOver;
    }

}
