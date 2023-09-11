import java.util.*;

public class prb_05 {
    public static void interLeave(Queue<Integer> q){
        //for storing my first half create a queue..
        Queue<Integer> fstHalf = new LinkedList<>();
        //calcu size..
        int size = q.size();
        for(int i = 0 ;i<size/2 ;i++){
            fstHalf.add(q.remove());
        }
        while(!fstHalf.isEmpty()){
            q.add(fstHalf.remove());
            q.add(q.remove());
        }
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10 );

        interLeave(q);
        while( !q.isEmpty()){
            System.out.print(q.remove() + " ");
        }
        System.out.println();
    }
}
