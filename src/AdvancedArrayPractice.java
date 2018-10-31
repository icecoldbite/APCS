import java.util.Arrays;

public class AdvancedArrayPractice {
    public static void main(String[] args) {

    }

    public static int mostFrequentDigit(int number) {
        String numberString = Integer.toString(number);  //Creates a string of the number in order to easily get the length for the array
        int[] numArray = new int[numberString.length()];  //Creates the array that can fit every digit of the number

        for(int i = 0; i < numArray.length; i++) { //Goes through the number from right to left, adding the values into the array
            int tempLastDigit = number % 10;
            numArray[i] = tempLastDigit;
            number = number / 10;

        }

        Arrays.sort(numArray);    //Sorts in numerical order

        int mostCommonDigit = -1;
        int currentNumberOfTimesAppeared = 0;  //Initializes the variables needed in order to keep track of the most common digit
        int maxNumberOfTimesAppeared = 0;

        int digitCounter = 0;

        for(int i = 0; i < numArray.length; i++) {
            if(numArray[i] == digitCounter) {   //If we are still on the same value(digitCounter), increase the number of times that value has appeared by 1
                currentNumberOfTimesAppeared += 1;

                if(currentNumberOfTimesAppeared > maxNumberOfTimesAppeared) { //If that number is above the current previous record, set the old record to this new number of appearances
                    maxNumberOfTimesAppeared = currentNumberOfTimesAppeared;
                    mostCommonDigit = numArray[i];             //Then set the most common digit to the value we're currently on
                }
            }

            else {    //If we are no longer on the same value(we have moved to the next digit in the chain), then set the current digit being processed to the new value
                digitCounter = numArray[i];
                i = i - 1;   //Go back one in the list so we don't skip over it
                currentNumberOfTimesAppeared = 0; //Reset the current number of appearances back to 0 in preparation for tallying
            }

        }

        return mostCommonDigit;
    }
}
