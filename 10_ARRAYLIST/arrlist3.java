import java.util.*;
public class arrlist3 {
    public static void main(String[] args) {
    
        ArrayList<Integer> list = new ArrayList<>();
    
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println("The actual arrayList :"+list);
        
        //Remove element ... 
        //This function Linera Time complixity O(n)..
        
        list.remove(2);
        System.out.println("After removeing the arrayList is:"+list);


      
     }
    
}
