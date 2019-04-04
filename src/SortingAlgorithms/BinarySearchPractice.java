package SortingAlgorithms;

public class BinarySearchPractice {
    public static void main(String[] args) {
        int [] numArray = {0, 3, 6, 8, 11, 17, 19, 30, 35, 47, 54, 59, 61, 66};
        System.out.println(iterativeBinarySearch(11, numArray));
        System.out.println(recursiveBinarySearch(35, numArray, 0, numArray.length - 1));

    }

    public static int iterativeBinarySearch(int value, int[] array) {
        int minIndex = 0;
        int maxIndex = array.length - 1;

        while(minIndex <= maxIndex) {
            int midIndex = (minIndex + maxIndex) / 2;

            if(array[midIndex] == value) {
                return midIndex;
            }

            else if(array[midIndex] < value) {
                minIndex = midIndex + 1;
            }

            else {
                maxIndex = midIndex - 1;
            }

        }

        return -1;
    }

    public static int recursiveBinarySearch(int value, int[] array, int minIndex, int maxIndex) {
        int midIndex = (minIndex + maxIndex) / 2;

        if(maxIndex < minIndex) {
            return -1;
        }

        else {
            if (array[midIndex] == value) {
                return midIndex;
            }

            else if (array[midIndex] < value) {
                return recursiveBinarySearch(value, array, midIndex + 1, maxIndex);
            }

            else {
                return recursiveBinarySearch(value, array, minIndex, midIndex - 1);
            }
        }

    }





}
