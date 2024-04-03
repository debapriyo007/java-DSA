

public class PrintPrimeFactors {
    public static void main(String[] args) {
       int n = 60; 
       primeFactorPrint(n);
    }


    public static void primeFactorPrint(int n){
        for(int i = 1;i<= n;i++){
            if(n% i == 0 && isPrime(i)){
                System.out.println(i);
            }
        }
        System.out.println();
    }


    public static boolean isPrime(int n){
        int count = 0;
        for(int i = 1;i<= n;i++){
            if(n%i == 0){
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
