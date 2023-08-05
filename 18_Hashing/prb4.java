import java.util.HashMap;

public class prb4 {
    public static void main(String[] args) {
        int arr[] ={15, -2, 2 , -8, 1, 7, 10 ,23};
    
        //create a Hashmap..
        //this hashmap i store the sum and index pair.
        HashMap<Integer, Integer> map = new HashMap<>();

        //calculate the length .
        int len = 0; //intilize the length with 0..
        int sum = 0;  //intilize the sum with 0 also..

        //iterate a loop..
        for(int j = 0;j<arr.length;j++){
            //calculate the sum of i'th index ..
            sum = sum+arr[j];
            //then, check the sum is exist in the map or not..
            if(map.containsKey(sum)){
                //if exist the calculate the length and compair with j-i.
               len = Math.max(len, j-map.get(sum));
            }else{
                map.put(sum, j); //if not exist the put the sum and it's index..
            }
        }
        System.out.println("The largest subarray sum with 0 is => " + len);


    }
}
