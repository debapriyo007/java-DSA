public class prbl_02 {

    public static void acendOrder(int n){
        if(n==1){
            System.out.println(n+ " ");
            return;
        }
        acendOrder(n-1);
        System.out.println(n + " ");
    }
    public static void main(String[] args) {
        acendOrder(5);
    }
    
}
