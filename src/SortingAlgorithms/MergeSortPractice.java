package SortingAlgorithms;

import java.util.Arrays;

public class MergeSortPractice {
    public static void main(String[] args) {
        int [] numArray = { 101, 59, 65, 32};
        recursiveMergeSort(numArray);
        System.out.println(Arrays.toString(numArray));


    }



    public static void recursiveMergeSort(int[] array) {
        if(array.length > 1) {
            int[] left = Arrays.copyOfRange(array, 0, array.length/2);
            int[] right = Arrays.copyOfRange(array, array.length/2, array.length);

            recursiveMergeSort(left);
            recursiveMergeSort(right);

            merge(array, left, right);

        }


    }

    public static void merge(int[] array, int[] left, int[] right) {
        int i1 = 0;
        int i2 = 0;

        for(int i = 0; i < array.length; i++) {
            if(i2 >= right.length || (i1 < left.length && left[i1] < right[i2])) {
                array[i] = left[i1];
                i1++;


            }

            else {
                array[i] = right[i2];
                i2++;
            }
        }


    }
}
