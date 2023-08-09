import java.util.*;

public class prb1 {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 2, 5, 1, 3, 1, 5, 1 };

        // creating a HashMap.
        HashMap<Integer, Integer> map = new HashMap<>();
        // iterate the loop..
        
        for (int i = 0; i < arr.length; i++) {
            // if (map.containsKey(arr[i])) { // if in the map key are exists.
            //     // then put the key and update the frequency or u can say count..
            //    map.put(arr[i], map.get(arr[i]) + 1);
            // } else {
            //     // if that's not happen the put the key with frequency with 1..
            //     map.put(arr[i], 1);
            // }
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
 
        //Set<Integer> keySet = map.keySet();
        for (Integer key : map.keySet()) { // for each loop
            if (map.get(key) > arr.length / 3) {
                System.out.println("Majority element is: " + key);
            }
        }

    }
}
