import java.util.*;
public class iteration_on_HM {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();

        hm.put("India", 100);
        hm.put("Nepal", 40);
        hm.put("UK", 70);
        hm.put("China", 150);
        hm.put("USA", 80);

        //Iterate in this map..
        Set<String> keys =  hm.keySet();

        //printing the keys..
        System.out.println(keys);

        for (String k : keys) { //for each loop..
            System.out.println("key: " + k + "," + " value:" + hm.get(k));
        }
    }
}
