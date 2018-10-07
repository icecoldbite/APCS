import java.util.Arrays;

public class ArrayTransversalPractice {
    public static void main(String[] args) {
        int[] a = {5, 2, 4, 1, 3, 12, 67, 34, 89, 0, 1};
        int[] sortedArray = oliverSort(a);
        int[] sortedArray2 = gabbySort(a);

        System.out.println(Arrays.toString(sortedArray));
        System.out.println(Arrays.toString(sortedArray2));
    }

    public static int[] oliverSort(int[] array) {
        int[] temp = new int[array.length];
        int swapCount = 0;

        for(int i = array.length - 1; i >= 0; i--) {
            temp[swapCount] = array[i];
            swapCount = swapCount + 1;

        }

        return temp;

    }

    public static int[] gabbySort(int[] array) {
        for(int i = 0; i < array.length/2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        return array;
    }

}
