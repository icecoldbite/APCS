import java.util.Arrays;

public class RandomArrayGeneration {
    public static void main(String[] args) {
        int max = 10;
        int min = 1;
        int maxLength = 10;
        int minLength = 1;
        int lengthRange = (maxLength - minLength) + minLength;  //Sets range for array length and the numbers within, following (max - min) + min format
        int numRange = (max - min) + min;

        int arrayLength = (int)(Math.random() * lengthRange) + minLength;  //Generates
        int[] randomStorageTM = new int[arrayLength];

        for(int i = 0; i < randomStorageTM.length; i++) {
            randomStorageTM[i] = (int)(Math.random() * numRange) + min;
        }
        System.out.print(Arrays.toString(randomStorageTM));

    }
}



