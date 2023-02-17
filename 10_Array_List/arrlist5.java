
import java.util.*;
public class arrlist5 {
    public static void main(String[] args) {
    
        ArrayList<Integer> list = new ArrayList<>();
    
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println("ArrayList :"+list);
        
        // Contains operation takes Linear Time complexity O(n)....
        
        System.out.println(list.contains(1));
        System.out.println(list.contains(10));
        


      
     }
    
}
