

public class PalindromNumerCheck {
    public static void main(String[] args) {
        int N = 1112;
        int reverseNum = revNum(N);
        
        if (N == reverseNum) {
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
    public static int revNum(int n){
        int rev = 0;
        while (n!=0) {
            int lastDig = n%10;
            rev  = (rev*10)+lastDig;
            n = n/10;
        }
        return rev;
    }
}
