import java.util.*;
public class jcf {
public static void main(String[] args) {  //JCF --> Gives us Optimize code
    
    //create Linklist..
    LinkedList<Integer> ll = new LinkedList<>();

    //add linklist..
    ll.addLast(1);
    ll.addLast(2);
    ll.addLast(3);
    ll.addFirst(9);

    //printing linklist..
    System.out.println("My linklist is: ");
    System.out.println(ll);

    //remove linklist..
    ll.removeLast();
    ll.removeFirst();
    System.out.println("After removing my linklist is ");
    System.out.println(ll);


}
    
}
