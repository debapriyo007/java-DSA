
//Call by value

public class swap {
    public static void Swap (int a, int b){
      int tem =a;
      a=b;
      b=tem;
      System.out.println("a=" + a);
      System.out.println("b=" + b);
    }
public static void main(String[] args) {
    
     int a =10;
     int b=8;
    Swap(a, b);

}
    
}
