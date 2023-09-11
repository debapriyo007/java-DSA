import java.util.*;

public class implement {
    public static void main(String[] args) {
        Deque<Integer> d = new LinkedList<>();
        d.addFirst(1); //1
        d.addFirst(2);  //2 1
        d.addFirst(3);   // 3 2 1
        System.out.println(d);
        d.addLast(0); // 3 2 1 0
        d.addLast(-1);   // 3 2 1 -1 
        d.addLast(-2);   // 3 2 1 -1 -2
        System.out.println(d);

        System.out.println("First ele : " + d.getFirst());
        System.out.println("Last ele : " + d.getLast());
    }
}
