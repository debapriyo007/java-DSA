import java.util.*;
public class arrlist13 {
    public static void main(String[] args) {
        
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list1= new ArrayList<>();
        ArrayList<Integer> list2= new ArrayList<>();
        ArrayList<Integer> list3= new ArrayList<>();

        for(int i=1;i<=5;i++)
        {
            list1.add(i*1);
            list2.add(i*2);
            list3.add(i*3);
        }

        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);

        System.out.println(mainList);

        // to print using nested looop

        for(int i=0;i<mainList.size();i++)
        {
            ArrayList<Integer> currentlist= mainList.get(i);
            for(int j =0; j<currentlist.size();j++)
            {
                System.out.print(currentlist.get(j)+ " ");
            }
            System.out.println();
        }
    }
}
