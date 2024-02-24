import java.util.*;

public class Connect_N_rope {
    public static void main(String[] args) {
        int ropes[] = { 2, 3, 3, 4,6 };
        //creating priority Queue
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        //and rope ele in to pq
        for (int i = 0; i < ropes.length; i++) {
            pq.add(ropes[i]);
        }

        int cost = 0; //cost intilize with zero
        while (pq.size() > 1) { // i will run the loop  till there is one rope is not there.
            int min = pq.remove(); //take 1st mini
            int min2 = pq.remove(); //take 2nd mini
            cost += min+min2;   // now cal the cost of two mini
            pq.add(min+min2); // again add to pq
        }
        System.out.println("My cost of connection N ropes is : "+ cost);
    }
}
