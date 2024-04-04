public class CountPrimes {
    public static void main(String[] args) {
        int n = 10;
        printPrimes(n);
    }
    static void printPrimes(int n){
        int count = 0;
        boolean[] isPrime = new boolean[n+1];
        for(int i=0; i<=n; i++){
            isPrime[i] = true;
        }
        isPrime[0] = false;
        isPrime[1] = false;
        for(int i=2; i*i<=n; i++){
            if(isPrime[i]){
                for(int j=i*i; j<=n; j+=i){
                    isPrime[j] = false;
                }
            }
        }
        for(int i=0; i<=n; i++){
            if(isPrime[i]){
                System.out.println(i + " ");
                count++;
            }
        }
        System.out.println("No of Primes are :"+ count);
    }
}
