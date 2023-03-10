public class prbl_14 {

  public static void binString(int n , int lastplace, String str){
    //base case..
    if(n==0){
        System.out.println(str);
        return;
    }
    binString(n-1, 0, str+"0");
    if(lastplace ==0){
        binString(n-1, 1, str+"1");
    }
  }


    public static void main(String[] args) {
        binString(3, 0, "");
    }
    
}
