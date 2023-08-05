import java.util.HashMap;

public class prb3 {
    //create a function to findout the Starting point..
    public static String findStart( HashMap<String ,String> map){
        //create the reverse map ..
        HashMap<String ,String> revmap = new HashMap<>();
        //put the cities in (to, From) order..
        for(String key :map.keySet()){
          revmap.put(map.get(key), key); //add the cites reverse order.
        }
        //find out the starting point..
        for(String key : map.keySet()){
            if(!revmap.containsKey(key)){ //check the cities is exist or not..
                return key; //return the cities..
            }
        }
        return null; //staring cities is always exist , to handel the error we are return null..


    }
    public static void main(String[] args) {
        HashMap<String ,String> map = new HashMap<>();
        map.put("Chennai", "Bengaluru");
        map.put("Mumbai", "Delhi");
        map.put("Goa", "Chennai");
        map.put("Delhi", "Goa");

        String start = findStart(map); //call the function..
        System.out.print(start); //print the starting cities..
        //print the other cities we excute the loop..

        for(String key :map.keySet()){
            System.out.print("-->" + map.get(start));
            //update the starting destination..
            start = map.get(start);

        }
        System.out.println();
         
    }
}
