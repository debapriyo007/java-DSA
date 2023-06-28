import java.util.*;
public class job_sequencing {
    static class Job{
        int deadline;
        int profit;
        int id; 

        //creating constructor..
        public Job(int i , int d, int p){
            id = i;
            profit = p;
            deadline = d;
        }
    }
    public static void main(String[] args) {
        int jobsInfo[][]= {{4,20},{1,10},{1,40},{1,30}};  //first is indicate jobs deadlne.Second indicate profit.. 
        
        //creating objects arraylist..
       ArrayList<Job> jobs = new ArrayList<>();

        //insert data.
        for(int i = 0 ;i<jobsInfo.length ;i++){
            jobs.add(new Job(i, jobsInfo[i][0], jobsInfo[i][1]));
        }

        //sort base on profit..
        Collections.sort(jobs, (obj1,obj2)-> obj2.profit - obj1.profit);  //decending order sorting all object..

        //store all sequence..
        ArrayList<Integer> seq = new ArrayList<>();
        int time = 0;
        //comparision..
        for(int i = 0 ;i<jobs.size();i++){
            Job currJob  = jobs.get(i);
            if(currJob.deadline > time){
                seq.add(currJob.id);
                time++;
            }
        }

        //print sequence..
        System.out.println("Maximum jobs :" + seq.size());
        for(int i = 0 ;i<seq.size() ;i++){
            System.out.print(seq.get(i)+" ");
        }
        System.out.println();

    }
}
