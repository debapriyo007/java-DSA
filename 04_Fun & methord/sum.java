import java.util.*;
public class sum {
    public static int add(int num1, int num2){ // parameter or formal parameters
    int sum =num1+num2;
    return sum;
    }
public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int a= sc.nextInt();
    int b= sc.nextInt();
    int sum= add(a, b); // argument or acctual parameter
    System.out.println("The sum is:"+ sum  );
    sc.close();

}
    
}
