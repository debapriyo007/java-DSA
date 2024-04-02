// Print all the divisors of a number N.
// ex: N = 10
// 1 2 5 10

public class PrintAllDivisor {
    public static void main(String[] args) {
        int N = 36;
        printDivisor(N);
    }

    //Time Complexity: O(n)
    public static void printDivisor(int n){
        for (int i = 1; i <= n; i++) {
            if (n%i == 0) {
                System.out.print(i+" ");
            }
        }
    }
    //optimized solution
    //Time Complexity: O(sqrt(n))
}
