import java.util.*;

public class circular_Queue {

    static class Queue {
        static int arr[];
        static int size;
        static int rear;
        static int front;

        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }

        public static boolean isEmpty() {
            return rear == -1;
        }

        public static boolean isFull() {
            return (rear + 1) % size == front;
        }

        // add function..
        public static void add(int data) {
            if (isFull()) {
                System.out.println("The queue is full!");
                return;
            }
            // when add first ele.Ther rear will be -1..
            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        public static int remove() {
            if (isEmpty()) {
                System.out.println("The queue is empty!");
                return -1;
            }
            int result = arr[front];

            // last elem delete..
            if (rear == front) {
                rear = front = -1;
            } else {
                front = (front + 1) % size;
            }
            return result;

        }
        //peek function..
        public static int peek(){
            if(isEmpty()){
                System.out.println("The Queue is Empty!");
                return -1;
            }
            return arr[front]; 
        }
    }

    public static void main(String[] args) {
        Queue q  = new Queue(3);
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.remove());
        q.add(4);
        System.out.println(q.remove());
        q.add(5);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }


    }
}
