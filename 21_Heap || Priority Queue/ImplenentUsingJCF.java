import java.util.Comparator;
import java.util.PriorityQueue;

public class ImplenentUsingJCF {
    public static void main(String[] args) {
        //PriorityQueue<Integer> pq = new PriorityQueue<>();
        //If i give the higher element higher priority .
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());


        pq.add(3);  //O(log n)
        pq.add(4);
        pq.add(1);
        pq.add(7);

        while(!pq.isEmpty()){
             System.out.println(pq.peek()); //O(1)
             pq.remove(); //O(log n)
        }
    }
}
