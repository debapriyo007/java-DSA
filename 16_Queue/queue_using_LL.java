import java.util.*;
public class queue_using_LL {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    //queue class..
    static class Queue{
        static Node head = null;
        static Node tail  = null;

        public static boolean isEmpty(){
            return head == null && tail == null;
        }

        //add function ..
        public static void add(int data){
            //create new node..
            Node newNode = new Node(data);
            if(head == null){
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode ; 
        }

        //Remove fun..
        public static int remove(){
            if(isEmpty()){
                System.out.println("The queue is Empty!");
                return -1;
            }
            int front = head.data;

            //single element..
            if(tail == head){
                tail = head = null;
            }else{
                head = head.next;
            }
            return front; 

        }
        //peek function..
        public static int peek(){
            if(isEmpty()){
                System.out.println("The Queue is Empty!");
                return -1;
            }
            return head.data; 
        }

    }
    public static void main(String[] args) {
        Queue q  = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
       
        

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
