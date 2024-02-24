// import java.util.*;
public class largest {

    public static int get_largest(int num[]) {
        int large = Integer.MIN_VALUE;
        int smalest = Integer.MAX_VALUE;

        for (int i = 0; i < num.length; i++) {
            if (num[i] > large)
                large = num[i];

            if (num[i] < smalest)
                smalest = num[i];

        }
        System.out.println("The smallest num is:" + smalest);
        return large;
    }

    public static void main(String[] args) {

        int num[] = { 10, 2, 6, 3, 5 };

        System.out.println("The largest number is:" + get_largest(num));
    }

}
