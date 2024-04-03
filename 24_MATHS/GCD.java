public class GCD {
    public static void main(String[] args) {
        int n1 = 20;
        int n2 = 15;
        System.out.println(FindGCD_Optimal(n1, n2));
    }

    //Write the Optimal Approach which is "Euclidean Algorithm."
    //Time Complexity - 0(log base phi(min(n1, n2))
    public static int FindGCD_Optimal(int n1, int n2){
        while (n1>0 && n2>0) {
            if(n1>n2){
                n1 = n1%n2;
            }else{
                n2 = n2%n1;
            }
        }
        if(n1 == 0){
            return n2;
        }else{
            return n1;
        }
    }

    //find the GCD of n1, n2.
    //Brute force approach
    //Time Complexity - O(min(n1, n2))
    public static int FindGCD(int n1, int n2){
        int gcd = 1;
        for(int i =1;i<=Math.min(n1, n2);i++){
            if(n1%i == 0 && n2%i == 0){
                gcd = i;
            }
        }
        return gcd;
    }
}
