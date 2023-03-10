public class prbl_4 {

    public static int sumofNums(int n){
        if(n==1){
            return 1;
        }
        int f=sumofNums(n-1);
        int fn = n+f;
        return fn ;
    }
    public static void main(String[] args) {
        System.out.println("Sum of first n numbers:"+ sumofNums(5));

    }
    
}
