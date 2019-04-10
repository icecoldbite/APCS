package SortingAlgorithms;

import java.util.Arrays;

public class MergeSortPractice {
    public static void main(String[] args) {
        int [] numArray = {0, 3, 6, 8, 11, 17, 19, 30, 35, 47, 54, 59, 61, 66};


    }

    //Create a program that accepts an even array of ints and returns the sorted array
    //Step 1: Split up array until


    public static int[] recursiveMergeSort(int[] array) {
        int[] left = Arrays.copyOfRange(array, 0, array.length/2);
        int[] right = Arrays.copyOfRange(array, array.length/2, array.length);

        if(left.length > 1) {
            recursiveMergeSort(left);
        }

        if(right.length > 1) {
            recursiveMergeSort(right);
        }

        int[] temp = new int[array.length];

        return merge(left, right);

    }

    public static int[] merge(int[] left, int[] right) {
        int i1 = 0;
        int i2 = 0;
        int iTemp = 0;

        int[] temp = new int[left.length * 2];

        while(iTemp < temp.length) {
            if (left[i1] > right[i2]) {
                temp[iTemp] = left[i1];
                i1++;
            }

            else {
                temp[iTemp] = right[i2];
                i2++;
            }

        }

        return temp;

    }

}
