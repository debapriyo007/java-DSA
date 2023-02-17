import java.util.*;
public class arrlist11 {
    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>();
         list.add(2);
         list.add(5);
         list.add(6);
         list.add(3);
         list.add(1);

         System.out.println(list);
         Collections.sort(list);
        //  ascending order print
        System.out.println(list);

        // print descending order

        Collections.sort(list, Collections. reverseOrder());
        System.out.println(list);
        

    }
}
