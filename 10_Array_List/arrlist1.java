


// create an Array-List and print all element...
import java.util.*;
public class arrlist1 {
    public static void main(String[] args) {
        // This an integer array list ..
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);  // to add an element  the time complexity became 0(1)..
        list.add(1);
        list.add(20);
        list.add(30);
        System.out.println(list);

        // This is an string type array list..
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Raa");
        list2.add("snoop dog ");
        list2.add("Rakim");
        list2.add("pac");
        System.out.println(list2);
    }
    
}
