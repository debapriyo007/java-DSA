public class factorial {
    public static int facotial(int n){
      int f=1;
      for(int i=1;i<=n;i++)
      {
        f=f*i;

      }
      return f;
    }
    public static void main(String[] args) {
        int n=4;
         int f =facotial(n);
         System.out.println("The factorial is:" + f);

    }
    
}
