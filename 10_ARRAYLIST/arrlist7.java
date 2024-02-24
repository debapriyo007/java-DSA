
// printing the in Arrat list...
import java.util.*;

public class arrlist7 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println("The arrayList size is:"+list.size());

        // printing array list
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
         System.out.println();
    }

}
