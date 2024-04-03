

public class PrimeNumCheck {
    public static void main(String[] args) {
        int n = 97;
        printPrimeNumbers(n);
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
   
    public static void printPrimeNumbers(int n){
        for(int i = 1;i<=n;i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }



}
