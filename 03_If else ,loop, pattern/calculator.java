import java.util.*;

public class calculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a = sc.nextInt();
        System.out.println("Enter the operator:");
        char operator= sc.next().charAt(0);
        System.out.println("Enter the second number:");
        int b = sc.nextInt();

        switch(operator)
        {
            case '+':System.out.println("Ans :"+(a+b));
            break;
            case '-':System.out.println("Ans :"+(a-b));
            break;
            case '*':System.out.println("Ans :"+(a*b));
            break;
            case '/':System.out.println("Ans :"+(a/b));
            break;
            case '%':System.out.println("Ans :"+(a%b));
            break;
            default:System.out.println("Enter valid operator");
        }
        sc.close();

    }

}
