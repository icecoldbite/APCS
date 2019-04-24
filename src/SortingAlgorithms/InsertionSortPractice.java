package SortingAlgorithms;

import java.util.Arrays;

public class InsertionSortPractice {
    public static void main(String[] args) {
        int [] numArray = { 101, 59, 65, 32, 45, 12, -3, -24, 87};
        insertionSort(numArray);
        System.out.println(Arrays.toString(numArray));
    }

    public static void insertionSort(int[] array) {
        for(int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i - 1;

            while(j >= 0 && array[j] > temp) {
                array[j + 1] = array[j];
                j = j - 1;

            }

            array[j + 1] = temp;
        }

    }
}
