
/*
 * An Armstrong number is a number that is equal to the sum of its own digits raised to the power of the number of digits.
 *  For example, 153 is an Armstrong number because 1^3 + 5^3 + 3^3 = 153.
 */
public class AmstrongNumber {
    public static void main(String[] args) {
        int N = 153;
        System.out.println(isAmstrong(N));
    }
    public static boolean isAmstrong(int n){
        int original = n;
        int sum = 0;
        while (n!=0){
            int lastDig = n%10;
            sum += Math.pow(lastDig, 3);
            n = n/10;
        }
        return sum == original;
    }
}
