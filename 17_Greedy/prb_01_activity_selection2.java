import java.util.*;

public class prb_01_activity_selection2 {
    public static void main(String[] args) {
        // create the two array for both activity ..
        int start[] = { 1, 3, 0, 5, 8, 5 }; // this is start time activity..
        int end[] = { 2, 4, 6, 7, 9, 9 }; // this is the end time activity..

        //if end array is not sorted..
        //create an 2D array..
        int activities[][] = new int[start.length][3];  //this 3 is for column. 
        //1st-->Index .2nd-->start .3rd-->end..
        for(int i = 0;i<start.length ;i++){
            activities[i][0]= i; //after sorting finding the org array index..
            activities[i][1]= start[i];
            activities[i][2]= end [i];

        }
        //sort the 2D array..
        Arrays.sort(activities,Comparator.comparingDouble(o -> o[2])); //this is called LAMDA FUN.
        //Why write 2 --> sorting perform column no 2 basis which is end act array..

        
        int maxAct = 0; // initilize max activity with 0..
        ArrayList<Integer> ans = new ArrayList<>();// to store activity index create an Arraylist..

        // choose first Activity always because it will be finished asap..
        maxAct = 1; // Though i choose first act so maxAct will be 1..
        ans.add(activities[0][0]); 
        int last_Act_end = activities[0][2]; // 1st act end time..

        // for the rest act..
        for (int i = 1; i < end.length; i++) {
            // when we select the activity --> starting act start time is greater or equal
            // to prev act end time ..
            if (activities[i][1] >= last_Act_end) {
                //select my act..
                maxAct++; //maxact is updated..
                ans.add(activities[i][0]); 
                last_Act_end = activities[i][2]; //updated last activity end..
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
