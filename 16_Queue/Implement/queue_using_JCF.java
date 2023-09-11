import java.util.*;
public class queue_using_JCF {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        //Why we write Linklist?
        //--> Queue in JCF is't a class it's a inteface , so don't create any 
        //obj of queue. In JAVA queue will be implement using LINKLIST & ARRAYDEQUE 
        
        //Queue<Integer> q = new ArrayDeque<>();
        
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
