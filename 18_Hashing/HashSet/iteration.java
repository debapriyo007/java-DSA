import java.util.*;

public class iteration {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();

        cities.add("Delhi");
        cities.add("Kolkata");
        cities.add("Mumbai");
        cities.add("Lahor");

        //This is Using Iterator. 
        // Iterator itr = cities.iterator();
        // while(itr.hasNext()){
        //     System.out.println(itr.next());
        // }

        //This is using Enhance for loop..
        for(String city : cities){
            System.out.println(city);
        }

    }
}
