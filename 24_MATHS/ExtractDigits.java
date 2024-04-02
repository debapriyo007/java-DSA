/**
 * ExtractDigits:
 * Question : "Count Digits"
 */
public class ExtractDigits {

    public static void main(String[] args) {
        int N = 77789;
        System.out.println(countDigits(N)); 

    }

    public static int  countDigits(int n){
        int count = 0;

        while(n!=0){
            int lastDigit = n%10;
            count++;
            System.out.println("Last Digitclear :"+lastDigit);
            n = n/10;
        }
        return count;
    }
}