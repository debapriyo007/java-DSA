import java.util.Scanner;

public class utill_multi_ten {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter the number:");
            int n = sc.nextInt();
            if (n % 10 == 0) {
                System.out.println("You did't enter multiple of 10");
                break;
            }
            System.out.println(n);
        } while (true);
        sc.close();

    }

}
