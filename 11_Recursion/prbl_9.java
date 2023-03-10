public class prbl_9 {


    //calculate power..

    public static int power(int x , int n){
        if(n==0){
            return 1;
        }
        int xnm1= power(x, n-1);
        return x*xnm1;
    }
    public static void main(String[] args) {
        System.out.println(power(2, 10));
    }
    
}
