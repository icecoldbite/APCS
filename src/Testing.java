import java.util.Arrays;

public class Testing {
    public static void main(String[] args) {
        int[][] table = new int[5][10];

        for(int row = 0; row < table.length; row++) {
            for(int col = 0; col < table[row].length; col++) {
                table[row][col] = (row + 1) * (col + 1);

            }

        }

        System.out.println(Arrays.deepToString(table));

    }
}
