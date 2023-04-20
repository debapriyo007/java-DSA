public class doublyLL {

    // creating Node ...
    public class Node {
        int data;
        Node next;
        Node prev;

        // creating cons..
        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;

    // add first..

    public void addFirst(int data) {
        // creating node..
        Node newnode = new Node(data);
        if (head == null) {
            head = tail = newnode;
            return;
        }
        newnode.next = head;
        head.prev = newnode;
        head = newnode;
    }

    // add last..
    public void addLast(int data) {
        // create node at first..

        Node newnode = new Node(data);
        if (head == null) {
            head = tail = newnode;
            return;
        }
        tail.next = newnode;
        newnode.prev = tail;

    }

    // Remove first..
    public int removefirst() {
        if (head == null) {
            System.out.println("The linklist is empty!");
            return Integer.MIN_VALUE;
        }
        // calculate size..
        int size = 0;
        Node tem = head;
        while (tem != null) {
            tem = tem.next;
            size++;
        }
        // base case.. if one node exists..
        if (size == 1) {
            int val = head.data;
            head = tail = null;
            return val;
        }

        int val = head.data;
        head = head.next;
        head.prev = null;
        return val;
    }

    public void removeLast() {
        if (head == null) {
            System.out.println("The LinkedList is Empty!");
            return;
        }
        tail = tail.prev;
        tail.next.prev = null;
        tail.next = null;
        return;

    }

    // remove last..
    // public int removelast(){

    // //base case..
    // if(head == null){
    // System.out.println("Linklist is empty!!");
    // return Integer.MIN_VALUE;

    // }

    // int val = tail.data;
    // tail = tail.prev;
    // tail.next = null;
    // return val;
    // }

    // printing fun..

    public void printll() {
        if (head == null) {
            System.out.println("The linklist is empty!");
            return;
        }
        Node tem = head;
        while (tem != null) {
            System.out.print(tem.data + "<-->");
            tem = tem.next;
        }
        System.out.println("null");
    }

    // Reverse doubly linklist...
    public void reverse() {
        Node prev = null;
        Node curr = head;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            curr.prev = next;

            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public static void main(String[] args) {
        // obj creating..

        doublyLL dll = new doublyLL();
        dll.addFirst(5);
        dll.addFirst(4);
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.addLast(69);
        dll.printll();
        dll.removefirst();
        dll.printll();
        dll.removeLast();
        dll.printll();
        // here reverse the linklist..
        // dll.reverse();
        // dll.printll();

    }

}
