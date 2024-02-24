import java.util.*;
public class arrlist10 {

    public static void swap(ArrayList<Integer> list, int indx1, int indx2 )
    {
        int tem = list.get(indx1);
        list.set(indx1, list.get(indx2));
        list.set(indx2, tem);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);
      
        System.out.println(list);
        System.out.println("After swaping the array list:-->");
        swap(list, 1, 3);
        System.out.println(list);
        

    }
    
}
