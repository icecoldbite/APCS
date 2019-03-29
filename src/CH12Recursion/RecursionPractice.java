package CH12Recursion;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class RecursionPractice {

    public static void main(String[] args) {
        System.out.println(i(12));

    }

    public static int i(int x) {
        if(x < 4) {
            return x +4;
        }

        else if(x <= 6) {
            return i(x+2) + 1;
        }

        else {
            return 2 * i(x-3) - 3;
        }

    }
}
