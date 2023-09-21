public class ReverseString {
    public static String reverse(String x){
          StringBuilder sb = new StringBuilder(x);
          sb.reverse();
          return sb.toString();
       
    }
    public static void main(String[] args) {
        String str = "abcd";
        System.out.println(reverse(str));

    }
}
