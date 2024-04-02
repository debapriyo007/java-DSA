

public class PrimeNumCheck {
    public static void main(String[] args) {
        int n = 97;
        System.out.println(isPrime(n));
    }
    public static boolean isPrime(int n){
        int count = 0;
        for(int i = 1;i<= n;i++){
            if(n%i ==0){
                count++;
            }
        }
        if(count == 2){
            return true;
        }else{
            return false;
        }
    }


}
