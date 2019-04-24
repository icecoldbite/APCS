package SortingAlgorithms;

import java.util.Arrays;

public class SelectionSortPractice {
    public static void main(String[] args) {
        int [] numArray = { 101, 59, 65, 32, 45, 12, -3, -24, 87};
        System.out.println(Arrays.toString(numArray));
        selectionSort(numArray);
        System.out.println(Arrays.toString(numArray));
    }

    public static void selectionSort(int[] array) {
        int destinationIndex = 0;

        for(int i = 0; i < array.length; i++) {
            int minimum = array[destinationIndex];
            int minIndex = destinationIndex;

            for(int j = destinationIndex; j < array.length; j++) {
                if(array[j] <= minimum) {
                    minimum = array[j];
                    minIndex = j;
                }
            }

            int temp = array[destinationIndex];
            array[destinationIndex] = minimum;
            array[minIndex] = temp;

            destinationIndex++;

        }
    }

}
