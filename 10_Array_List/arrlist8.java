import java.util.*;
public class arrlist8 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // Add element.....
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // printing the reverlist..
        for(int i=list.size()-1;i>=0;i--)
        {
            System.out.print(list.get(i)+ " ");
        }
        System.out.println();

    }

}
