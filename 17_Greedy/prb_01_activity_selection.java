import java.util.*;

public class prb_01_activity_selection {
    public static void main(String[] args) {
        // create the two array for both activity ..
        int start[] = { 1, 3, 0, 5, 8, 5 }; // this is start time activity..
        int end[] = { 2, 4, 6, 7, 9, 9 }; // this is the end time activity..

        // sort the end time activity..
        int maxAct = 0; // initilize max activity with 0..
        ArrayList<Integer> ans = new ArrayList<>();// to store activity index create an Arraylist..

        // choose first Activity always because it will be finished asap..
        maxAct = 1; // Though i choose first act so maxAct will be 1..
        ans.add(0); // add the 1st act index at arraylist..
        int last_Act_end = end[0]; // 1st act end time..

        // for the rest act..
        for (int i = 1; i < end.length; i++) {
            // when we select the activity --> starting act start time is greater or equal
            // to prev act end time ..
            if (start[i] >= last_Act_end) {
                //select my act..
                maxAct++; //maxact is updated..
                ans.add(i); //add to array list..
                last_Act_end = end[i]; //updated last activity end..
            }

        }
        System.out.println("The maximum activity: "+ maxAct);
        //print those act which i had selected..
        for(int i = 0; i<ans.size();i++){
            System.out.print("A"+ ans.get(i)+ " ");
        }
        System.out.println();

    }
}
