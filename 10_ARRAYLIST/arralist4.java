import java.util.*;
public class arralist4 {
    public static void main(String[] args) {
    
        ArrayList<Integer> list = new ArrayList<>();
    
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println("The actual arrayList :"+list);
        
        //Set  element ... 
        //This function Linera Time complixity O(n)..
        
        list.set(2,100);
        System.out.println("After set value the arrayList is:"+list);


      
     }  
    
}
