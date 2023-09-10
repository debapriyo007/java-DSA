public class imple {
    /*
         --------------------- Implement Queue Using Array-----------------------------
    
    static class Queue {
        static int arr[];
        static int size;
        static int rear;

        // constructor..
        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
        }

        // Is Empty fun..
        public static boolean isEmpty() {
            return rear == -1;
        }

        // add func..
        public static void add(int data) {
            if (rear == size - 1) {
                System.out.println("My Queue is Full!!");
                return;
            }
            rear++;
            arr[rear] = data;
        }

        // remove 
        //Remove Takes 0(N) time Complexity..
        public static int remove() {
            // base case.
            if (rear == -1) {
                System.err.println("The Queue is already empty!! you cant remove..");
                return -1;
            }
            // front always be array 0th index..
            int font = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear--;
            return font;

        }

        public static int peek(){
             // base case.
            if (rear == -1) {
                System.err.println("The Queue is already empty!! you cant remove..");
                return -1;
            }
            return arr[0];
        }

    }*/

     //------------------------- Implement Queue Using LinkList ------------------------

     
    static class Node {
        int data;
        Node next;

        //constructor..
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static class Queue{
        static Node head = null;
        static Node tail = null;

        public static boolean isEmpty(){
            return head  == null && tail == null;
        }

        //add function..
        public static void add(int data){
            //create  a Node ..
            Node newnode = new Node(data);
            //if one element exist.
            if(head == null){
                head = tail = newnode;
                return;
            }
            tail.next = newnode;
            tail = newnode;
        }

        //remove function..
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is Empty you cant be remove!");
                return -1;
            }
            int front = head.data;
            if(head ==  tail){
                tail = head = null;
            }else{
                head = head.next;
            }
            return front;
        }

        public static int peek(){
             if(isEmpty()){
                System.out.println("Queue is Empty you cant be remove!");
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        Queue q1 = new Queue();
        q1.add(1);
        q1.add(2);
        q1.add(3);

        while(!q1.isEmpty()){
            System.out.println(q1.peek());
            q1.remove();
        }

    }
}
