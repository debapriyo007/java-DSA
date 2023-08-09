import java.util.*;
public class prb5 {
    public static void main(String[] args) {
        int arr[] ={10, 2, -2, -20, 10};
        int k = -10;

        HashMap<Integer, Integer> map = new HashMap<>();//creating a hashmap..
        map.put(0, 1); //put the key 0 and value 1 because if the length of array is equal to my whole array..
        int sum = 0;
        int ans = 0;
        for(int j = 0 ;j<arr.length ;j++){
            sum += arr[j];
            if(map.containsKey(sum-k)){
                ans += map.get(sum -k);
            }
            map.put(sum,map.getOrDefault(sum, 0)+1);
        }
        System.out.println("my ans is " +ans);

    }
}
