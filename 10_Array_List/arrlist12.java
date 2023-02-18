import java.util.*;
public class arrlist12 {
 
    public static void main(String[] args) {
        
        ArrayList<ArrayList<Integer>> mainList= new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(21);
        list1.add(55);

        mainList.add(list1);

        ArrayList<Integer> list2 = new ArrayList<>();
        list1.add(100);
        list1.add(45);

        mainList.add(list2);

        for(int i=0;i<mainList.size();i++)
        {
            ArrayList<Integer> currentList = mainList.get(i);
            for(int j =0;j<currentList.size();j++)
            {
                System.out.print(currentList.get(j)+ " ");
            }
            System.out.println();
        }
        System.out.println(mainList);

    }
}
