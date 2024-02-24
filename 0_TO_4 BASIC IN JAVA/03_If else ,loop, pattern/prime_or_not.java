import java.util.*;

public class prime_or_not {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();

        if (n == 2) {
            System.out.println("The number  prime!");

        } else {
            boolean is_prime = true;
            for (int i = 2; i <=Math.sqrt(n); i++) {
                if (n % 2 == 0) {
                    is_prime = false;
                }
            }

            if (is_prime == true) {
                System.out.println("The number is prime!");

            } else {
                System.out.println("The number is not prime!");
            }

        }

        sc.close();
    }

}
