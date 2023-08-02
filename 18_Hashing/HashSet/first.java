import java.util.*;

public class first {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(4);
        set.add(1);
        set.add(2);

        System.out.println(set);

        //calculate the size of the set..
       System.out.println(set.size()); 

       //this is remove object element from set..
        set.remove(2);

        if(set.contains(2)){
            System.out.println("Object exists!");
        }else{
            System.out.println("Not exists!");
        }

        //clear function..
        // set.clear();

        System.out.println(set.isEmpty());
    }
}
