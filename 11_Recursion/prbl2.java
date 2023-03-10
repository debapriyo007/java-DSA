public class prbl2 {

    public static void incrOrder(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        incrOrder(n-1);
        System.out.print(n+ " ");
    }
    public static void main(String[] args) {
     
        int n=10;
        incrOrder(n);
    }
    
}
