
public class ReverseNumber {
    public static void main(String[] args) {
        int N = 9987;
        System.out.println(reverseNum(N));

    }
    public static int reverseNum(int n){
        int revNum = 0;
        while (n!=0){
            int lastDig = n%10;
            revNum = (revNum*10) + lastDig;
            n = n/10;
        }
        return revNum;
    }
}
