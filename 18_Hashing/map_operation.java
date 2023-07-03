import java.util.*;

public class map_operation {
    public static void main(String[] args) {

        // creating a hashMap.
        HashMap<String, Integer> hm = new HashMap<>();
        // HashMap are unorder maps in java . Unorder means its does't follow any
        // order..
        // in hashmap the order is undefine , it's not essential that the order must be
        // acending or decending or which i insert first it's will be display first
        // its display us in any order..

        // Insert ---> Constant Time Operation O(1).
        hm.put("India", 120);
        hm.put("China", 150);
        hm.put("US", 50);

        // Print the map..
        System.out.println(hm);

        // Get ---> O(1)
        int population = hm.get("India");
        System.out.println("The population of India is :" + population);

        // if i write invalid key..
        System.out.println(hm.get("USA")); // Shown us Null Value..


        //ContainsKey ---->O(1).
       
        //Contains key check that the key is exits in our map or not 
        //it will return TRUE OR FALSE value..

        System.out.println(hm.containsKey("China"));
        System.out.println(hm.containsKey("Russia"));

        //Remove -->O(1)

        System.out.println(hm.remove("China")); //return the value of china
        System.out.println(hm);
        
        //Size of Map..
        System.out.println("Map Size is :"+hm.size());
        
        //Clear function ..
        hm.clear();
        
        //Is Empty..
        System.out.println(hm.isEmpty());
        //System.out.println(hm);

    

    }
}
