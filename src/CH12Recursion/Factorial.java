package CH12Recursion;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(reclusionFactorial(4));
        System.out.println(reclusionFactorial(0));


    }


    public static int reclusionFactorial(int x) {
        if(x == 0) {
            return 1;
        }
        else {
            return x * reclusionFactorial(x-1);
        }
    }

}
