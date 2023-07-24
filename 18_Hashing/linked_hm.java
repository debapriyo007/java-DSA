import java.util.*;
public class linked_hm{
    public static void main(String[] args) {
        
        LinkedHashMap <String, Integer> lhm = new LinkedHashMap<>();
        //in linked hashmap the way you insert the simmilar way result printing..
        lhm .put("India", 100);
        lhm .put("Australia", 160);
        lhm .put("England", 60);


        HashMap <String, Integer> hm = new HashMap<>();  //here Random order it's printing.
        hm .put("India", 100);
        hm .put("Australia", 160);
        hm .put("England", 60);

        //Tree Map..
        TreeMap<String , Integer > thm = new TreeMap<>();
        //The treeMap is implemented using Red - Black BST ..
        //In TreeMap value are sorted according to 'Key' alphabetical  order like- A B C D E F G ..X Y Z.
         thm .put("India", 100);
         thm .put("Australia", 160);
         thm .put("England", 60);

        System.out.println(lhm);
        System.out.println(hm);
        System.out.println(thm); // print base on 'key'..
    }
}