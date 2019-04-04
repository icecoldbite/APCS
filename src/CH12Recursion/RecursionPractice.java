package CH12Recursion;


public class RecursionPractice {

    public static void main(String[] args) {
        System.out.println(pow(3, 4));

    }

    public static int i(int x) {
        if(x < 4) {
            return x + 4;
        }

        else if(x < 6) {
            return (i(x+2) + 1);
        }

        else {
            return ((2 * i(x-3)) - 3);
        }

    }

    public static void stars(int numOfStars) {
        if(numOfStars == 0) {
            System.out.println();
        }

        else {
            System.out.print("*");
            stars(numOfStars-1);
        }
    }

    public static int pow(int base, int power) {
        if(power == 0) {
            return 1;
        }

        else {
            return base * pow(base, power - 1);
        }
    }
}
