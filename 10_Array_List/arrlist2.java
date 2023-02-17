import java.util.*;
public class arrlist2 {
 public static void main(String[] args) {
    
    ArrayList<Integer> list = new ArrayList<>();

    list.add(10);
    list.add(20);
    list.add(30);
    list.add(40);

    int element = list.get(2);  // get operation perform O(1) time complexity
    System.out.println("The elemet is:"+element);
 }
    
}
