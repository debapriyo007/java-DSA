public class prbl_10 {

    public static int optimizePow(int x, int n){
        if(n==0){
            return 1;
        }
        int half = optimizePow(x, n/2);
        int half_sqr = half*half;
        if(n%2 !=0){
            half_sqr = x *half_sqr;
        }
        return half_sqr;
    }
    public static void main(String[] args) {
        int x =2;
        int n=5;
        System.out.println(optimizePow(x, n));
    }
    
}
