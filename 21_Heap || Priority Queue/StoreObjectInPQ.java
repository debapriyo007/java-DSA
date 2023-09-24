import java.util.Comparator;
import java.util.PriorityQueue;

public class StoreObjectInPQ {
    /* When we have to define the priority in class then we need to implement a special
     interface the name of the interface is compareable  */
    static class Student implements Comparable<Student>{
        String name;
        int rank;

        //constructor.
        public Student(String name , int rank){
            this.name = name;
            this.rank = rank;
        }

        /* If there is a Methord in Parent class same methord is implement by child class 
           called Methord Overriding.
          */

        @Override
        public int compareTo(Student s2){  /*If compareTo methord return 0(Zero) means,
            my element are same. If return +ve value means first element is greater , If 
            return -ve value then first element is smaller. */
            
             return this.rank - s2.rank;//We have to sort base on rank.
        }  
    }
    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>();
        pq.add(new Student("Diviya", 1200));
        pq.add(new Student("Dipu", 500));
        pq.add(new Student("Debu", 90));
        pq.add(new Student("Deboshree", 200));
        pq.add(new Student("Debrath", 10));

        while(!pq.isEmpty()){
            System.out.println(pq.peek().name +" -> " + pq.peek().rank);
            pq.remove();
        }
    }
}
