import java.util.Scanner;

public class sum_of_first_n_num {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n num:");
        int n = sc.nextInt();
        int sum = 0;
          int i = 1;
        while (i <= n) {
            sum = sum + i;
            i++;
            
        }
        System.out.println("The sum is:" + sum);
        sc.close();
        
        

    }

}
